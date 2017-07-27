<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>Request Attributes</h1>
<%
    ArrayList<String> numList = new ArrayList<String>();
    numList.add("one");
    numList.add("two");
    numList.add("three");
    request.setAttribute("numList", numList);
%>


</body>
</html>
