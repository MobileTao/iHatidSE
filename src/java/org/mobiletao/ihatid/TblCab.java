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
@Table(name = "tblCab")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCab.findAll", query = "SELECT t FROM TblCab t"),
    @NamedQuery(name = "TblCab.findById", query = "SELECT t FROM TblCab t WHERE t.id = :id"),
    @NamedQuery(name = "TblCab.findByOperatorId", query = "SELECT t FROM TblCab t WHERE t.operatorId = :operatorId"),
    @NamedQuery(name = "TblCab.findByPlateNumber", query = "SELECT t FROM TblCab t WHERE t.plateNumber = :plateNumber"),
    @NamedQuery(name = "TblCab.findByColor", query = "SELECT t FROM TblCab t WHERE t.color = :color"),
    @NamedQuery(name = "TblCab.findByModel", query = "SELECT t FROM TblCab t WHERE t.model = :model"),
    @NamedQuery(name = "TblCab.findByChassisNo", query = "SELECT t FROM TblCab t WHERE t.chassisNo = :chassisNo"),
    @NamedQuery(name = "TblCab.findByRegNo", query = "SELECT t FROM TblCab t WHERE t.regNo = :regNo"),
    @NamedQuery(name = "TblCab.findByCabType", query = "SELECT t FROM TblCab t WHERE t.cabType = :cabType")})
public class TblCab implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "operator_id")
    private Integer operatorId;
    @Size(max = 50)
    @Column(name = "plate_number")
    private String plateNumber;
    @Size(max = 50)
    @Column(name = "color")
    private String color;
    @Size(max = 50)
    @Column(name = "model")
    private String model;
    @Size(max = 50)
    @Column(name = "chassis_no")
    private String chassisNo;
    @Size(max = 50)
    @Column(name = "reg_no")
    private String regNo;
    @Size(max = 50)
    @Column(name = "cab_type")
    private String cabType;

    public TblCab() {
    }

    public TblCab(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
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
        if (!(object instanceof TblCab)) {
            return false;
        }
        TblCab other = (TblCab) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mobiletao.ihatid.TblCab[ id=" + id + " ]";
    }
    
}
