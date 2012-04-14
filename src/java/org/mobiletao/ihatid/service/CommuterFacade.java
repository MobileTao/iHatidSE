/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mobiletao.ihatid.service;

import com.sun.jersey.api.spring.Autowire;
import com.sun.jersey.spi.resource.Singleton;
import java.net.URI;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.mobiletao.ihatid.beans.DataUserProfile;
import org.mobiletao.ihatid.beans.DataUsers;
import org.mobiletao.ihatid.beans.DataUsersRequest;
import org.mobiletao.ihatid.beans.RegisterUserBean;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Deo
 */
@Path("/commuter")
@Singleton
@Autowire
public class CommuterFacade {
    @PersistenceContext(unitName = "iHatidSEPU")
//    @Error("Please fix your project manually, for instructions see http://wiki.netbeans.org/SpringWithAopalliance")
    protected EntityManager entityManager;

    public CommuterFacade() {
    }
    
    /**
     * This method gets user login information and returns to client
     * @param entity
     * @return 
     */
    @Path("/post/login")
    @POST
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/json"})
    @Transactional
    public DataUsers getLogin(DataUsers entity) {
        try {
            Query query = entityManager.createQuery("SELECT object(o) FROM DataUsers AS o where o.username='"
                    + entity.getUsername() + "' and o.password='" + entity.getPassword() + "'");
            return (DataUsers) query.getSingleResult();
        } finally {
            entityManager.close();
        }
//        entityManager.persist(entity);
//        return Response.created(URI.create(entity.getId().toString())).build();
    }
    
    /**
     * This method registers the user
     * @param entity
     * @return 
     */
    @Path("/post/register")
    @POST
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/json"})
    @Transactional
    public Response registerUser(RegisterUserBean entity) {
        
        //create UserProfile
        DataUserProfile dup = new DataUserProfile();
        dup.setEmailAdd(entity.getEmailAddress());
        dup.setFirstName(entity.getFirstName());
        dup.setLastName(entity.getLastName());
        dup.setRegIp(entity.getRegIP());
        
        //get last id
        List<DataUserProfile> DUPList = this.findAllDUP();
        if(DUPList.size() < 1){
            dup.setId(1);
        }else{
            dup.setId(DUPList.get(DUPList.size() - 1).getId() + 1);
        }
        
        entityManager.persist(dup);
        Response.created(URI.create(dup.getId().toString())).build();
        
        //create User
        DataUsers du = new DataUsers();
        du.setUsername(entity.getUsername());
        du.setPassword(entity.getPassword());
        du.setUserProfileId(dup.getId());
        //get last id
        List<DataUsers> DUList = this.findAllDU();
        if(DUList.size() < 1){
          du.setId(1);  
        }else{
            du.setId(DUList.get(DUList.size() - 1).getId() + 1);
        }
        
        entityManager.persist(du);
        return Response.created(URI.create(du.getId().toString())).build();
    }
    
    /*
     * This method handles request for hatid
     * @param entity
     * @return
     */
    @Path("/post/hatid")
    @POST
    @Consumes({"application/xml", "application/json"})
    @Produces({"application/json"})
    @Transactional
    public Response hatidRequest(DataUsersRequest entity){
        entityManager.persist(entity);
        return Response.created(URI.create(entity.getId().toString())).build();
    }
    
    public List<DataUserProfile> findAllDUP() {
        return findDUP(true, -1, -1);
    }
    
    public List<DataUsers> findAllDU() {
        return findDU(true, -1, -1);
    }
    
    public List<DataUsersRequest> findAllDUR() {
        return findDUR(true, -1, -1);
    }
    
    private List<DataUserProfile> findDUP(boolean all, int maxResults, int firstResult) {
        try {
            Query query = entityManager.createQuery("SELECT object(o) FROM DataUserProfile AS o");
            if (!all) {
                query.setMaxResults(maxResults);
                query.setFirstResult(firstResult);
            }
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }
    
    private List<DataUsers> findDU(boolean all, int maxResults, int firstResult) {
        try {
            Query query = entityManager.createQuery("SELECT object(o) FROM DataUsers AS o");
            if (!all) {
                query.setMaxResults(maxResults);
                query.setFirstResult(firstResult);
            }
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }
    
    private List<DataUsersRequest> findDUR(boolean all, int maxResults, int firstResult) {
        try {
            Query query = entityManager.createQuery("SELECT object(o) FROM DataUsersRequest AS o");
            if (!all) {
                query.setMaxResults(maxResults);
                query.setFirstResult(firstResult);
            }
            return query.getResultList();
        } finally {
            entityManager.close();
        }
    }
}
