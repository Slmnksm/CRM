<%-- 
    Document   : main
    Created on : 13.Tem.2017, 10:20:21
    Author     : SelmanKasim
--%>
<%@page import="tr.kasim.crm.app.Application"%>
<%@page import="java.util.List"%>
<%@page import="tr.kasim.crm.model.*"%>
<%@page import="tr.kasim.servlet.WebApplication"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    UserSession userSession = WebApplication.getApp().getLoginSession(session);

    if (userSession == null) {
        WebApplication.getApp().gotoLoginPage(response, true, "You are not logged");
        return;
    }

    SistemKullanici user = userSession.getFkKullanici();
    String containerPage = request.getParameter("page");

    boolean isFail = "fail".equals(request.getParameter("type"));
    String actionMsg = request.getParameter("msg");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ana Sayfa</title>
    <link rel="stylesheet" href="css/main.css"/>
    <script src="js/jquery.js"></script>
    <script src="js/metadata.js"></script>
    <link rel="stylesheet" type="text/css" href="js/datatables.min.css"/>
    <link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
    <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="js/datatables.min.js"></script>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <script src="js/bootstrap.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>



</head>
<body>
    <table class="main" cellspacing="0px" cellpadding="0px">
        <tr class="header">
            <td  class="header_text">
                <h1><%=(userSession.getFkKullanici().getAd())%> Profile Sayfası</h1>
            </td>
            <td  class="header_info">
                <br>
                <a href="main.jsp"><%=(userSession.getFkKullanici().getAd())%></a> <br>
                <a href="crmService?action=logout"> Sistemden çıkış</a>
            </td>
        </tr>
        <tr>
            <td colspan="2" style="">
                <table class="main" cellspacing="0px" cellpadding="0px">
                    <tr>
                        <td class="menu">
                            <ul>
                                <li><a id="isl" class="{url:'islem/islemler.jsp'}" href="#">İşlemler</a></li>
                                <li><a id="req" class="" href="#">Satın Alma</a></li>
                                <li><a id="req" class="" href="#">Muhasebe</a></li>
                                <li><a id="req" class="" href="#">Personel</a></li>
                                <li><a id="req" class="" href="#">Tanımlar</a></li>                               
                                <%-- <li><a id="req" class="" href="#">Raporlar</a></li>
                                <li><a id="list" class="{url:'kullanici/userList.jsp'}" href="#">Kullanıcı Listesi</a></li>
                                <li><a id="list2" class="{url:'temsilci/temsilciList.jsp'}" href="#">Temsilci Listesi</a></li>
                                <li><a id="list3" class="{url:'firma/firmaList.jsp'}" href="#">Firma Listesi</a></li>
                                <li><a id="save" class="{url:'firma/saveFirma.jsp'}" href="#">Firma Kaydet</a></li>
                                <li><a id="list4" class="{url:'gorusme/gorusmeList.jsp'}" href="#">Görüşme Listesi</a></li>
                                <li><a id="save2" class="{url:'gorusme/saveGorusme.jsp'}" href="#">Görüşme Kaydet</a></li> --%>
                            </ul>
                        </td> 
                        <td class="container">


                            <%            if (actionMsg != null) {
                            %>
                            <h2 style="color: <%=(isFail ? "red" : "green")%>"><%=(isFail ? "Hata oluştu :" : "")%> <%=(actionMsg)%></h2>
                            <%
                                }
                            %>
                            <%if (containerPage == null) {
                            %> <h1>Hosgeldin
                                <%=(userSession.getFkKullanici().getAd())%>!</h1> <br>
                                <%
                                } else {
                                %>
                                <jsp:include page="<%=(containerPage)%>">
                                    <jsp:param name="mainPage" value="main.jsp"></jsp:param>
                                </jsp:include>    
                                <%
                                    }
                                %>

                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>

<script>
    $(document).ready(function () {
        $(".menu a").click(function () {
            var data = $(this).metadata();
            var url = data.url;

            document.location = "main.jsp?page=" + url;
        });

        try {
            pageInit();
        } catch (err) {
            //alert(err);
        }
    });
</script>
</body>
</html>
