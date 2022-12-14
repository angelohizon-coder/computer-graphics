<%-- 
    Document   : index
    Created on : 03 16, 21, 7:29:45 PM
    Author     : angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <img src="SimpleCaptchaServlet">  
        <form action="captchaSubmit.jsp" method="post">          
            <input name="answer" />  
            <input type="submit" name="submit"/>  
        </form>
    </body>
</html>
