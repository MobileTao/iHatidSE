/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mobiletao.ihatid.beans;

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
@Table(name = "tblUserType")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblUserType.findAll", query = "SELECT t FROM TblUserType t"),
    @NamedQuery(name = "TblUserType.findById", query = "SELECT t FROM TblUserType t WHERE t.id = :id"),
    @NamedQuery(name = "TblUserType.findByTypeName", query = "SELECT t FROM TblUserType t WHERE t.typeName = :typeName"),
    @NamedQuery(name = "TblUserType.findByDescription", query = "SELECT t FROM TblUserType t WHERE t.description = :description")})
public class TblUserType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "type_name")
    private String typeName;
    @Size(max = 100)
    @Column(name = "description")
    private String description;

    public TblUserType() {
    }

    public TblUserType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof TblUserType)) {
            return false;
        }
        TblUserType other = (TblUserType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mobiletao.ihatid.TblUserType[ id=" + id + " ]";
    }
    
}
