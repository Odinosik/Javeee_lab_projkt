
<%@page import="org.hibernate.Query"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Session"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="hib.HibernateUtil"%>
<%@page import="model.Notes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Style/css/style1.css">
        <link href="https://fonts.googleapis.com/css?family=Lato&amp;subset=latin-ext" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            tr,td,th{
                padding: 20px;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <br><br><br>
    <center>
        <%!
            Connection con = null;
            PreparedStatement ps = null;
            Session hibsession;  
            List<Notes> listnotes = null;
            
        %>
        <table border="2">
            <tr>
                <th>ID</th><th>First Name</th><th>File Name</th><th>File Path</th><th>Added Date</th><th>Download</th><th>Open</th><th>Delete</th>
            </tr>
            <%
                
                hibsession = HibernateUtil.getSessionFactory().openSession();
                hibsession.beginTransaction();
                Query q = hibsession.createQuery("from Notes as note");
                listnotes = (List<Notes>) q.list();
      
                for (int i=0;i<listnotes.size();i++) {
            %>
            <tr>
                 <tr>
                <td><%=listnotes.get(i).getId()%></td>
                <td><%=listnotes.get(i).getFirstname()%></td>
              
                <td><%=listnotes.get(i).getFilename()%></td>
                <td><%=listnotes.get(i).getPath()%></td>
                <td><%=listnotes.get(i).getAddedDate()%></td>
                <td><a href="Download?fileName=<%=listnotes.get(i).getFilename()%>">
                       <button>Download</button>
                    </a></td>
                <td><a href="Open_page.jsp?fileName=<%=listnotes.get(i).getFilename()%>">
                             <button>Open</button></a></td>
                <td><a href="Delete_note.jsp?fileName=<%=listnotes.get(i).getFilename()%>">
                        <button>Delete</button>
                    </a></td>
            </tr>      
            <% }%>
            <tr>
                <td></td>
                </td>
           </td>
            </tr>
            <%
                
            %>
            
        </table><br>
        <a href="Strona_glowna.jsp">
                 <button class="czarny">Strona glowna</button></a>
    </center>
    </body>
</html>