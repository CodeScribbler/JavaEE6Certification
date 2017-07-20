<%@ page import="model.Person" %>
<%@ page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Personenliste</title>
</head>
<body>
<jsp:include page="header.jsp" />

<h1>Personenliste</h1>
<ul>
    <%
        List<Person> personList = (List<Person>) request.getAttribute("personList");
        for (Person person : personList) {
            out.println("<li>" + person + "</li>");
        }
    %>
</ul>


</body>
</html>

