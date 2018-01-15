<%-- 
    Document   : islemler
    Created on : 13.Tem.2017, 10:32:19
    Author     : SelmanKasim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Islemler</title>
</head>
<body><center>
    <table>
        
        <tr>
            <td>
                <h4>Firma İşlemleri</h4>
            </td>
            <td>
                <h4>Temsilci İşlemleri</h4>
            </td>
            <td>
                <h4>Görüşme İşlemleri</h4>
            </td>
            <td>
                <h4>Kullanıcı İşlemleri</h4>
            </td>
            <td>
                <h4>Fırsat İşlemleri</h4>
            </td>
        </tr>
        
        <tr>
            <td>
                <a href="main.jsp?page=firma/saveFirma.jsp">Firma Kaydet</a>
            </td>
            <td>
                
            </td>
            <td>
                <a href="main.jsp?page=gorusme/saveGorusme.jsp">Gorusme Kaydet</a>
            </td>
            <td>
                
            </td>
            <td>
                <a href="main.jsp?page=firsat/saveFirsat.jsp">Firsat Kaydet</a>
            </td>
        </tr>
        
        <tr>
            <td>
                <a href="main.jsp?page=firma/firmaList.jsp">Firma Listesi</a>
            </td>
            <td>
                <a href="main.jsp?page=temsilci/temsilciList.jsp">Temsilci Listesi</a>
            </td>
            <td>
                <a href="main.jsp?page=gorusme/gorusmeList.jsp">Gorusme Listesi</a>
            </td>
            <td>
                <a href="main.jsp?page=kullanici/userList.jsp">Kullanici Listesi</a>
            </td>
            <td>
                <a href="main.jsp?page=firsat/firsatList.jsp">Firsat Listesi</a>
            </td>
        </tr>
        
            
    </table>
</center>
</body>
</html>
