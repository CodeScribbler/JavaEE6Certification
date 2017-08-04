<%@page import="java.util.List"%>
<%@page import="java.util.Set"%>
<%@page import="view.Topic"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Aufgabe 08: Topics v2</title>
</head>
<body>
<jsp:include page="header.jsp" />

<%
    List<Topic> topicList = (List<Topic>) request.getAttribute("topicList");
    for (Topic topic : topicList) {%>
<h1><%=topic.getTitle()%></h1>
<table style='font-family:monospace;font-size:16px;' border='1px' bordercolor='green' cellspacing='0' cellpadding='5'>
    <tr>
        <th><%=topic.getLeftHeader()%></th>
        <th><%=topic.getRightHeader()%></th>
    </tr>
    <%
        for (String left : topic.getRows().keySet()) {
            String right = (String) topic.getRows().get(left);
    %>
    <tr>
        <td><%= left%></td>
        <td><%= right%></td>
    </tr>
    <%}%>
</table>
<%}
%>

<jsp:include page="footer.jsp" />
</body>
</html>
