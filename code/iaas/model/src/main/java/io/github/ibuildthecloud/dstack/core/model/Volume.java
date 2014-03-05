/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "volume", schema = "dstack")
public interface Volume extends java.io.Serializable {

	/**
	 * Setter for <code>dstack.volume.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.volume.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>dstack.volume.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>dstack.volume.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>dstack.volume.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.volume.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>dstack.volume.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>dstack.volume.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>dstack.volume.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>dstack.volume.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>dstack.volume.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>dstack.volume.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>dstack.volume.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>dstack.volume.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>dstack.volume.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>dstack.volume.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>dstack.volume.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>dstack.volume.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>dstack.volume.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>dstack.volume.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>dstack.volume.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>dstack.volume.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>dstack.volume.physical_size_megabytes</code>.
	 */
	public void setPhysicalSizeMegabytes(java.lang.Long value);

	/**
	 * Getter for <code>dstack.volume.physical_size_megabytes</code>.
	 */
	@javax.persistence.Column(name = "physical_size_megabytes", precision = 19)
	public java.lang.Long getPhysicalSizeMegabytes();

	/**
	 * Setter for <code>dstack.volume.virtual_size_megabytes</code>.
	 */
	public void setVirtualSizeMegabytes(java.lang.Long value);

	/**
	 * Getter for <code>dstack.volume.virtual_size_megabytes</code>.
	 */
	@javax.persistence.Column(name = "virtual_size_megabytes", precision = 19)
	public java.lang.Long getVirtualSizeMegabytes();

	/**
	 * Setter for <code>dstack.volume.device_number</code>.
	 */
	public void setDeviceNumber(java.lang.Integer value);

	/**
	 * Getter for <code>dstack.volume.device_number</code>.
	 */
	@javax.persistence.Column(name = "device_number", precision = 10)
	public java.lang.Integer getDeviceNumber();

	/**
	 * Setter for <code>dstack.volume.format</code>.
	 */
	public void setFormat(java.lang.String value);

	/**
	 * Getter for <code>dstack.volume.format</code>.
	 */
	@javax.persistence.Column(name = "format", length = 255)
	public java.lang.String getFormat();

	/**
	 * Setter for <code>dstack.volume.allocation_state</code>.
	 */
	public void setAllocationState(java.lang.String value);

	/**
	 * Getter for <code>dstack.volume.allocation_state</code>.
	 */
	@javax.persistence.Column(name = "allocation_state", length = 255)
	public java.lang.String getAllocationState();

	/**
	 * Setter for <code>dstack.volume.attached_state</code>.
	 */
	public void setAttachedState(java.lang.String value);

	/**
	 * Getter for <code>dstack.volume.attached_state</code>.
	 */
	@javax.persistence.Column(name = "attached_state", length = 255)
	public java.lang.String getAttachedState();

	/**
	 * Setter for <code>dstack.volume.instance_id</code>.
	 */
	public void setInstanceId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.volume.instance_id</code>.
	 */
	@javax.persistence.Column(name = "instance_id", precision = 19)
	public java.lang.Long getInstanceId();

	/**
	 * Setter for <code>dstack.volume.image_id</code>.
	 */
	public void setImageId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.volume.image_id</code>.
	 */
	@javax.persistence.Column(name = "image_id", precision = 19)
	public java.lang.Long getImageId();

	/**
	 * Setter for <code>dstack.volume.offering_id</code>.
	 */
	public void setOfferingId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.volume.offering_id</code>.
	 */
	@javax.persistence.Column(name = "offering_id", precision = 19)
	public java.lang.Long getOfferingId();

	/**
	 * Setter for <code>dstack.volume.zone_id</code>.
	 */
	public void setZoneId(java.lang.Long value);

	/**
	 * Getter for <code>dstack.volume.zone_id</code>.
	 */
	@javax.persistence.Column(name = "zone_id", precision = 19)
	public java.lang.Long getZoneId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface Volume
	 */
	public void from(io.github.ibuildthecloud.dstack.core.model.Volume from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface Volume
	 */
	public <E extends io.github.ibuildthecloud.dstack.core.model.Volume> E into(E into);
}
