package io.github.ibuildthecloud.dstack.eventing.memory;

import io.github.ibuildthecloud.dstack.eventing.impl.AbstractThreadPoolingEventService;
import io.github.ibuildthecloud.dstack.eventing.model.Event;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.util.concurrent.SettableFuture;

public class InMemoryEventService extends AbstractThreadPoolingEventService {

    private static final Logger log = LoggerFactory.getLogger(InMemoryEventService.class);

    @Override
    protected boolean doPublish(final String name, final Event event, final String eventString) throws IOException {
        getDefaultExecutor().execute(new Runnable() {
            @Override
            public void run() {
                /* Don't send events we know there are no listeners for.
                 * This emulates the behavior of endpoints only getting what they've subscribed to.
                 */
                if ( getEventListeners(event).size() > 0 ) {
                    onEvent(null, name, eventString);
                }
            }
        });

        return true;
    }

    @Override
    protected void doSubscribe(String eventName, SettableFuture<?> future) {
        log.info("Subscribing to [{}]", eventName);
        future.set(null);
    }

    @Override
    protected void doUnsubscribe(String eventName) {
        log.info("Unsubscribing from [{}]", eventName);
    }

    @Override
    protected void disconnect() {
    }

}
