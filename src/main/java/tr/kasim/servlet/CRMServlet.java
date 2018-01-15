/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tr.kasim.crm.app.Application;
import tr.kasim.crm.model.Firma;
import tr.kasim.crm.model.FirmaYetkili;
import tr.kasim.crm.model.Firsat;
import tr.kasim.crm.model.Gorusme;
import tr.kasim.crm.model.PersonelKart;
import tr.kasim.crm.model.ProjeDetay;
import tr.kasim.crm.model.Til;
import tr.kasim.crm.model.Tilce;
import tr.kasim.crm.model.UserSession;
import tr.kasim.crm.remote.MainService;
import tr.kasim.crm.util.GeneralUtil;

/**
 *
 * @author SelmanKasim
 */
@WebServlet(urlPatterns = {"/crmService"})
public class CRMServlet extends HttpServlet {

    org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(MainService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doProcess(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doProcess(req, resp);
    }

    protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = null;
        try {
            out = new PrintWriter(resp.getOutputStream());

            String action = req.getParameter("action");

            if ("logUser".equals(action)) {
                login(req, resp);
            } else if ("logout".equals(action)) {
                logout(req, resp);
            } else if ("saveFirma".equals(action)) {
                saveCompany(req, resp);
            } else if ("editFirma".equals(action)) {
                editCompany(req, resp);
            } else if ("saveGorusme".equals(action)) {
                saveMeeting(req, resp);
            }else if ("saveFirsat".equals(action)) {
                saveChance(req, resp);
            }

        } catch (Exception ex) {
            log.error(ex, ex);
        } finally {
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }

    private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String userName = req.getParameter("username");
        String password = req.getParameter("pass");
        String ip = req.getHeader("x-forwarded-for");
        if (ip == null) {
            ip = req.getRemoteAddr();
        }
        try {
            UserSession userSession = Application.getApp().getMainService().login(userName, password, ip);

            WebApplication.getApp().setLoginSession(req.getSession(true), userSession);
            resp.sendRedirect("main.jsp");
        } catch (Exception ex) {
            log.error(ex, ex);
            WebApplication.getApp().gotoLoginPage(resp, true, ex.getMessage());
        }
    }

    private void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        WebApplication.getApp().removeLoginSession(req.getSession());
        WebApplication.getApp().gotoLoginPage(resp, false, "");
    }

    private void saveCompany(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Firma company = new Firma();
        company.setFirmaAd(req.getParameter("ad"));
        company.setKisaad(req.getParameter("kisaAd"));
        company.setYetkili(req.getParameter("yetkiliAd"));
        company.setYetkiliCep(req.getParameter("yetkiliTel"));
        company.setTel1(req.getParameter("tel1"));
        company.setTel2(req.getParameter("tel2"));
        company.setFax(req.getParameter("fax"));
        company.setEposta(req.getParameter("ePosta"));
        company.setWebAdres(req.getParameter("webSite"));
        company.setAciklamaNot(req.getParameter("aciklamaVeNot"));
        company.setIndirim(GeneralUtil.toInt(req.getParameter("indirim")));
        company.setFkTemsilci(new PersonelKart(GeneralUtil.toInt(req.getParameter("personTemsilci"))));
        company.setIl(new Til(GeneralUtil.toInt(req.getParameter("il"))));
        company.setIlce(new Tilce(GeneralUtil.toInt(req.getParameter("ilce"))));
        company.setSadakatDurum(req.getParameter("durumSadakat"));
        company.setCiroDurum(req.getParameter("durumCiro"));
        company.setFirmaTip(req.getParameter("tipFirma"));
        company.setAdayDurum(req.getParameter("durumAday"));

        try {
            Application.getApp().getMainService().saveNewCompany(company);

            resp.sendRedirect("main.jsp?page=firma/firmaList.jsp");
        } catch (Exception ex) {
            log.error(ex, ex);
            resp.sendRedirect("islemler.jsp?fail=true&msg=" + ex.getMessage());
        }

    }
    
    private void editCompany(HttpServletRequest req, HttpServletResponse resp) throws IOException, Exception {

        UserSession userSession = WebApplication.getApp().getLoginSession(req.getSession());
        Firma company = Application.getApp().getMainService().getCompanyNameById(userSession.getFkKullanici().getPkKullanici());
        if (company == null) {
            company = new Firma();
            company.setFkSistemKullanici(userSession.getFkKullanici());
        }
        
        company.setFirmaAd(req.getParameter("ad"));
        company.setKisaad(req.getParameter("kisaAd"));
        company.setYetkili(req.getParameter("yetkiliAd"));
        company.setYetkiliCep(req.getParameter("yetkiliTel"));
        company.setTel1(req.getParameter("tel1"));
        company.setTel2(req.getParameter("tel2"));
        company.setFax(req.getParameter("fax"));
        company.setEposta(req.getParameter("ePosta"));
        company.setWebAdres(req.getParameter("webSite"));
        company.setAciklamaNot(req.getParameter("aciklamaVeNot"));
        company.setIndirim(GeneralUtil.toInt(req.getParameter("indirim")));
        company.setFkTemsilci(new PersonelKart(GeneralUtil.toInt(req.getParameter("personTemsilci"))));
        company.setIl(new Til(GeneralUtil.toInt(req.getParameter("il"))));
        company.setIlce(new Tilce(GeneralUtil.toInt(req.getParameter("ilce"))));
        company.setSadakatDurum(req.getParameter("durumSadakat"));
        company.setCiroDurum(req.getParameter("durumCiro"));
        company.setAdayDurum(req.getParameter("durumAday"));

        try {
            Application.getApp().getMainService().saveNewCompany(company);

            resp.sendRedirect("main.jsp?page=firma/firmaList.jsp");
        } catch (Exception ex) {
            log.error(ex, ex);
            resp.sendRedirect("islemler.jsp?fail=true&msg=" + ex.getMessage());
        }

    }
private void saveMeeting(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Gorusme meeting = new Gorusme();
        meeting.setFkFirma(new Firma (GeneralUtil.toInt(req.getParameter("nameFirma"))));
        meeting.setFkProjeProje(new ProjeDetay(GeneralUtil.toInt(req.getParameter("nameProject"))));
        meeting.setFkFirmaYetkili(new FirmaYetkili(GeneralUtil.toInt(req.getParameter("person"))));
        meeting.setFkFirmaYetkili(new FirmaYetkili(GeneralUtil.toInt(req.getParameter("person2"))));
        meeting.setGorusen(req.getParameter("person3"));
        meeting.setFkKatilimci(new PersonelKart(GeneralUtil.toInt(req.getParameter("person4"))));
        meeting.setGorusmeTip(req.getParameter("tipGorusme"));
        meeting.setTarih(new Date());
        meeting.setIsinNotu(req.getParameter("gorusmeNotu"));
  
        try {
            Application.getApp().getMainService().saveNewMeeting(meeting);

            resp.sendRedirect("main.jsp?page=gorusme/gorusmeList.jsp");
        } catch (Exception ex) {
            log.error(ex, ex);
            resp.sendRedirect("islemler.jsp?fail=true&msg=" + ex.getMessage());
        }

    }

    private void saveChance(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        
        Firsat chance = new Firsat();
        chance.setFkFirma(new Firma (GeneralUtil.toInt(req.getParameter("firmaAdi"))));
        chance.setFkProje(new ProjeDetay(GeneralUtil.toInt(req.getParameter("projeAdi"))));
        chance.setTarih(new Date());
        chance.setAciklama(req.getParameter("aciklamaNotu"));
        chance.setDurum(req.getParameter("durumBilgisi"));
        
        
  
        try {
            Application.getApp().getMainService().saveNewChance(chance);

            resp.sendRedirect("main.jsp?page=firsat/firsatList.jsp");
        } catch (Exception ex) {
            log.error(ex, ex);
            resp.sendRedirect("islemler.jsp?fail=true&msg=" + ex.getMessage());
        }

        
    }

}
