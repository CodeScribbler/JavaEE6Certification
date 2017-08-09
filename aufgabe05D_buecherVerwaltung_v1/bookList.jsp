<%@ page import="model.Book" import="java.util.List" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" isErrorPage="false" session="true" %>
<html>
<head>
    <title>B&uuml;cherverwaltung - &Uuml;bersicht</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8" />
    <link rel="stylesheet" type="text/css" media="screen,projection" href="css/style.css" />
</head>
<body>

<jsp:include page="header.jsp" />

<div id="content-wrapper">
    <div id="content">
        <%
            List<Book> bookList = (List<Book>) request.getAttribute("bookList");
            for (Book book : bookList) {
                String deleteLink = String.format("<a href='FrontController?todo=personDelete&id=%d'>Löschen</a>", book.getId());
                String editLink = String.format("<a href='FrontController?todo=personEdit&id=%d'>Bearbeiten</a>", book.getId());
                out.println("<li>" + book + " " + deleteLink + " " + editLink + "</li>");
            }
        %>
    </div>
</div>

<jsp:include page="footer.jsp" />

</body>
</html>
