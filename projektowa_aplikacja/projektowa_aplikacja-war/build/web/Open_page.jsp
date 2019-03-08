<%-- 
    Document   : Open_page
    Created on : 2019-01-19, 10:36:14
    Author     : Huber
--%>

<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Style/css/style1.css">
        <link href="https://fonts.googleapis.com/css?family=Lato&amp;subset=latin-ext" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link href="https://fonts.googleapis.com/css?family=Lato&amp;subset=latin-ext" rel="stylesheet"> 
        <link href="Style/css/style1.css" rel="stylesheet">
    </head>
    <body>
        <%
            String fileName = request.getParameter("fileName");

        %>
        <h1>PLIK: <%=fileName%></h1>
        <h1>TRESC: </h1>
        <%
            String folderName = "resources";
            String pathFolder = request.getServletContext().getRealPath("") + "\\..\\..\\..\\..\\" + folderName;
            String pathFile = pathFolder + File.separator + fileName;

            File file = new File(pathFile);
            if (!file.exists()) {
        %>
        <p>Cos sie zepsulo :>>>> bo plik nie istnieje</p>
        <%
        } else {

        %>

        <jsp:useBean id="dBean" class="ejb.NewSessionBean"/>
        <p> <%=dBean.Open_file(file)%></p>




        <%
            }
        %>

        <a href ="Strona_glowna.jsp">
            <button>Strona glowna</button>
        </a>
        <a href ="list-view.jsp">
            <button>List-VIew</button>
        </a>

    </body>
</html>
