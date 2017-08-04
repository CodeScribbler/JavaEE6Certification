<% String url = response.encodeURL("index.jsp"); %>
<a href="<%= url %>">Startseite</a> |


<% url = response.encodeURL("artiekliste.jsp"); %>
<a href="<%= url %>">Artikelliste</a> |


<% url = response.encodeURL("warenkorb.jsp"); %>
<a href="<%= url %>">Warenkorb</a> |


<% url = response.encodeURL("allewaren.jsp"); %>
<a href="<%= url %>">Alle Warenkörbe</a>