<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, practica_2.*, control.* "%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar paises</title>
<%
	List<Country> lista = (List<Country>) request.getAttribute("lista");
%>
<script type="text/javascript">
			function principal(){
			let combo = document.getElementById("combo");
			combo.addEventListener("change", function(e) {
				let varik = document.getElementById("combo").value;
				document.getElementById("codig").value = varik;
			});
			}
		</script>
</head>
<body onLoad="principal()">
	<form ACTION="Control" METHOD=GET>
		<input type="hidden" name="instruccion" value="insertar" /> <input
			type="hidden" name="cArt" value="" id="codig" /> <select id="combo">
			<%
				for (Country c : lista) {
			%>
			<option value=<%=c.getCod()%>><%=c.getNombre()%></option>
			<%
				}
			%>
		</select>

		<input type="submit" />

	</form>

</body>
</html>