<%-- 
    Document   : index
    Created on : 13.Tem.2017, 10:21:40
    Author     : SelmanKasim
--%>
<%@page import="java.util.Enumeration"%>
<%@page import="tr.kasim.crm.app.Application"%>
<%@page import="java.util.List"%>
<%@page import="tr.kasim.crm.model.*"%>
<%@page import="tr.kasim.servlet.WebApplication"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    UserSession userSession = WebApplication.getApp().getLoginSession(session);

    if (userSession != null) {
        response.sendRedirect("main.jsp");
        return;
    }else if(userSession == null){
        response.sendRedirect("login.jsp");
        return;
    }

   Enumeration<String> enumeration = request.getParameterNames();
    String containerPage = request.getParameter("page");
    if(containerPage == null){
        containerPage = "";
    }

    boolean isFail = "fail".equals(request.getParameter("type"));
    String actionMsg = request.getParameter("msg");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Baslangic</title>
    <link rel="stylesheet" href="css/main.css"/>
    <script src="js/jquery.js"></script>
    <script src="js/metadata.js"></script>
    <link rel="stylesheet" type="text/css" href="js/datatables.min.css"/>

    <script type="text/javascript" src="js/datatables.min.js"></script>


</head>
<body>
    <table class="main" cellspacing="0px" cellpadding="0px">
        <tr class="header">
            <td  class="header_text">
                <h1>JOTUNX'a Hoşgeldiniz!</h1>
            </td>
            <td  class="header_info">
                <br>
                <a href="login.jsp">Giriş</a>
            </td>
        </tr>
        <tr>
            <td colspan="2" style="">
                <table class="main" cellspacing="0px" cellpadding="0px">
                    <tr>
                        <td class="menu">
                            <ul>
                                <li><a id="req" class="{url:'menuler/islemler.jsp'}" href="islemler.jsp">İşlemler</a></li>
                                <li><a id="req" class="" href="#">Satın Alma</a></li>
                                <li><a id="req" class="" href="#">Muhasebe</a></li>
                                <li><a id="req" class="" href="#">Personel</a></li>
                                <li><a id="req" class="" href="#">Tanımlar</a></li>
                                <li><a id="req" class="" href="#">Raporlar</a></li>
                                <li><a id="req" class="{url:'list.jsp'}" href="#">Kullanıcı Listesi</a></li>
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
                                !</h1> <br>
                            <%
                            } else {
                            %>
                            <jsp:include page="<%=(containerPage)%>">
                                <jsp:param name="mainPage" value="index.jsp"></jsp:param>
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
