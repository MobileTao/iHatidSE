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
@Table(name = "tblCabDriver")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCabDriver.findAll", query = "SELECT t FROM TblCabDriver t"),
    @NamedQuery(name = "TblCabDriver.findById", query = "SELECT t FROM TblCabDriver t WHERE t.id = :id"),
    @NamedQuery(name = "TblCabDriver.findByUserProfileId", query = "SELECT t FROM TblCabDriver t WHERE t.userProfileId = :userProfileId"),
    @NamedQuery(name = "TblCabDriver.findByCabId", query = "SELECT t FROM TblCabDriver t WHERE t.cabId = :cabId"),
    @NamedQuery(name = "TblCabDriver.findByLicenseNo", query = "SELECT t FROM TblCabDriver t WHERE t.licenseNo = :licenseNo"),
    @NamedQuery(name = "TblCabDriver.findByDutySched", query = "SELECT t FROM TblCabDriver t WHERE t.dutySched = :dutySched"),
    @NamedQuery(name = "TblCabDriver.findByCreatedDate", query = "SELECT t FROM TblCabDriver t WHERE t.createdDate = :createdDate"),
    @NamedQuery(name = "TblCabDriver.findByCreatedBy", query = "SELECT t FROM TblCabDriver t WHERE t.createdBy = :createdBy"),
    @NamedQuery(name = "TblCabDriver.findByModifiedDate", query = "SELECT t FROM TblCabDriver t WHERE t.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "TblCabDriver.findByModifiedBy", query = "SELECT t FROM TblCabDriver t WHERE t.modifiedBy = :modifiedBy")})
public class TblCabDriver implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_profile_id")
    private Integer userProfileId;
    @Column(name = "cab_id")
    private Integer cabId;
    @Size(max = 50)
    @Column(name = "license_no")
    private String licenseNo;
    @Size(max = 50)
    @Column(name = "duty_sched")
    private String dutySched;
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

    public TblCabDriver() {
    }

    public TblCabDriver(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(Integer userProfileId) {
        this.userProfileId = userProfileId;
    }

    public Integer getCabId() {
        return cabId;
    }

    public void setCabId(Integer cabId) {
        this.cabId = cabId;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getDutySched() {
        return dutySched;
    }

    public void setDutySched(String dutySched) {
        this.dutySched = dutySched;
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
        if (!(object instanceof TblCabDriver)) {
            return false;
        }
        TblCabDriver other = (TblCabDriver) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mobiletao.ihatid.TblCabDriver[ id=" + id + " ]";
    }
    
}
