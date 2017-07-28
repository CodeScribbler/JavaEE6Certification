<%
    String info = (String) request.getAttribute("info");
    String error = (String) request.getAttribute("error");
    if (info != null || error != null) { %>
<hr/>
<div style="color: green">${info}</div>
<div style="color: red">${error}</div>

<%}%>

<div style="height: 500px" />
