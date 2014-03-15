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
public class VolumeTable extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord> {

	private static final long serialVersionUID = 1063861624;

	/**
	 * The singleton instance of <code>dstack.volume</code>
	 */
	public static final io.github.ibuildthecloud.dstack.core.model.tables.VolumeTable VOLUME = new io.github.ibuildthecloud.dstack.core.model.tables.VolumeTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord.class;
	}

	/**
	 * The column <code>dstack.volume.id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>dstack.volume.name</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>dstack.volume.account_id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dstack.volume.kind</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>dstack.volume.uuid</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>dstack.volume.description</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>dstack.volume.state</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>dstack.volume.created</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>dstack.volume.removed</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>dstack.volume.remove_time</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>dstack.volume.data</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(16777215).asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>dstack.volume.physical_size_mb</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.Long> PHYSICAL_SIZE_MB = createField("physical_size_mb", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dstack.volume.virtual_size_mb</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.Long> VIRTUAL_SIZE_MB = createField("virtual_size_mb", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dstack.volume.device_number</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.Integer> DEVICE_NUMBER = createField("device_number", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>dstack.volume.format</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.String> FORMAT = createField("format", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>dstack.volume.allocation_state</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.String> ALLOCATION_STATE = createField("allocation_state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>dstack.volume.attached_state</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.String> ATTACHED_STATE = createField("attached_state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>dstack.volume.instance_id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.Long> INSTANCE_ID = createField("instance_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dstack.volume.image_id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.Long> IMAGE_ID = createField("image_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dstack.volume.offering_id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.Long> OFFERING_ID = createField("offering_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dstack.volume.zone_id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.Long> ZONE_ID = createField("zone_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>dstack.volume</code> table reference
	 */
	public VolumeTable() {
		this("volume", null);
	}

	/**
	 * Create an aliased <code>dstack.volume</code> table reference
	 */
	public VolumeTable(java.lang.String alias) {
		this(alias, io.github.ibuildthecloud.dstack.core.model.tables.VolumeTable.VOLUME);
	}

	private VolumeTable(java.lang.String alias, org.jooq.Table<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord> aliased) {
		this(alias, aliased, null);
	}

	private VolumeTable(java.lang.String alias, org.jooq.Table<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.IDENTITY_VOLUME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.KEY_VOLUME_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.KEY_VOLUME_PRIMARY, io.github.ibuildthecloud.dstack.core.model.Keys.KEY_VOLUME_IDX_VOLUME_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.VolumeRecord, ?>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.FK_VOLUME__ACCOUNT_ID, io.github.ibuildthecloud.dstack.core.model.Keys.FK_VOLUME__INSTANCE_ID, io.github.ibuildthecloud.dstack.core.model.Keys.FK_VOLUME__IMAGE_ID, io.github.ibuildthecloud.dstack.core.model.Keys.FK_VOLUME__OFFERING_ID, io.github.ibuildthecloud.dstack.core.model.Keys.FK_VOLUME__ZONE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.core.model.tables.VolumeTable as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.VolumeTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.github.ibuildthecloud.dstack.core.model.tables.VolumeTable rename(java.lang.String name) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.VolumeTable(name, null);
	}
}
