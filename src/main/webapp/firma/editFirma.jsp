<%-- 
    Document   : editFirma
    Created on : 17.Tem.2017, 11:42:21
    Author     : SelmanKasim
--%>
<%@page import="tr.kasim.crm.util.GeneralUtil"%>
<%@page import="tr.kasim.crm.model.SistemKullanici"%>
<%@page import="tr.kasim.crm.remote.MainService"%>
<%@page import="tr.kasim.crm.app.Application"%>
<%@page import="tr.kasim.crm.model.Tilce"%>
<%@page import="tr.kasim.crm.model.Til"%>
<%@page import="tr.kasim.crm.model.Firma"%>
<%@page import="tr.kasim.crm.model.PersonelKart"%>
<%@page import="tr.kasim.crm.model.UserSession"%>
<%@page import="java.util.List"%>
<%@page import="tr.kasim.servlet.WebApplication"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    UserSession userSession = WebApplication.getApp().getLoginSession(session);
    Firma company = Application.getApp().getMainService().getCompanyNameById(Integer.valueOf(request.getParameter("id")));
%>

<div class="form-group">
    <h2 style="text-align: center">Firma Bilgilerini Düzenle</h2>

    <form class="form-group" id="editCompany" method="post" action="crmService" onsubmit="return validateForm()">
        <input type="hidden" name="action" value="editFirma"/>
        <div class="form-group">
            <div class="col-md-12">
                <div class="col-md-6">
                    <label>Firma Adı:</label>
                    <input type="text" name="ad" value="<%=(company != null ? company.getFirmaAd() : "")%>"/>

                    <label>Firma Kısa Adı  : </label>
                    <input type="text" name="kısaAd" value="<%=(company != null ? company.getKisaad() : " ")%>"/>   <br>

                    <label>Yetkili Adı:</label>
                    <input type="text" name="yetkiliAd" value="<%=(company != null ? company.getYetkili() : " ")%>"/>

                    <label>Yetkili Telefonu:</label>
                    <input type="text" name="yetkiliTel" value="<%=(company != null ? company.getYetkiliCep() : " ")%>"/><br>

                    <label>Temsilci:</label>
                    <select name="personTemsilci" >
                        <%
                            for (PersonelKart person : (List<PersonelKart>) Application.getApp().getMainService().getAll(PersonelKart.class)) {
                        %>
                        <option type="text" value="<%=(person.getPkPersonel())%>"><%=(person.getAdSoyad())%></option>
                        <%
                            }
                        %>
                    </select> <br>

                    <label>İl:</label>
                    <select name="il" >
                        <%
                            for (Til il : (List<Til>) Application.getApp().getMainService().getAll(Til.class)) {
                        %>
                        <option type="text" value="<%=(il.getKayitNo())%>"><%=(il !=null ? il.getIlAd(): "")%></option>
                        <%
                            }
                        %>
                    </select> <br>

                    <label>İlçe:</label>
                    <select name="ilce" >
                        <%
                            for (Tilce ilce : (List<Tilce>) Application.getApp().getMainService().getAll(Tilce.class)) {
                        %>
                        <option type="text" value="<%=(ilce.getKayitNo())%>"><%=(ilce.getIlce())%></option>
                        <%
                            }
                        %>
                    </select> <br>

                    <label>Kara Liste</label>&nbsp;
                    <input type="checkbox" name="blackList" value="Kara Liste"/>
                    <label>Aday Müşteri</label>&nbsp;
                    <input type="checkbox" name="costumer" value="Aday Müşteri"/><br>
                    <label>Dekoratif</label>&nbsp;
                    <input type="checkbox" name="decorative" value="Dekoratif"/>&nbsp;
                    <label>Endüstri</label>&nbsp;
                    <input type="checkbox" name="industry" value="Endüstri"/>&nbsp;
                    <label>Uygulama</label>&nbsp;
                    <input type="checkbox" name="application" value="Uygulama"/>&nbsp;

                </div>
                <div class="col-md-6">

                    <label>Tel1:</label>
                    <input type="text" name="tel1" value="<%=(company != null ? company.getTel1() : " ")%>"/>&nbsp;

                    <label>Tel2:</label>
                    <input type="text" name="tel2" value="<%=(company != null ? company.getTel2() : " ")%>"/><br>

                    <label>Fax:</label>
                    <input type="text" name="fax" value="<%=(company != null ? company.getFax() : " ")%>"/>&nbsp;

                    <label>E-posta:</label>
                    <input type="text" name="ePosta" value="<%=(company != null ? company.getEposta() : " ")%>"/><br>

                    <label>Web Sitesi:</label>
                    <input type="text" name="webSite" value="<%=(company != null ? company.getWebAdres() : " ")%>"/><br>

                    <label>Açıklama ve Not:</label>
                    <textarea NAME="aciklamaVeNot" ROWS=5 COLS=40 value="<%=(company != null ? company.getAciklamaNot() : " ")%>"></textarea><br>  
                </div>

                <label>Sadakat Durumu:</label>
                <select name="durumSadakat" >
                    <option value=" "><%=(company.getSadakatDurum())%></option>
                    <option value="Sadık">Sadık</option>
                    <option value="Bölünmüş">Bölünmüş</option>
                    <option value="Spot">Spot</option>
                    <option value="Perakende">Perakende</option>
                    <option value="Belirsiz">Belirsiz</option>
                </select> 

                <label>Ciro Durumu:</label>
                <select name="durumCiro" >
                    <option value=" "><%=(company.getCiroDurum())%></option>
                    <option value="Platin">Platin</option>
                    <option value="Gold">Gold</option>
                    <option value="Silver">Silver</option>
                    <option value="Bronze">Bronze</option>
                    <option value="Belirsiz">Belirsiz</option>
                </select> 

                <label>Aday Durumu:</label>
                <select name="durumAday" >  
                    <option value=" "><%=(company.getAdayDurum())%></option>
                    <option value="İletişim Var">İletişim Var</option>
                    <option value="İletişim Var Çalışma Yok">İletişim Var Çalışma Yok</option>
                    <option value="İletişim Var Çalışma Var">İletişim Var Çalışma Var</option>
                    <option value="Belirsiz">Belirsiz</option>
                </select>   
                <br><br><br>

                <label>İndirim Oranı: %</label>
                <input type="text" name="indirim" value="<%=(company != null ? company.getIndirim() : " ")%>"/>

                <label>&nbsp;</label><br><br>
                <label><button class="btn-sm" type="submit">Firmayı Kaydet</button></label>

            </div>
        </div>
    </form>
</div>