<%@page contentType="text/html" pageEncoding="UTF-8" import="java.util.List, model.Person"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Person anlegen</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>Personenliste</h1>

<ul>
    <%
        List<Person> personList = (List<Person>) request.getAttribute("personList");
        for (Person person : personList) {
            String deleteLink = String.format("<a href='FrontController?todo=personDelete&id=%d'>Löschen</a>", person.getId());
            String editLink = String.format("<a href='FrontController?todo=personEdit&id=%d'>Bearbeiten</a>", person.getId());
            out.println("<li>" + person + " " + deleteLink + " " + editLink + "</li>");
        }
    %>
</ul>

<jsp:include page="footer.jsp" />

</body>
</html>

