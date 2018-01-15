<%-- 
    Document   : firsatList
    Created on : 01.Ağu.2017, 13:51:49
    Author     : SelmanKasim
--%>

<%@page import="tr.kasim.crm.app.Application"%>
<%@page import="java.util.List"%>
<%@page import="tr.kasim.crm.model.Firsat"%>
<%@page import="tr.kasim.servlet.WebApplication"%>
<%@page import="tr.kasim.crm.model.UserSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    UserSession userSession = WebApplication.getApp().getLoginSession(session);
    List<Firsat> chances = Application.getApp().getMainService().getChance();

%>

<div>
    <br>
    <br>

    <table id="firsatList"></table>
</div>
<script>

    function pageInit() {

        var dataSet = [
    <%                int index = 1;
        for (Firsat chance : chances) {
    %>
            [<%=(index++)%>,
                   "<a href='main.jsp?page=firsat/editFirsat.jsp?id=<%=(chance.getPkFirsat())%>'>Edit</a",//burda firmanın id'sini almam lazım.
                    "<%=(chance.getFkFirma()!= null ? chance.getFkFirma().getFirmaAd(): "" )%>",
                    "<%=(chance.getFkProje()!= null ? chance.getFkProje().getProjeAdı(): "")%>",
                    "<%=(chance.getTarih())%>",
                    "<%=(chance.getAciklama())%>",
                    "<%=(chance.getDurum())%>",
            ],
    <%
        }
    %>
        ];
        $('#firsatList').DataTable({
            data: dataSet,
            columns: [
                {title: "#"},
                {title: "Düzenle"},
                {title: "Firma"},
                {title: "Proje"},
                {title: "Tarih"},
                {title: "Açıklama"},
                {title: "Durum"},
            ]
        });
    }
</script>
