/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.services;

import java.util.Date;
import tr.kasim.crm.db.Session;
import tr.kasim.crm.db.dao.KullaniciDao;
import tr.kasim.crm.model.SistemKullanici;
import tr.kasim.crm.model.UserSession;

/**
 *
 * @author SelmanKasim
 */
public class KullaniciService extends CommonService<SistemKullanici>{
    
     public KullaniciService() {
        super(new KullaniciDao());
    }
     
     public UserSession login(Session session, String userName, String password, String ipAddress) throws Exception {
        SistemKullanici user = getDao().getByUserName(session, userName);
        if (user == null) {
            throw new Exception("User not found . Username:" + userName);
        }

        if (user.getSifre()!= null && user.getSifre().equals(password)) {
            UserSession userSession = new UserSession();
            userSession.setFkKullanici(user);
            userSession.setIp(ipAddress);
            userSession.setGirisZamani(new Date());
            userSession = (UserSession) saveAndFlush(session, userSession, UserSession.class);
            saveAndFlush(session, user, SistemKullanici.class);
            return userSession;
        }
        throw new Exception("Login failed check username and password. Username:" + userName);
    }
     
     @Override
    public KullaniciDao getDao() {
        return (KullaniciDao) dao;
    }
}
