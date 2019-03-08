<%-- 
    Document   : Strona_glowna
    Created on : 2019-01-15, 19:05:40
    Author     : Huber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="Style/css/style1.css">
        <link href="https://fonts.googleapis.com/css?family=Lato&amp;subset=latin-ext" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlet File Upload/Download</title>
    </head>
    <body>
        <br><br><br><br>
    <center>
        
        <form action="Upload" method="post" enctype="multipart/form-data">
            <table width="400px" align="center" border=2>
                <tr>
                    <td align="center" colspan="2">Form Details</td>
                </tr>
                <tr>
                    <td>First Name </td>
                    <td>
                        <input type="text" required="" name="firstname">
                    </td>
                </tr>
               
                <tr>
                    <td>Select File </td>
                    <td>
                        <input type="file" required="" name="file" accept=".txt">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>

        </form>
        <br><a href = "list-view.jsp">
             <button>List-VIew</button></a>
         <br><a href = "AddNote.jsp">
             <button>AddNote</button></a>
    </center>
</body>
</html>