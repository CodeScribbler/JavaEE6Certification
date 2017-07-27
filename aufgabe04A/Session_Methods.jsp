<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>Session Methods</h1>
<table class="table">
    <thead>
    <tr>
        <th>Parameter Name</th>
        <th>Parameter Value</th>
    <tr>
    </thead>
    <tbody>
    <tr>
        <td> Session ID </td>
        <td><%  out.print( session.getId() );  %></td>
    </tr>
    <tr>
        <td> Creation Time </td>
        <td><%  out.print( session.getCreationTime() );  %></td>
    </tr>
    <tr>
        <td> Last Accessed Time </td>
        <td><%  out.print( session.getLastAccessedTime() );  %></td>
    </tr>
    <tr>
        <td> Inactive Interval </td>
        <td><%  out.print( session.getMaxInactiveInterval() );  %></td>
    </tr>
    </tbody>
</table>
</body>
</html>
