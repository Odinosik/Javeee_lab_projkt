<%-- 
    Document   : Strona_glowna
    Created on : 2019-01-15, 19:05:40
    Author     : Huber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="Style/css/style1.css">
        <link href="https://fonts.googleapis.com/css?family=Lato&amp;subset=latin-ext" rel="stylesheet">
        <title>Add Note</title>
          <link href="https://fonts.googleapis.com/css?family=Lato&amp;subset=latin-ext" rel="stylesheet"> 
        <link href="Style/css/style1.css" rel="stylesheet">
    </head>
    <body>
        <br><br><br><br>
    <center>
       
            
        
        <form action="AddNotesServlet" method="post" >
             <table>
                 <tr>
                     <th>
            Nazwa uzytkownika
            <input type="text"  name="firstName">
            </th>
            </tr>
                <tr>
                     <th>
            Nazwa pliku
            <input type="text" name="fileName"><br>
             </th>
            </tr>
          
            <tr>
                     <th>
             Tresc
           <textarea name="content1">
                
           </textarea> <br>
                </th>
            </tr>
            <tr>
                     <th>
                    <td><input type="submit" value="Submit"></td>
              </th>
            </tr>
        
         </table>
        </form>
        
       
    
      
        
       
    </center>
</body>
</html>