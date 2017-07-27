<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>Request Methods</h1>
<table class="table">
    <thead>
    <tr>
        <th>Parameter Name</th>
        <th>Parameter Value</th>
    <tr>
    </thead>
    <tbody>
    <tr>
        <td> getContextPath </td>
        <td><%  out.print( request.getContextPath() );  %></td>
    </tr>
    <tr>
        <td> Servlet Path </td>
        <td><%  out.print( request.getServletPath() );  %></td>
    </tr>
    <tr>
        <td> Real Path </td>
        <td><%  out.print( request.getRealPath("") );  %></td>
    </tr>
    <tr>
        <td> Server </td>
        <td><%  out.print( request.getServerName() );  %></td>
    </tr>
    <tr>
        <td> Scheme </td>
        <td><%  out.print( request.getScheme() );  %></td>
    </tr>
    <tr>
        <td> Port </td>
        <td><%  out.print( request.getServerPort() );  %></td>
    </tr>
    <tr>
        <td> Protocol </td>
        <td><%  out.print( request.getProtocol() );  %></td>
    </tr>
    <tr>
        <td> Method </td>
        <td><%  out.print( request.getMethod() );  %></td>
    </tr>
    <tr>
        <td> Path info </td>
        <td><%  out.print( request.getPathInfo() );  %></td>
    </tr>
    <tr>
        <td> Change Session Id </td>
        <td><%  out.print( request.changeSessionId() );  %></td>
    </tr>
    <tr>
        <td> Requested Session Id </td>
        <td><%  out.print( request.getRequestedSessionId() );  %></td>
    </tr>
    <tr>
        <td> Header names </td>
        <td><%  out.print( request.getHeaderNames() );  %></td>
    </tr>
    <tr>
        <td> Cookie </td>
        <td><%  out.print( request.getCookies() );  %></td>
    </tr>
    <tr>
        <td> AuthType </td>
        <td><%  out.print( request.getAuthType() );  %></td>
    </tr>
    <tr>
        <td> PathTranslated </td>
        <td><%  out.print( request.getPathTranslated() );  %></td>
    </tr>
    <tr>
        <td> Query String </td>
        <td><%  out.print( request.getQueryString() );  %></td>
    </tr>
    <tr>
        <td> RemoteUser </td>
        <td><%  out.print( request.getRemoteUser() );  %></td>
    </tr>
    <tr>
        <td> Request URI </td>
        <td><%  out.print( request.getRequestURI() );  %></td>
    </tr>
    <tr>
        <td> Session </td>
        <td><%  out.print( request.getSession() );  %></td>
    </tr>
    <tr>
        <td> Character Encoding </td>
        <td><%  out.print( request.getCharacterEncoding() );  %></td>
    </tr>
    <tr>
        <td> Content Length </td>
        <td><%  out.print( request.getContentLength() );  %></td>
    </tr>
    <tr>
        <td> Content Type </td>
        <td><%  out.print( request.getContentType() );  %></td>
    </tr>
    <tr>
        <td> Local Addr </td>
        <td><%  out.print( request.getLocalAddr() );  %></td>
    </tr>
    <tr>
        <td> Local Name </td>
        <td><%  out.print( request.getLocalName() );  %></td>
    </tr>
    <tr>
        <td> Remote Addr </td>
        <td><%  out.print( request.getRemoteAddr() );  %></td>
    </tr>
    <tr>
        <td> ParameterNames </td>
        <td><%  out.print( request.getParameterNames() );  %></td>
    </tr>
    <tr>
        <td> Remote Port </td>
        <td><%  out.print( request.getRemotePort() );  %></td>
    </tr>
    </tbody>
</table>
</body>
</html>
