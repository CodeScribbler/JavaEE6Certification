<%
    String info = (String) request.getAttribute("info");
    String error = (String) request.getAttribute("error");
    if (info != null || error != null ) {
        out.println("<hr/>");
    }
    if (info != null) {
        out.println("<div style='color: green'>" + info + "</div>");
    }
    if (error != null) {
        out.println("<div style='color: red'>" + error + "</div>");
    }
%>
