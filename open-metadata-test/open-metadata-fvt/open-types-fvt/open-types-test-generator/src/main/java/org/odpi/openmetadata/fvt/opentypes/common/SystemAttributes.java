/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.fvt.opentypes.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.odpi.openmetadata.repositoryservices.connectors.stores.metadatacollectionstore.properties.instances.InstanceStatus;

import java.io.Serializable;
import java.util.Date;


/**
 * These are the core ' system' attributes
 */
@JsonAutoDetect(getterVisibility= JsonAutoDetect.Visibility.PUBLIC_ONLY, setterVisibility= JsonAutoDetect.Visibility.PUBLIC_ONLY, fieldVisibility= JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown=true)
public class SystemAttributes implements Serializable {
    protected static final long serialVersionUID = 1L;
    /*
     * system attributes
     */
    private String GUID  = null;
    private InstanceStatus status     = null;
    private String createdBy  = null;
    private String updatedBy  = null;
    private Date createTime   = null;
    private Date updateTime   = null;
    private Long version    = null;

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    /**
     * Status indicates the status of the object - the values are specified in the Status enumeration
     * @return status of the object
     */
    public InstanceStatus getStatus() {
        return status;
    }

    public void setStatus(InstanceStatus status) {
        this.status = status;
    }

    /**
     * User who created this object
     * @return user who created this.
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * User who last updated this object
     * @return use who last updated this
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * The time at which this object was created.
     * @return date
     */
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
     * The time at which this object was last updated.
     * @return date
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * version of the object.
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public StringBuilder toString(StringBuilder sb)
    {
        if (sb == null) {
            sb = new StringBuilder();
        }
        sb.append("GUID="+GUID+",");
        sb.append("status="+this.status+",");
        sb.append("createdBy="+createdBy+",");
        sb.append("updatedBy="+updatedBy+",");
        sb.append("createTime="+createTime+",");
        sb.append("updateTime="+ updateTime  +",");
        sb.append("version="+version   +",");
        return sb;
    }
}
