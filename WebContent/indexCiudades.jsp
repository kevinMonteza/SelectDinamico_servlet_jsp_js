<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*, practica_2.*, control.* "%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
	List<Ciudades> lista =(List<Ciudades>) request.getAttribute("lista");
%>
</head>
<body>
<table>
	 <tr>
		<th>Direccion</th>
		<th>Ciudad</th>
		<th>Tiendas</th>
	</tr>
	<% for(Ciudades c: lista) { %>
		<tr>
		<td class="filas"><%=c.getDireccion() %></td>
		<td class="filas"><%=c.getNombre() %></td>
		<td class="filas"><%=c.getTiendas() %></td>
		</tr>
	<%} %>
</table>
</body>
</html>