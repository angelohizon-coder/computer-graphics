<%@ page import="nl.captcha.Captcha" %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
            Captcha captcha = (Captcha) session.getAttribute(Captcha.NAME);  
            request.setCharacterEncoding("UTF-8");  
            String answer = request.getParameter("answer");  
            if (captcha.isCorrect(answer)) { %>  
                <b>Correct!</b>  
        <% } %> 
    </body>
</html>
