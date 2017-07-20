<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Person anlegen</title>
</head>
<body>
<jsp:include page="header.jsp" />

<h1>Person anlegen</h1>

<form action="pc" method="POST">
    Vorname: <input name="firstname" /> <br/><br/>
    Nachname: <input name="lastname" /> <br/><br/>
    <input type="hidden" name="todo" value="personSave" />
    <input type="reset" value="Reset">
    <input type="submit" value="Speichern" />
</form>

<%
    String info = (String) request.getAttribute("info");
    if (info != null) {
        out.println("<hr/>");
        out.println("<div style='color: green'>"+ info + "</div>");
    }
%>
</body>
</html>
