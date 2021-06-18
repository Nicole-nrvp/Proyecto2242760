<%-- 
    Document   : editarPerfil
    Created on : 28/05/2021, 08:13:17 AM
    Author     : Intel
--%>

<%@page import="ModeloVO.DatosPVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos/estiloEditarPerfil.css" rel="stylesheet" type="text/css"/>
        <title>Editar perfil</title>
    </head>
    <body>
    <center>
        <h1>Editar Perfil</h1>
        
            <%

            DatosPVO datpVO = (DatosPVO) request.getAttribute("datoConsultado");
            if (datpVO != null) {

        %> 

        <form method="post" action="Datos">
 
            <BR>
            <BR>
            
            Nombre<br>
            <input type="text" name="textNombre"  value="<%=datpVO.getDatNombre()%>">
            <br>
            <br>
            Apellido <br>
            <input type="text" name="textApellido"  value="<%=datpVO.getDatApellido()%>"><br>
            <br>
            Telefono <br>
            <input type="text" name="textTelefono"  value="<%=datpVO.getDatTelefono()%>"><br>
            <br>
            Correo<br>
            <input type="text" name="textCorreo" value="<%=datpVO.getDatCorreo()%>" ><br>
            <br>
            <br>
            <button>Actualizar Perfil</button>
            <input type="hidden" value="1" name="opcion">
            
        </form>
        <%}%>
        
        <br>
        <br>

        <a href="menu.jsp"><input type="submit" value="Volver al Menù" name="Volver al Menù"></a>
       <%
    if (request.getAttribute("mensajeError") != null) {  %>  

        ${mensajeError}
        <%} else {%>
        <div style="color: darkseagreen;">${mensajeExito}</div>
        <% }%>
    </center>    

</body>
</html>
