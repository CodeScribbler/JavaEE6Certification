<%@page import="model.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Person anlegen</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>Person aktualisieren</h1>

<%
    Person person = (Person) request.getAttribute("person");
%>
<form action="FrontController" method="POST">
    <table>
        <tr>
            <td>Vorname:</td>
            <td><input type="text" name="firstname" value="<%= person.getFirstname() %>" required="true" /></td>
        </tr>
        <tr>
            <td>Nachname:</td>
            <td><input type="text" name="lastname" value="<%= person.getLastname() %>" required="true"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Aktualisieren" /></td>
        </tr>
    </table>
    <input type="hidden" name="todo" value="personUpdate" />
    <input type="hidden" name="id" value="<%= person.getId() %>" />
</form>

<jsp:include page="footer.jsp" />
</body>
</html>
