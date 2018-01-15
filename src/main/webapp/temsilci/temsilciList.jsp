<%-- 
    Document   : temsilciList
    Created on : 25.Tem.2017, 04:25:07
    Author     : SelmanKasim
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="tr.kasim.crm.model.PersonelKart"%>
<%@page import="tr.kasim.crm.app.Application"%>
<%@page import="tr.kasim.crm.model.UserSession"%>
<%@page import="tr.kasim.crm.model.Firma"%>
<%@page import="java.util.List"%>
<%@page import="tr.kasim.servlet.WebApplication"%>

<%
    UserSession userSession = WebApplication.getApp().getLoginSession(session);
    List<PersonelKart> agents = Application.getApp().getMainService().getPersonelCard();
%>

<div>
    <br>
    <br>

    <table id="temsilciList"></table>
</div>
<script>

    function pageInit() {

        var dataSet = [
    <%                int index = 1;
        for (PersonelKart agent : agents) {
    %>
        [<%=(index++)%>,
                "<%=(agent.getAdSoyad())%>",
                "<%=(agent.getTcKimlik() != null ? agent.getTcKimlik(): "")%>",
                "<%=(agent.getCep() != null ? agent.getCep(): "")%>",
                
        ],
    <%
        }
    %>

        ];
                $('#temsilciList').DataTable({
            data: dataSet,
            columns: [
                {title: "#"},
                {title: "Temsilci Adı"},
                {title: "Temsilci TC"},
                {title: "Temsilci No"}, 
            ]
        });
    }
</script>
