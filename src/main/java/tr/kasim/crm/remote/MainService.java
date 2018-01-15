/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.crm.remote;

import java.util.List;
import org.apache.log4j.Logger;
import tr.kasim.crm.app.Application;
import tr.kasim.crm.db.Session;
import tr.kasim.crm.model.Firma;
import tr.kasim.crm.model.Firsat;
import tr.kasim.crm.model.Gorusme;
import tr.kasim.crm.model.PersonelKart;
import tr.kasim.crm.model.SistemKullanici;
import tr.kasim.crm.services.FirmaService;
import tr.kasim.crm.model.UserSession;
import tr.kasim.crm.services.FirsatService;
import tr.kasim.crm.services.GorusmeService;
import tr.kasim.crm.services.KullaniciService;
import tr.kasim.crm.services.PersonelKartService;

/**
 *
 * @author SelmanKasim
 */
public class MainService {

    Logger log = Logger.getLogger(MainService.class);
    
    public List getAll(Class type) {
        String tag = "[MainService][getAll]";
        Session session = newSession();
        List result = null;
        try {
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Start]");
            }
            result = getKullaniciService().getAll(session, type);
            session.commit();
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Complete] " + result.size());
            }
            return result;
        } catch (Exception e) {
            log.error(tag + "[Error] msg:" + e.getMessage(), e);
            session.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    public Firma saveNewCompany(Firma firma) throws Exception {
        String tag = "[MainService][eduStat]";
        Session session = newSession();
        try {
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Start] " + firma);
            }
            Firma savedNewCompany = getFirmaService().saveNewCompany(session, firma);
            session.commit();
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Complete] " + savedNewCompany);
            }
            return savedNewCompany;
        } catch (Exception e) {
            log.error(tag + "[Error] " + firma + ", msg:" + e.getMessage(), e);
            session.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    
    public Firsat saveNewChance(Firsat firsat) throws Exception {
        String tag = "[MainService][eduStat]";
        Session session = newSession();
        try {
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Start] " + firsat);
            }
            Firsat savedNewChance = getFirsatService().saveNewChance(session, firsat);
            session.commit();
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Complete] " + savedNewChance);
            }
            return savedNewChance;
        } catch (Exception e) {
            log.error(tag + "[Error] " + firsat + ", msg:" + e.getMessage(), e);
            session.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    
    public Gorusme saveNewMeeting(Gorusme gorusme) throws Exception {
        String tag = "[MainService][eduStat]";
        Session session = newSession();
        try {
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Start] " + gorusme);
            }
            Gorusme savedNewMeeting = getGorusmeService().saveNewMeeting(session, gorusme);
            session.commit();
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Complete] " + savedNewMeeting);
            }
            return savedNewMeeting;
        } catch (Exception e) {
            log.error(tag + "[Error] " + gorusme + ", msg:" + e.getMessage(), e);
            session.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    
    public Firma getCompanyNameById(Integer userId) throws Exception {

        String tag = "[MainService][login]";
        Session session = newSession();
        Firma result = null;
        try {
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Start] userId:" + userId);
            }
            result =  getFirmaService().getCompanyById(session, userId);
            session.commit();
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Complete] userId:" + userId + ",result:" + result);
            }
            return result;
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Error] userId:" + userId + ",result:" + result + ", msg:" + e.getMessage(), e);
            }
            session.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    public Gorusme getMeetingById(Integer userId) throws Exception {

        String tag = "[MainService][login]";
        Session session = newSession();
        Gorusme result = null;
        try {
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Start] " );
            }
            result =  getGorusmeService().getMeetingById(session, userId);
            session.commit();
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Complete] result:" + result);
            }
            return result;
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Error] userId:"  + ",result:" + result + ", msg:" + e.getMessage(), e);
            }
            session.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    
    public List<Firma> getCompany()
            throws Exception {
        List<Firma> result;
        Session session = newSession();

        try {
            if (log.isDebugEnabled()) {
                log.debug("[MainService][getCompany][Start] ");
            }

            result = getFirmaService().getAll(session);

            if (log.isDebugEnabled()) {
                log.debug("[MainService][getCompany][Complete] size:" + result.size());
            }
            return result;
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.debug("[MainService][getCompany][Error] msg:" + e.getMessage(), e);
            }
            session.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    
    public List<Gorusme> getMeeting()
            throws Exception {
        List<Gorusme> result;
        Session session = newSession();

        try {
            if (log.isDebugEnabled()) {
                log.debug("[MainService][getCompany][Start] ");
            }

            result = getGorusmeService().getAll(session);

            if (log.isDebugEnabled()) {
                log.debug("[MainService][getCompany][Complete] size:" + result.size());
            }
            return result;
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.debug("[MainService][getCompany][Error] msg:" + e.getMessage(), e);
            }
            session.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    
    public List<Firsat> getChance()
            throws Exception {
        List<Firsat> result;
        Session session = newSession();

        try {
            if (log.isDebugEnabled()) {
                log.debug("[MainService][getCompany][Start] ");
            }

            result = getFirsatService().getAll(session);

            if (log.isDebugEnabled()) {
                log.debug("[MainService][getCompany][Complete] size:" + result.size());
            }
            return result;
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.debug("[MainService][getCompany][Error] msg:" + e.getMessage(), e);
            }
            session.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    
    public List<PersonelKart> getPersonelCard()
            throws Exception {
        List<PersonelKart> result;
        Session session = newSession();

        try {
            if (log.isDebugEnabled()) {
                log.debug("[MainService][getPersonelCard][Start] ");
            }

            result = getPersonelKartService().getAll(session);

            if (log.isDebugEnabled()) {
                log.debug("[MainService][getPersonelCard][Complete] size:" + result.size());
            }
            return result;
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.debug("[MainService][getPersonelCard][Error] msg:" + e.getMessage(), e);
            }
            session.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    public List<SistemKullanici> getUsers()
            throws Exception {
        List<SistemKullanici> result;
        Session session = newSession();

        try {
            if (log.isDebugEnabled()) {
                log.debug("[MainService][getUsers][Start] ");
            }

            result = getKullaniciService().getAll(session);

            if (log.isDebugEnabled()) {
                log.debug("[MainService][getUsers][Complete] size:" + result.size());
            }
            return result;
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.debug("[MainService][getUsers][Error] msg:" + e.getMessage(), e);
            }
            session.rollback();
            throw e;
        } finally {
            session.close();
        }
    }
    
    public UserSession login(String userName, String password, String ip)
            throws Exception {
        String tag = "[MainService][login]";
        Session session = newSession();
        UserSession result = null;
        try {
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Start] userName:" + userName + ", password:" + password);
            }
            result = getKullaniciService().login(session, userName, password, ip);
            session.commit();
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Complete] userName:" + userName + ", password:" + password + ",result:" + result);
            }
            return result;
        } catch (Exception e) {
            if (log.isDebugEnabled()) {
                log.debug(tag + "[Error] userName:" + userName + ", password:" + password + ", msg:" + e.getMessage(), e);
            }
            session.rollback();
            throw e;
        } finally {
            session.close();
        }
    }

    public Object getService(String serviceName) {
        return Application.getApp().getSpring().getBean(serviceName);
    }

    private FirmaService getFirmaService() {
        return (FirmaService) getService("firmaService");
    }
    private PersonelKartService getPersonelKartService() {
        return (PersonelKartService) getService("personelKartService");
    }

    private KullaniciService getKullaniciService() {
        return (KullaniciService) getService("kullaniciService");
    }
    private GorusmeService getGorusmeService() {
        return (GorusmeService) getService("gorusmeService");
    }
    private FirsatService getFirsatService() {
        return (FirsatService) getService("firsatService");
    }

    private Session newSession() {
        return newSession(null);
    }

    private Session newSession(UserSession userSession) {
        Session session = new Session(Application.getApp().getEntityManagerFactory().createEntityManager(), userSession);
        return session;
    }
}
