/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.db.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import tr.kasim.crm.db.Session;
import tr.kasim.crm.model.Firma;
/**
 *
 * @author SelmanKasim
 */
public class FirmaDao extends CommonDao<Firma>{
    
    public List<Firma> getCompanyNameById(Session session, Integer id) {
        EntityManager entityManager = session.getEntityManager();
        Query query = entityManager.createQuery("SELECT f FROM Firma f WHERE f.pkFirma = :firma");
        query.setParameter("firma", id);
        return query.getResultList();
    }
    
    public Firma getCompanyById(Session session, Integer userId) {
        EntityManager entityManager = session.getEntityManager();
        Query query = entityManager.createQuery("SELECT f FROM Firma f WHERE f.pkFirma = :userId");
        query.setParameter("userId", userId);
       return (Firma) getSingleResult(query.getResultList());
    }
    
   
    


}
