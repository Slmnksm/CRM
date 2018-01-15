<%-- 
    Document   : userList
    Created on : 12.Jul.2017, 16:38:45
    Author     : SelmanKasim
--%>

<%@page import="tr.kasim.servlet.WebApplication"%>
<%@page import="tr.kasim.crm.model.UserSession"%>
<%@page import="tr.kasim.crm.model.SistemKullanici"%>
<%@page import="tr.kasim.crm.app.Application"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    UserSession userSession = WebApplication.getApp().getLoginSession(session);
    List<SistemKullanici> users = Application.getApp().getMainService().getUsers();

%>

<div>
    <br>
    <br>

    <table id="userList"></table>
</div>
<script>

    function pageInit() {

        var dataSet = [
    <%                int index = 1;
        for (SistemKullanici user : users) {
    %>
            [<%=(index++)%>,
                    "<%=(user.getAd())%>",
                    "<%=(user.getKullaniciad())%>",        
            ],
    <%
        }
    %>

        ];

        $('#userList').DataTable({
            data: dataSet,
            columns: [
                {title: "#"},
                {title: "Adı"},
                {title: "Kullanici Adi"},  
            ]
        });
    }
</script>


