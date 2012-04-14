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
@Table(name = "dataUserFeedback")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DataUserFeedback.findAll", query = "SELECT d FROM DataUserFeedback d"),
    @NamedQuery(name = "DataUserFeedback.findById", query = "SELECT d FROM DataUserFeedback d WHERE d.id = :id"),
    @NamedQuery(name = "DataUserFeedback.findByRequestId", query = "SELECT d FROM DataUserFeedback d WHERE d.requestId = :requestId"),
    @NamedQuery(name = "DataUserFeedback.findByUserId", query = "SELECT d FROM DataUserFeedback d WHERE d.userId = :userId"),
    @NamedQuery(name = "DataUserFeedback.findByCabDriverId", query = "SELECT d FROM DataUserFeedback d WHERE d.cabDriverId = :cabDriverId"),
    @NamedQuery(name = "DataUserFeedback.findByMessage", query = "SELECT d FROM DataUserFeedback d WHERE d.message = :message"),
    @NamedQuery(name = "DataUserFeedback.findByRating", query = "SELECT d FROM DataUserFeedback d WHERE d.rating = :rating"),
    @NamedQuery(name = "DataUserFeedback.findByCreatedDate", query = "SELECT d FROM DataUserFeedback d WHERE d.createdDate = :createdDate"),
    @NamedQuery(name = "DataUserFeedback.findByCreatedBy", query = "SELECT d FROM DataUserFeedback d WHERE d.createdBy = :createdBy"),
    @NamedQuery(name = "DataUserFeedback.findByModifiedDate", query = "SELECT d FROM DataUserFeedback d WHERE d.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "DataUserFeedback.findByModifiedBy", query = "SELECT d FROM DataUserFeedback d WHERE d.modifiedBy = :modifiedBy")})
public class DataUserFeedback implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
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
    @Size(max = 500)
    @Column(name = "message")
    private String message;
    @Column(name = "rating")
    private Integer rating;
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

    public DataUserFeedback() {
    }

    public DataUserFeedback(Integer id) {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
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
        if (!(object instanceof DataUserFeedback)) {
            return false;
        }
        DataUserFeedback other = (DataUserFeedback) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mobiletao.ihatid.DataUserFeedback[ id=" + id + " ]";
    }
    
}
