/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.services;

import tr.kasim.crm.db.Session;
import tr.kasim.crm.db.dao.FirsatDao;
import tr.kasim.crm.model.Firsat;

/**
 *
 * @author SelmanKasim
 */
public class FirsatService extends CommonService<Firsat>{
    
    public FirsatService() {
        super(new FirsatDao());
    }
    public Firsat saveNewChance (Session session, Firsat firsat) {
        return (Firsat) saveAndFlush(session, firsat, Firsat.class);
    }
    
     @Override
    public FirsatDao getDao() {
        return (FirsatDao) dao;
    }
}
