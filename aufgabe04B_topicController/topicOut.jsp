<%@page import="java.util.Map"%>
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
<!-- ############################# Header ############################# -->
<jsp:include page="header.jsp" />
<!-- ######################### END of Header ########################## -->

<% Topic topic = (Topic) request.getAttribute("topic");%>


<h1><%= topic.getTitle()%></h1>

<table style='font-family:monospace;font-size:16px;' border='1px' bordercolor='green' cellspacing='0' cellpadding='5'>
    <tr>
        <th><%= topic.getLeftHeader()%></th>
        <th><%= topic.getRightHeader()%></th>
    </tr>
    <%
        Map<String, String> rows = topic.getRows();
        for (String key : rows.keySet()) {
            String value = rows.get(key);%>
    <tr>
        <td><%= key %></td>
        <td><%= value %></td>
    </tr>
    <%}%>
</table>

<!-- ############################# Footer ############################# -->
<jsp:include page="footer.jsp" />
<!-- ######################### END of Footer ########################## -->

</body>
</html>
