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
public class ImageStoragePoolMapTable extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord> {

	private static final long serialVersionUID = 712279246;

	/**
	 * The singleton instance of <code>dstack.image_storage_pool_map</code>
	 */
	public static final io.github.ibuildthecloud.dstack.core.model.tables.ImageStoragePoolMapTable IMAGE_STORAGE_POOL_MAP = new io.github.ibuildthecloud.dstack.core.model.tables.ImageStoragePoolMapTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord.class;
	}

	/**
	 * The column <code>dstack.image_storage_pool_map.id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>dstack.image_storage_pool_map.name</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>dstack.image_storage_pool_map.kind</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>dstack.image_storage_pool_map.uuid</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>dstack.image_storage_pool_map.description</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>dstack.image_storage_pool_map.state</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>dstack.image_storage_pool_map.created</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>dstack.image_storage_pool_map.removed</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>dstack.image_storage_pool_map.remove_time</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>dstack.image_storage_pool_map.data</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(16777215).asConvertedDataType(new io.github.ibuildthecloud.dstack.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>dstack.image_storage_pool_map.image_id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.lang.Long> IMAGE_ID = createField("image_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>dstack.image_storage_pool_map.storage_pool_id</code>.
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.lang.Long> STORAGE_POOL_ID = createField("storage_pool_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>dstack.image_storage_pool_map</code> table reference
	 */
	public ImageStoragePoolMapTable() {
		this("image_storage_pool_map", null);
	}

	/**
	 * Create an aliased <code>dstack.image_storage_pool_map</code> table reference
	 */
	public ImageStoragePoolMapTable(java.lang.String alias) {
		this(alias, io.github.ibuildthecloud.dstack.core.model.tables.ImageStoragePoolMapTable.IMAGE_STORAGE_POOL_MAP);
	}

	private ImageStoragePoolMapTable(java.lang.String alias, org.jooq.Table<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord> aliased) {
		this(alias, aliased, null);
	}

	private ImageStoragePoolMapTable(java.lang.String alias, org.jooq.Table<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.IDENTITY_IMAGE_STORAGE_POOL_MAP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.KEY_IMAGE_STORAGE_POOL_MAP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.KEY_IMAGE_STORAGE_POOL_MAP_PRIMARY, io.github.ibuildthecloud.dstack.core.model.Keys.KEY_IMAGE_STORAGE_POOL_MAP_IDX_IMAGE_STORAGE_POOL_MAP_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.ImageStoragePoolMapRecord, ?>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.FK_IMAGE_STORAGE_POOL_MAP__IMAGE_ID, io.github.ibuildthecloud.dstack.core.model.Keys.FK_IMAGE_STORAGE_POOL_MAP__STORAGE_POOL_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.core.model.tables.ImageStoragePoolMapTable as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.ImageStoragePoolMapTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.github.ibuildthecloud.dstack.core.model.tables.ImageStoragePoolMapTable rename(java.lang.String name) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.ImageStoragePoolMapTable(name, null);
	}
}
