/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mobiletao.ihatid.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Deo
 */
@Entity
@Table(name = "dataRideIn")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DataRideIn.findAll", query = "SELECT d FROM DataRideIn d"),
    @NamedQuery(name = "DataRideIn.findById", query = "SELECT d FROM DataRideIn d WHERE d.id = :id"),
    @NamedQuery(name = "DataRideIn.findByUserId", query = "SELECT d FROM DataRideIn d WHERE d.userId = :userId"),
    @NamedQuery(name = "DataRideIn.findByCabId", query = "SELECT d FROM DataRideIn d WHERE d.cabId = :cabId"),
    @NamedQuery(name = "DataRideIn.findByMessage", query = "SELECT d FROM DataRideIn d WHERE d.message = :message"),
    @NamedQuery(name = "DataRideIn.findByCreatedDate", query = "SELECT d FROM DataRideIn d WHERE d.createdDate = :createdDate"),
    @NamedQuery(name = "DataRideIn.findByCreatedBy", query = "SELECT d FROM DataRideIn d WHERE d.createdBy = :createdBy"),
    @NamedQuery(name = "DataRideIn.findByModifiedDate", query = "SELECT d FROM DataRideIn d WHERE d.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "DataRideIn.findByModifiedBy", query = "SELECT d FROM DataRideIn d WHERE d.modifiedBy = :modifiedBy")})
public class DataRideIn implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "cab_id")
    private Integer cabId;
    @Size(max = 500)
    @Column(name = "message")
    private String message;
    @Lob
    @Column(name = "is_Fb_posted")
    private byte[] isFbposted;
    @Lob
    @Column(name = "is_twitter_posted")
    private byte[] isTwitterPosted;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "modified_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @Column(name = "modified_by")
    private Integer modifiedBy;

    public DataRideIn() {
    }

    public DataRideIn(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCabId() {
        return cabId;
    }

    public void setCabId(Integer cabId) {
        this.cabId = cabId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public byte[] getIsFbposted() {
        return isFbposted;
    }

    public void setIsFbposted(byte[] isFbposted) {
        this.isFbposted = isFbposted;
    }

    public byte[] getIsTwitterPosted() {
        return isTwitterPosted;
    }

    public void setIsTwitterPosted(byte[] isTwitterPosted) {
        this.isTwitterPosted = isTwitterPosted;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataRideIn)) {
            return false;
        }
        DataRideIn other = (DataRideIn) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mobiletao.ihatid.DataRideIn[ id=" + id + " ]";
    }
    
}
