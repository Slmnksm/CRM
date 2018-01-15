<%-- 
    Document   : saveMeeting
    Created on : 01.Ağu.2017, 09:11:53
    Author     : SelmanKasim
--%>

<%@page import="tr.kasim.crm.model.FirmaYetkili"%>
<%@page import="tr.kasim.crm.model.Firma"%>
<%@page import="tr.kasim.crm.model.ProjeDetay"%>
<%@page import="java.util.List"%>
<%@page import="tr.kasim.crm.model.PersonelKart"%>
<%@page import="tr.kasim.crm.remote.MainService"%>
<%@page import="tr.kasim.crm.app.Application"%>
<%@page import="tr.kasim.crm.model.SistemKullanici"%>
<%@page import="tr.kasim.servlet.WebApplication"%>
<%@page import="tr.kasim.crm.model.UserSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    UserSession userSession = WebApplication.getApp().getLoginSession(session);
    SistemKullanici user = userSession.getFkKullanici();
    MainService mainService = Application.getApp().getMainService();
%>

<div class="form-group">
    <h2 style="text-align: center">Yeni Görüşme Kaydet</h2>

    <form class="form-group" id="newMeeting" method="post" action="crmService" onsubmit="return validateForm()">
        <input type="hidden" name="action" value="saveGorusme"/>
        <div class="form-group">
            <div class="col-md-12">
                <div class="col-md-8">
                    <label>Firma Adı:</label>
                    <select name="nameFirma" >
                        <%
                            for (Firma company : (List<Firma>) Application.getApp().getMainService().getAll(Firma.class)) {
                        %>
                        <option type="text" value="<%=(company.getPkFirma())%>"><%=(company.getFirmaAd())%></option>
                        <%
                            }
                        %>
                    </select><br>

                    <label>İlgili Proje:</label>
                    <select name="nameProject" >
                        <%
                            for (ProjeDetay project : (List<ProjeDetay>) Application.getApp().getMainService().getAll(ProjeDetay.class)) {
                        %>
                        <option type="text" value="<%=(project.getId())%>"><%=(project.getProjeAdı())%></option>
                        <%
                            }
                        %>
                    </select>

                    <label>Görüşülen Kişi</label>
                    <select name="person" >
                        <%
                            for (FirmaYetkili person : (List<FirmaYetkili>) Application.getApp().getMainService().getAll(FirmaYetkili.class)) {
                        %>
                        <option type="text" value="<%=(person.getPkyetkililer())%>"><%=(person.getAd())%></option>
                        <%
                            }
                        %>
                    </select>

                    <label>Firma Katılımcı</label>
                    <select name="person2" >
                        <%
                            for (FirmaYetkili person : (List<FirmaYetkili>) Application.getApp().getMainService().getAll(FirmaYetkili.class)) {
                        %>
                        <option type="text" value="<%=(person.getPkyetkililer())%>"><%=(person.getAd())%></option>
                        <%
                            }
                        %>
                    </select>

                    <label>Görüşen Kişi</label>
                    <input type="text" name="person3"/><br>

                    <label>Katılımcı</label>
                    <select name="person4" >
                        <%
                            for (PersonelKart personel : (List<PersonelKart>) Application.getApp().getMainService().getAll(PersonelKart.class)) {
                        %>
                        <option type="text" value="<%=(personel.getPkPersonel())%>"><%=(personel.getAdSoyad())%></option>
                        <%
                            }
                        %>
                    </select>

                    <label>Görüşme Tipi:</label>
                    <select name="tipGorusme" >
                        <option value="Geliştirme">Geliştirme</option>
                        <option value="Koruma">Koruma</option>
                        <option value="Telefonla Görüşme">Telefonla Görüşme</option>
                        <option value="Ziyaret">Ziyaret</option>
                    </select> 

                    <label>Tarih:</label>
                    <input type="text" name="tarih"/><br><br>

                    <label>Görüşme Notu:</label><br>
                    <textarea NAME="gorusmeNotu" ROWS=3 COLS=30></textarea><br>  

                    <label>&nbsp;</label>
                    <label><button class="btn-sm" type="submit">Görüşmeyi Kaydet</button></label>

                </div>
            </div>
    </form>
</div>



