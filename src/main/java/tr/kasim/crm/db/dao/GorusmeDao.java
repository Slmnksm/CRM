/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.db.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import tr.kasim.crm.db.Session;
import tr.kasim.crm.model.Gorusme;

/**
 *
 * @author SelmanKasim
 */
public class GorusmeDao extends CommonDao<Gorusme>{
    
    
    public Gorusme getMeetingById(Session session, Integer userId) {
        EntityManager entityManager = session.getEntityManager();
        Query query = entityManager.createQuery("SELECT g FROM Gorusme g WHERE g.pkGorusme = :userId");
        query.setParameter("userId", userId);
       return (Gorusme) getSingleResult(query.getResultList());
    }
}
