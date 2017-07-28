<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Aufgabe 04b: TopicController</title>
</head>
<body>
<!-- ############################# Header ############################# -->
<jsp:include page="header.jsp" />
<!-- ######################### END of Header ########################## -->

<h1>Startseite</h1>
<form action="FrontControllerV2">
    <input type="checkbox" name="todo" value="requestParameters" /> Request Parameters
    <input type="checkbox" name="todo" value="requestHeaders" /> Request Headers
    <input type="checkbox" name="todo" value="requestAttributes" /> Request Attributes
    <input type="checkbox" name="todo" value="requestMethods" /> Request Methods
    <hr/>
    <input type="checkbox" name="todo" value="responseHeaders" /> Response Headers
    <input type="checkbox" name="todo" value="responseMethods" /> Response Methods
    <hr/>
    <input type="checkbox" name="todo" value="sessionAttributes" /> Session Attributes
    <input type="checkbox" name="todo" value="sessionMethods" /> Session Methods
    <hr/>
    <input type="checkbox" name="todo" value="contextAttributes" /> Context Attributes
    <input type="checkbox" name="todo" value="contextMethods" /> Context Methods
    <hr/>

    <input type="hidden" name="Obst" value="Apfel" />
    <input type="hidden" name="Gemuese" value="Obergine" />

    <input type="submit"  value="Anzeigen" /><br/>
</form>
<!-- ############################# Footer ############################# -->
<jsp:include page="footer.jsp" />
<!-- ######################### END of Footer ########################## -->

</body>
</html>