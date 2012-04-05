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
@Table(name = "dataUsers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DataUsers.findAll", query = "SELECT d FROM DataUsers d"),
    @NamedQuery(name = "DataUsers.findById", query = "SELECT d FROM DataUsers d WHERE d.id = :id"),
    @NamedQuery(name = "DataUsers.findByUserProfileId", query = "SELECT d FROM DataUsers d WHERE d.userProfileId = :userProfileId"),
    @NamedQuery(name = "DataUsers.findByUsername", query = "SELECT d FROM DataUsers d WHERE d.username = :username"),
    @NamedQuery(name = "DataUsers.findByPassword", query = "SELECT d FROM DataUsers d WHERE d.password = :password"),
    @NamedQuery(name = "DataUsers.findByLastLoginIp", query = "SELECT d FROM DataUsers d WHERE d.lastLoginIp = :lastLoginIp"),
    @NamedQuery(name = "DataUsers.findByUserType", query = "SELECT d FROM DataUsers d WHERE d.userType = :userType")})
public class DataUsers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "user_profile_id")
    private Integer userProfileId;
    @Size(max = 50)
    @Column(name = "username")
    private String username;
    @Size(max = 50)
    @Column(name = "password")
    private String password;
    @Size(max = 50)
    @Column(name = "last_login_ip")
    private String lastLoginIp;
    @Column(name = "user_type")
    private Integer userType;

    public DataUsers() {
    }

    public DataUsers(Integer id) {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
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
        if (!(object instanceof DataUsers)) {
            return false;
        }
        DataUsers other = (DataUsers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.mobiletao.ihatid.DataUsers[ id=" + id + " ]";
    }
    
}
