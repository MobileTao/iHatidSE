/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mobiletao.ihatid;

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
@Table(name = "dataUserProfile")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DataUserProfile.findAll", query = "SELECT d FROM DataUserProfile d"),
    @NamedQuery(name = "DataUserProfile.findById", query = "SELECT d FROM DataUserProfile d WHERE d.id = :id"),
    @NamedQuery(name = "DataUserProfile.findByEmailAdd", query = "SELECT d FROM DataUserProfile d WHERE d.emailAdd = :emailAdd"),
    @NamedQuery(name = "DataUserProfile.findByFirstName", query = "SELECT d FROM DataUserProfile d WHERE d.firstName = :firstName"),
    @NamedQuery(name = "DataUserProfile.findByLastName", query = "SELECT d FROM DataUserProfile d WHERE d.lastName = :lastName"),
    @NamedQuery(name = "DataUserProfile.findByRegIp", query = "SELECT d FROM DataUserProfile d WHERE d.regIp = :regIp"),
    @NamedQuery(name = "DataUserProfile.findByRegDate", query = "SELECT d FROM DataUserProfile d WHERE d.regDate = :regDate"),
    @NamedQuery(name = "DataUserProfile.findByCreatedDate", query = "SELECT d FROM DataUserProfile d WHERE d.createdDate = :createdDate"),
    @NamedQuery(name = "DataUserProfile.findByCreatedBy", query = "SELECT d FROM DataUserProfile d WHERE d.createdBy = :createdBy"),
    @NamedQuery(name = "DataUserProfile.findByModifiedDate", query = "SELECT d FROM DataUserProfile d WHERE d.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "DataUserProfile.findByModifiedBy", query = "SELECT d FROM DataUserProfile d WHERE d.modifiedBy = :modifiedBy")})
public class DataUserProfile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email_add")
    private String emailAdd;
    @Size(max = 50)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 50)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 50)
    @Column(name = "reg_ip")
    private String regIp;
    @Column(name = "reg_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regDate;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "created_by")
    private int createdBy;
    @Column(name = "modified_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "modified_by")
    private int modifiedBy;

    public DataUserProfile() {
    }

    public DataUserProfile(Integer id) {
        this.id = id;
    }

    public DataUserProfile(Integer id, String emailAdd, int createdBy, int modifiedBy) {
        this.id = id;
        this.emailAdd = emailAdd;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(int modifiedBy) {
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
        if (!(object instanceof DataUserProfile)) {
            return false;
        }
        DataUserProfile other = (DataUserProfile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mobiletao.ihatid.DataUserProfile[ id=" + id + " ]";
    }
    
}
