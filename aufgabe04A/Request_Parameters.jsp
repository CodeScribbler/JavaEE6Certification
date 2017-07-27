<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request Parameters</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>Request Parameters</h1>
<table class="table">
    <thead>
    <tr>
        <th>Parameter Name</th>
        <th>Parameter Value</th>
    <tr>
    </thead>
    <tbody>
    <tr>
        <td> request.getParameter("name") </td>
        <td><%  out.print("Hallo Herr "+request. getParameter("name")+"!");  %></td>
    </tr>
    </tbody>
</table>
</body>

</html>