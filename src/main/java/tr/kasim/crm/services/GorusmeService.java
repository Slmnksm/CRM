/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.services;

import tr.kasim.crm.db.Session;
import tr.kasim.crm.db.dao.GorusmeDao;
import tr.kasim.crm.model.Gorusme;

/**
 *
 * @author SelmanKasim
 */
public class GorusmeService extends CommonService<Gorusme>{
    
    public GorusmeService() {
        super(new GorusmeDao());
    }
    
    public Gorusme getMeetingById(Session session, Integer id) {
        return (Gorusme) getDao().getMeetingById(session, id);
    }
    public Gorusme saveNewMeeting (Session session, Gorusme gorusme) {
        return (Gorusme) saveAndFlush(session, gorusme, Gorusme.class);
    }
    
    @Override
    public GorusmeDao getDao() {
        return (GorusmeDao) dao;
    }
}
