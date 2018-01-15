<%-- 
    Document   : firmaList
    Created on : 14.Tem.2017, 14:11:48
    Author     : SelmanKasim
--%>

<%@page import="tr.kasim.crm.app.Application"%>
<%@page import="tr.kasim.crm.model.UserSession"%>
<%@page import="tr.kasim.crm.model.Firma"%>
<%@page import="java.util.List"%>
<%@page import="tr.kasim.servlet.WebApplication"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    UserSession userSession = WebApplication.getApp().getLoginSession(session);
    List<Firma> companies = Application.getApp().getMainService().getCompany();
%>

<div>
    <br>
    <br>

    <table id="firmaList"></table>
</div>
<script>

    function pageInit() {

        var dataSet = [
    <%                int index = 1;
        for (Firma company : companies) {
    %>
        [<%=(index++)%>,
            "<a href='main.jsp?page=firma/editFirma.jsp?id=<%=(company.getPkFirma())%>'>Edit</a",//burda firmanın id'sini almam lazım.
                "<%=(company.getFirmaAd() )%>",
                "<%=(company.getYetkili())%>",
                "<%=(company.getYetkiliCep() )%>",
                "<%=(company.getFirmaTip())%>",
                "<%=(company.getIl()!= null ? company.getIl().getIlAd():"" )%>",
                "<%=(company.getIlce()!= null ? company.getIlce().getIlce():"")%>",
        ],
    <%
        }
    %>

        ];
                $('#firmaList').DataTable({
            data: dataSet,
            columns: [
                {title: "#"},
                {title: "Düzenle"},
                {title: "Firma Adı"},
                {title: "Firma Yetkilisi"},
                {title: "Yetkili Telefonu"},
                {title: "Firma Tipi"},
                {title: "Firma Sehri"},
                {title: "Firma İlçesi"},
            ]
        });
    }
</script>
