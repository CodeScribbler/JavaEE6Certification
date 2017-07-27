<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp" />
<%  session.setAttribute("wasAuchImmer", "Hallo!");  %>
<h1>Context Attributes</h1>
<table class="table">
    <thead>
    <tr>
        <th>Parameter Name</th>
        <th>Parameter Value</th>
    <tr>
    </thead>
    <tbody>
    <tr>
        <td> session.setAttribute </td>
        <td>
            <%= session.getAttribute("wasAuchImmer") %>
        </td>
    </tr>
    </tbody>
</table>
</body>
</html>
