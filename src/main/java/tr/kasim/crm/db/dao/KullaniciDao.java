/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.db.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import tr.kasim.crm.db.Session;
import tr.kasim.crm.model.SistemKullanici;

/**
 *
 * @author SelmanKasim
 */
public class KullaniciDao extends CommonDao<SistemKullanici>{
    
     public SistemKullanici getByUserName(Session session, String userName) {
        EntityManager entityManager = session.getEntityManager();
        Query query = entityManager.createQuery("SELECT s FROM SistemKullanici s WHERE s.kullaniciad = :kullaniciAdi");
        query.setParameter("kullaniciAdi", userName);
        return (SistemKullanici) getSingleResult(query.getResultList());
    }
}
