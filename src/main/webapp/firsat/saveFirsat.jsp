<%-- 
    Document   : saveFirsat
    Created on : 01.Ağu.2017, 13:52:12
    Author     : SelmanKasim
--%>

<%@page import="tr.kasim.crm.model.ProjeDetay"%>
<%@page import="java.util.List"%>
<%@page import="tr.kasim.crm.model.Firma"%>
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
    <h3 style="text-align: center">Yeni Fırsat Kaydet</h3>

    <form class="form-group" id="newChance" method="post" action="crmService" onsubmit="return validateForm()">
        <input type="hidden" name="action" value="saveFirsat"/>
        <div class="form-group">
            <div class="col-md-12">
                <div class="col-md-8">
                    <label>Firma Adı:</label>
                    <select name="firmaAdi" >
                        <%
                            for (Firma company : (List<Firma>) Application.getApp().getMainService().getAll(Firma.class)) {
                        %>
                        <option type="text" value="<%=(company.getPkFirma())%>"><%=(company.getFirmaAd())%></option>
                        <%
                            }
                        %>
                    </select><br>

                    <label>İlgili Proje:</label>
                    <select name="projeAdi" >
                        <%
                            for (ProjeDetay project : (List<ProjeDetay>) Application.getApp().getMainService().getAll(ProjeDetay.class)) {
                        %>
                        <option type="text" value="<%=(project.getId())%>"><%=(project.getProjeAdı())%></option>
                        <%
                            }
                        %>
                    </select>

                    <label>Tarih:</label>
                    <input type="text" name="tarih"/><br><br>

                    <label>Açıklama:</label><br>
                    <textarea name="aciklamaNotu" rows=3 cols=30></textarea><br>  
                    
                    <label>Durum:</label>
                    <select name="durumBilgisi" >
                        <option value="Kazanıldı">Kazanıldı</option>
                        <option value="Kaybedildi">Kaybedildi</option>
                        <option value="Yeni Fırsat">Yeni Fırsat</option>
                        <option value="Rev.Teklif Verildi">Rev.Teklif Verildi</option>
                        <option value="Teklif Verilecek">Koruma</option>
                    </select> 

                    <label>&nbsp;</label><br><br>
                    <label><button class="btn-sm" type="submit">Fırsatı Kaydet</button></label>

                </div>
            </div>
    </form>
</div>
