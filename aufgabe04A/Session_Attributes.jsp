<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>Session Attributes</h1>
<table class="table">
    <thead>
    <tr>
        <th>Parameter Name</th>
        <th>Parameter Value</th>
    <tr>
    </thead>
    <tbody>
    <%
        session.setAttribute("Name", "Attributliste");
        session.setAttribute("Float-Wert", 5.0f);
        session.setAttribute("Int-Wert", 10);
        session.setAttribute("Boolean", Boolean.TRUE);
        session.setAttribute("Double-Wert", 343.1);
        for (Enumeration e = session.getAttributeNames(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            Object value = session.getAttribute(name);
    %>
    <tr>
        <td> <%= name %> </td>
        <td> <%= value %> </td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>
</body>
</html>
