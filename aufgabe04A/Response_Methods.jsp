<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>Response Methods</h1>
<table class="table">
    <thead>
    <tr>
        <th>Parameter Name</th>
        <th>Parameter Value</th>
    <tr>
    </thead>
    <tbody>
    <tr>
        <td> Status </td>
        <td><%  out.print( response.getStatus() );  %></td>
    </tr>
    <tr>
        <td> CharacterEncoding </td>
        <td><%  out.print( response.getCharacterEncoding() );  %></td>
    </tr>
    <tr>
        <td> ContentType </td>
        <td><%  out.print( response.getContentType() );  %></td>
    </tr>
    <tr>
        <td> Locale </td>
        <td><%  out.print( response.getLocale()  );  %></td>
    </tr>
    </tbody>
</table>
</body>
</html>
