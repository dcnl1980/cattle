/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskInstanceTable extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord> {

	private static final long serialVersionUID = -454916978;

	/**
	 * The singleton instance of <code>dstack.task_instance</code>
	 */
	public static final io.github.ibuildthecloud.dstack.core.model.tables.TaskInstanceTable TASK_INSTANCE = new io.github.ibuildthecloud.dstack.core.model.tables.TaskInstanceTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord.class;
	}

	/**
	 * The column <code>dstack.task_instance.id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>dstack.task_instance.name</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>dstack.task_instance.task_id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord, java.lang.Long> TASK_ID = createField("task_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>dstack.task_instance.start_time</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord, java.util.Date> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>dstack.task_instance.end_time</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord, java.util.Date> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>dstack.task_instance.exception</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord, java.lang.String> EXCEPTION = createField("exception", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>dstack.task_instance.server_id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord, java.lang.String> SERVER_ID = createField("server_id", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * Create a <code>dstack.task_instance</code> table reference
	 */
	public TaskInstanceTable() {
		this("task_instance", null);
	}

	/**
	 * Create an aliased <code>dstack.task_instance</code> table reference
	 */
	public TaskInstanceTable(java.lang.String alias) {
		this(alias, io.github.ibuildthecloud.dstack.core.model.tables.TaskInstanceTable.TASK_INSTANCE);
	}

	private TaskInstanceTable(java.lang.String alias, org.jooq.Table<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord> aliased) {
		this(alias, aliased, null);
	}

	private TaskInstanceTable(java.lang.String alias, org.jooq.Table<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.IDENTITY_TASK_INSTANCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.KEY_TASK_INSTANCE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.KEY_TASK_INSTANCE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.TaskInstanceRecord, ?>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.FK_TASK_INSTANCE__TASK_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.core.model.tables.TaskInstanceTable as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.TaskInstanceTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.github.ibuildthecloud.dstack.core.model.tables.TaskInstanceTable rename(java.lang.String name) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.TaskInstanceTable(name, null);
	}
}
