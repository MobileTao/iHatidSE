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
@Table(name = "dataUsersRequest")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DataUsersRequest.findAll", query = "SELECT d FROM DataUsersRequest d"),
    @NamedQuery(name = "DataUsersRequest.findById", query = "SELECT d FROM DataUsersRequest d WHERE d.id = :id"),
    @NamedQuery(name = "DataUsersRequest.findByUserId", query = "SELECT d FROM DataUsersRequest d WHERE d.userId = :userId"),
    @NamedQuery(name = "DataUsersRequest.findByPreferredOperatorId", query = "SELECT d FROM DataUsersRequest d WHERE d.preferredOperatorId = :preferredOperatorId"),
    @NamedQuery(name = "DataUsersRequest.findByEstablishmentCurrent", query = "SELECT d FROM DataUsersRequest d WHERE d.establishmentCurrent = :establishmentCurrent"),
    @NamedQuery(name = "DataUsersRequest.findByStreetCurrent", query = "SELECT d FROM DataUsersRequest d WHERE d.streetCurrent = :streetCurrent"),
    @NamedQuery(name = "DataUsersRequest.findByBarangayCurrent", query = "SELECT d FROM DataUsersRequest d WHERE d.barangayCurrent = :barangayCurrent"),
    @NamedQuery(name = "DataUsersRequest.findByCityCurrent", query = "SELECT d FROM DataUsersRequest d WHERE d.cityCurrent = :cityCurrent"),
    @NamedQuery(name = "DataUsersRequest.findByLatlangCurrent", query = "SELECT d FROM DataUsersRequest d WHERE d.latlangCurrent = :latlangCurrent"),
    @NamedQuery(name = "DataUsersRequest.findByEstablishmentTarget", query = "SELECT d FROM DataUsersRequest d WHERE d.establishmentTarget = :establishmentTarget"),
    @NamedQuery(name = "DataUsersRequest.findByStreetTarget", query = "SELECT d FROM DataUsersRequest d WHERE d.streetTarget = :streetTarget"),
    @NamedQuery(name = "DataUsersRequest.findByBarangayTarget", query = "SELECT d FROM DataUsersRequest d WHERE d.barangayTarget = :barangayTarget"),
    @NamedQuery(name = "DataUsersRequest.findByCityTarget", query = "SELECT d FROM DataUsersRequest d WHERE d.cityTarget = :cityTarget"),
    @NamedQuery(name = "DataUsersRequest.findByLatlangTarget", query = "SELECT d FROM DataUsersRequest d WHERE d.latlangTarget = :latlangTarget"),
    @NamedQuery(name = "DataUsersRequest.findByIp", query = "SELECT d FROM DataUsersRequest d WHERE d.ip = :ip"),
    @NamedQuery(name = "DataUsersRequest.findByPickUpDatetime", query = "SELECT d FROM DataUsersRequest d WHERE d.pickUpDatetime = :pickUpDatetime"),
    @NamedQuery(name = "DataUsersRequest.findByWaitingTime", query = "SELECT d FROM DataUsersRequest d WHERE d.waitingTime = :waitingTime"),
    @NamedQuery(name = "DataUsersRequest.findByStatus", query = "SELECT d FROM DataUsersRequest d WHERE d.status = :status"),
    @NamedQuery(name = "DataUsersRequest.findByCreatedDate", query = "SELECT d FROM DataUsersRequest d WHERE d.createdDate = :createdDate"),
    @NamedQuery(name = "DataUsersRequest.findByCreatedBy", query = "SELECT d FROM DataUsersRequest d WHERE d.createdBy = :createdBy"),
    @NamedQuery(name = "DataUsersRequest.findByModifiedDate", query = "SELECT d FROM DataUsersRequest d WHERE d.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "DataUsersRequest.findByModifiedBy", query = "SELECT d FROM DataUsersRequest d WHERE d.modifiedBy = :modifiedBy")})
public class DataUsersRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "preferred_operator_id")
    private Integer preferredOperatorId;
    @Size(max = 100)
    @Column(name = "establishment_current")
    private String establishmentCurrent;
    @Size(max = 100)
    @Column(name = "street_current")
    private String streetCurrent;
    @Size(max = 100)
    @Column(name = "barangay_current")
    private String barangayCurrent;
    @Size(max = 100)
    @Column(name = "city_current")
    private String cityCurrent;
    @Size(max = 100)
    @Column(name = "latlang_current")
    private String latlangCurrent;
    @Size(max = 100)
    @Column(name = "establishment_target")
    private String establishmentTarget;
    @Size(max = 100)
    @Column(name = "street_target")
    private String streetTarget;
    @Size(max = 100)
    @Column(name = "barangay_target")
    private String barangayTarget;
    @Size(max = 100)
    @Column(name = "city_target")
    private String cityTarget;
    @Size(max = 100)
    @Column(name = "latlang_target")
    private String latlangTarget;
    @Size(max = 100)
    @Column(name = "ip")
    private String ip;
    @Column(name = "pick_up_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pickUpDatetime;
    @Column(name = "waiting_time")
    private Integer waitingTime;
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

    public DataUsersRequest() {
    }

    public DataUsersRequest(Integer id) {
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

    public Integer getPreferredOperatorId() {
        return preferredOperatorId;
    }

    public void setPreferredOperatorId(Integer preferredOperatorId) {
        this.preferredOperatorId = preferredOperatorId;
    }

    public String getEstablishmentCurrent() {
        return establishmentCurrent;
    }

    public void setEstablishmentCurrent(String establishmentCurrent) {
        this.establishmentCurrent = establishmentCurrent;
    }

    public String getStreetCurrent() {
        return streetCurrent;
    }

    public void setStreetCurrent(String streetCurrent) {
        this.streetCurrent = streetCurrent;
    }

    public String getBarangayCurrent() {
        return barangayCurrent;
    }

    public void setBarangayCurrent(String barangayCurrent) {
        this.barangayCurrent = barangayCurrent;
    }

    public String getCityCurrent() {
        return cityCurrent;
    }

    public void setCityCurrent(String cityCurrent) {
        this.cityCurrent = cityCurrent;
    }

    public String getLatlangCurrent() {
        return latlangCurrent;
    }

    public void setLatlangCurrent(String latlangCurrent) {
        this.latlangCurrent = latlangCurrent;
    }

    public String getEstablishmentTarget() {
        return establishmentTarget;
    }

    public void setEstablishmentTarget(String establishmentTarget) {
        this.establishmentTarget = establishmentTarget;
    }

    public String getStreetTarget() {
        return streetTarget;
    }

    public void setStreetTarget(String streetTarget) {
        this.streetTarget = streetTarget;
    }

    public String getBarangayTarget() {
        return barangayTarget;
    }

    public void setBarangayTarget(String barangayTarget) {
        this.barangayTarget = barangayTarget;
    }

    public String getCityTarget() {
        return cityTarget;
    }

    public void setCityTarget(String cityTarget) {
        this.cityTarget = cityTarget;
    }

    public String getLatlangTarget() {
        return latlangTarget;
    }

    public void setLatlangTarget(String latlangTarget) {
        this.latlangTarget = latlangTarget;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getPickUpDatetime() {
        return pickUpDatetime;
    }

    public void setPickUpDatetime(Date pickUpDatetime) {
        this.pickUpDatetime = pickUpDatetime;
    }

    public Integer getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Integer waitingTime) {
        this.waitingTime = waitingTime;
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
        if (!(object instanceof DataUsersRequest)) {
            return false;
        }
        DataUsersRequest other = (DataUsersRequest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mobiletao.ihatid.DataUsersRequest[ id=" + id + " ]";
    }
    
}
