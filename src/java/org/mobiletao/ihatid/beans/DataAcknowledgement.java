/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mobiletao.ihatid.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Deo
 */
@Entity
@Table(name = "dataAcknowledgement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DataAcknowledgement.findAll", query = "SELECT d FROM DataAcknowledgement d"),
    @NamedQuery(name = "DataAcknowledgement.findById", query = "SELECT d FROM DataAcknowledgement d WHERE d.id = :id"),
    @NamedQuery(name = "DataAcknowledgement.findByRequestId", query = "SELECT d FROM DataAcknowledgement d WHERE d.requestId = :requestId"),
    @NamedQuery(name = "DataAcknowledgement.findByUserId", query = "SELECT d FROM DataAcknowledgement d WHERE d.userId = :userId"),
    @NamedQuery(name = "DataAcknowledgement.findByCabDriverId", query = "SELECT d FROM DataAcknowledgement d WHERE d.cabDriverId = :cabDriverId"),
    @NamedQuery(name = "DataAcknowledgement.findByCabId", query = "SELECT d FROM DataAcknowledgement d WHERE d.cabId = :cabId"),
    @NamedQuery(name = "DataAcknowledgement.findByOperatorId", query = "SELECT d FROM DataAcknowledgement d WHERE d.operatorId = :operatorId"),
    @NamedQuery(name = "DataAcknowledgement.findByStatus", query = "SELECT d FROM DataAcknowledgement d WHERE d.status = :status"),
    @NamedQuery(name = "DataAcknowledgement.findByCreatedDate", query = "SELECT d FROM DataAcknowledgement d WHERE d.createdDate = :createdDate"),
    @NamedQuery(name = "DataAcknowledgement.findByCreatedBy", query = "SELECT d FROM DataAcknowledgement d WHERE d.createdBy = :createdBy"),
    @NamedQuery(name = "DataAcknowledgement.findByModifiedDate", query = "SELECT d FROM DataAcknowledgement d WHERE d.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "DataAcknowledgement.findByModifiedBy", query = "SELECT d FROM DataAcknowledgement d WHERE d.modifiedBy = :modifiedBy")})
public class DataAcknowledgement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "request_id")
    private Integer requestId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "cab_driver_id")
    private Integer cabDriverId;
    @Column(name = "cab_id")
    private Integer cabId;
    @Column(name = "operator_id")
    private Integer operatorId;
    @Column(name = "status")
    private Integer status;
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

    public DataAcknowledgement() {
    }

    public DataAcknowledgement(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCabDriverId() {
        return cabDriverId;
    }

    public void setCabDriverId(Integer cabDriverId) {
        this.cabDriverId = cabDriverId;
    }

    public Integer getCabId() {
        return cabId;
    }

    public void setCabId(Integer cabId) {
        this.cabId = cabId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        if (!(object instanceof DataAcknowledgement)) {
            return false;
        }
        DataAcknowledgement other = (DataAcknowledgement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mobiletao.ihatid.DataAcknowledgement[ id=" + id + " ]";
    }
    
}
