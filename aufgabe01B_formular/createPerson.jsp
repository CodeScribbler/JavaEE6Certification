<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Person anlegen</title>
</head>
<body>
<jsp:include page="header.jsp" />
<h1>Person anlegen</h1>

<form action="FC">
    <table>
        <tr>
            <td>Vorname:</td>
            <td><input type="text" name="firstname" /></td>
        </tr>
        <tr>
            <td>Nachname:</td>
            <td><input type="text" name="lastname"  title="lname"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Speichern" /></td>
        </tr>
    </table>
</form>

</body>
</html>
