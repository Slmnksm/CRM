/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.services;

import java.util.List;
import tr.kasim.crm.db.Session;
import tr.kasim.crm.db.dao.FirmaDao;
import tr.kasim.crm.model.Firma;

/**
 *
 * @author SelmanKasim
 */
public class FirmaService extends CommonService<Firma> {

    public FirmaService() {
        super(new FirmaDao());
    }

    public List<Firma> getCompanyNameById(Session session, Integer id) {
        return getDao().getCompanyNameById(session, id);
    }
    
    public Firma getCompanyById(Session session, Integer id) {
        return (Firma) getDao().getCompanyById(session, id);
    }
   
    
    public Firma saveNewCompany (Session session, Firma firma) {
        return (Firma) saveAndFlush(session, firma, Firma.class);
    }

    @Override
    public FirmaDao getDao() {
        return (FirmaDao) dao;
    }

}
