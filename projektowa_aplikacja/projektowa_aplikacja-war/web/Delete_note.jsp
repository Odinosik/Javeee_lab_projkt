<%-- 
    Document   : Delete_note
    Created on : 2019-01-19, 12:04:50
    Author     : Huber
--%>

<%@page import="model.Notes"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="hib.HibernateUtil"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Style/css/style1.css">
        <link href="https://fonts.googleapis.com/css?family=Lato&amp;subset=latin-ext" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="Style/css/style1.css">
        <link href="https://fonts.googleapis.com/css?family=Lato&amp;subset=latin-ext" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link href="https://fonts.googleapis.com/css?family=Lato&amp;subset=latin-ext" rel="stylesheet"> 
        <link href="Style/css/style1.css" rel="stylesheet">
    </head>
    <body>
           <jsp:useBean id="dBean" class="ejb.NewSessionBean"/>
         
        <%
            
            
        String fileName = request.getParameter("fileName"); 
        String folderName = "resources";
        String pathFolder = request.getServletContext().getRealPath("") + "\\..\\..\\..\\..\\" + folderName;
        String pathFile = pathFolder + File.separator + fileName;
        
        
        %>
      
       <%-- start web service invocation --%><hr/>
    <%
        
        
        
    try {
	sop.DodawanieHib_Service service = new sop.DodawanieHib_Service();
	sop.DodawanieHib port = service.getDodawanieHibPort();
	 // TODO initialize WS operation arguments here
	java.lang.String filename = fileName;
	port.setFileName(filename);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    

    %>
 
    <%-- end web service invocation --%><hr/>

        
        
        
        
        <%
            Session hibsession;
            hibsession = HibernateUtil.getSessionFactory().openSession();
            hibsession.beginTransaction();
            Query q = hibsession.createQuery("delete from Notes where filename =:name");
            q.setParameter("name", fileName);
            int delted = q.executeUpdate();
            hibsession.getTransaction().commit();
            hibsession.close();
            
            File file = new File(pathFile);

            %>

               <p> <%Boolean check=dBean.Delete_File(file); %></p>
            <%
       
        if ( check)
        {
            %>
            <p> Usunieto pomyslnie</p>
            <%
        } else {
           %>
            <p> Nie usunelo moze plik juz zostal usuniety :<<<< </p>
            <%
        }
        %>
        
        <a href ="Strona_glowna.jsp">
            <button>Strona glowna</button>
        </a>
                <a href ="list-view.jsp">
            <button>List-VIew</button>
        </a>
        <h1>Usunieto</h1>
    </body>
</html>
