<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>Context Parameters</h1>
<table class="table">
<thead>
<tr>
    <th>Parameter Name</th>
    <th>Parameter Value</th>
<tr>
</thead>
<tbody>
<tr>
    <td> para </td>
    <td><%
        String param1=application.getInitParameter("para");
        out.println(param1);
    %></td>
</tr>
</tbody>
</table>
</body>
</html>
