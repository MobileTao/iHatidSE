/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mobiletao.ihatid;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Deo
 */
@Entity
@Table(name = "tblOperator")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblOperator.findAll", query = "SELECT t FROM TblOperator t"),
    @NamedQuery(name = "TblOperator.findById", query = "SELECT t FROM TblOperator t WHERE t.id = :id"),
    @NamedQuery(name = "TblOperator.findByCompanyName", query = "SELECT t FROM TblOperator t WHERE t.companyName = :companyName"),
    @NamedQuery(name = "TblOperator.findByCompanyAddress", query = "SELECT t FROM TblOperator t WHERE t.companyAddress = :companyAddress"),
    @NamedQuery(name = "TblOperator.findBySecRegistration", query = "SELECT t FROM TblOperator t WHERE t.secRegistration = :secRegistration"),
    @NamedQuery(name = "TblOperator.findByOfficeLocation", query = "SELECT t FROM TblOperator t WHERE t.officeLocation = :officeLocation"),
    @NamedQuery(name = "TblOperator.findByMobileNumber", query = "SELECT t FROM TblOperator t WHERE t.mobileNumber = :mobileNumber"),
    @NamedQuery(name = "TblOperator.findByTelNo", query = "SELECT t FROM TblOperator t WHERE t.telNo = :telNo"),
    @NamedQuery(name = "TblOperator.findByFaxNo", query = "SELECT t FROM TblOperator t WHERE t.faxNo = :faxNo"),
    @NamedQuery(name = "TblOperator.findByEmailAddress", query = "SELECT t FROM TblOperator t WHERE t.emailAddress = :emailAddress"),
    @NamedQuery(name = "TblOperator.findByContactPerson", query = "SELECT t FROM TblOperator t WHERE t.contactPerson = :contactPerson"),
    @NamedQuery(name = "TblOperator.findByContactPersonMobileNumber", query = "SELECT t FROM TblOperator t WHERE t.contactPersonMobileNumber = :contactPersonMobileNumber")})
public class TblOperator implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 500)
    @Column(name = "company_name")
    private String companyName;
    @Size(max = 100)
    @Column(name = "company_address")
    private String companyAddress;
    @Size(max = 100)
    @Column(name = "sec_registration")
    private String secRegistration;
    @Size(max = 100)
    @Column(name = "office_location")
    private String officeLocation;
    @Size(max = 15)
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Size(max = 15)
    @Column(name = "tel_no")
    private String telNo;
    @Size(max = 15)
    @Column(name = "fax_no")
    private String faxNo;
    @Size(max = 100)
    @Column(name = "email_address")
    private String emailAddress;
    @Size(max = 100)
    @Column(name = "contact_person")
    private String contactPerson;
    @Size(max = 15)
    @Column(name = "contact_person_mobile_number")
    private String contactPersonMobileNumber;

    public TblOperator() {
    }

    public TblOperator(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getSecRegistration() {
        return secRegistration;
    }

    public void setSecRegistration(String secRegistration) {
        this.secRegistration = secRegistration;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPersonMobileNumber() {
        return contactPersonMobileNumber;
    }

    public void setContactPersonMobileNumber(String contactPersonMobileNumber) {
        this.contactPersonMobileNumber = contactPersonMobileNumber;
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
        if (!(object instanceof TblOperator)) {
            return false;
        }
        TblOperator other = (TblOperator) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mobiletao.ihatid.TblOperator[ id=" + id + " ]";
    }
    
}
