<%-- 
    Document   : gorusmeList
    Created on : 31.Tem.2017, 10:19:44
    Author     : SelmanKasim
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="tr.kasim.crm.app.Application"%>
<%@page import="java.util.List"%>
<%@page import="tr.kasim.crm.model.Gorusme"%>
<%@page import="tr.kasim.crm.model.UserSession"%>
<%@page import="tr.kasim.servlet.WebApplication"%>

<%
    UserSession userSession = WebApplication.getApp().getLoginSession(session);
    List<Gorusme> meetings = Application.getApp().getMainService().getMeeting();

%>

<div>
    <br>
    <br>

    <table id="gorusmeList"></table>
</div>
<script>

    function pageInit() {

        var dataSet = [
    <%                int index = 1;
        for (Gorusme meeting : meetings) {
    %>
            [<%=(index++)%>,
                   "<a href='main.jsp?page=gorusme/editGorusme.jsp?id=<%=(meeting.getPkGorusme())%>'>Edit</a",//burda firmanın id'sini almam lazım.
                    "<%=(meeting.getGorusulenKisi())%>",
                    "<%=(meeting.getGorusen())%>",
                    "<%=(meeting.getProje())%>",
                    "<%=(meeting.getTarih())%>",
                    "<%=(meeting.getGorusmeTip())%>",
                    "<%=(meeting.getFirmaKatilim() != null ? meeting.getFirmaKatilim() : " ")%>",
                    "<%=(meeting.getFkKatilimci() != null ? meeting.getFkKatilimci().getAdSoyad() : " ")%>",
                    "<%=(meeting.getFkFirma() != null ? meeting.getFkFirma().getFirmaAd(): " ")%>",
                    
            ],
    <%
        }
    %>
        ];
        $('#gorusmeList').DataTable({
            data: dataSet,
            columns: [
                {title: "#"},
                {title: "Düzenle"},
                {title: "Görüşülen Kişi"},
                {title: "Görüşen Kişi"},
                {title: "Proje"},
                {title: "Tarih"},
                {title: "Görüşme Tipi"},
                {title: "Firma Katılımcı"},
                {title: "Katılımcı"},
                {title: "Firma"},
                
            ]
        });
    }
</script>