<%-- 
    Document   : editarPerfil
    Created on : 28/05/2021, 08:13:17 AM
    Author     : Intel
--%>

<%@page import="ModeloVO.DatosPVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<%    
    if (buscarSesion.getAttribute("datosPersonales") == null) {
        System.out.println("Error pero entro a datos");
    } else {

        Nombre = datpVO.getDatNombre();
        Apellido = datpVO.getDatApellido();
        Telefono = datpVO.getDatTelefono();
        Correo = datpVO.getDatCorreo();

    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos/estiloEditarPerfil.css" rel="stylesheet" type="text/css"/>
        <title>Editar perfil</title>
    </head>
    <body>
        <div class="contenedor">

            <div class="header">
                <br>
                <h2>EDITAR DATOS PERSONALES</h2>
            </div>


            <div class="main">
                <div class="Barraboton">
                    <a href="registrarUsuario.jsp"><input class="submit" type="submit" value="Registrar Usuario" name="Registrar Usuario"></a>
                    <a href="registrarVehiculo.jsp"><input class="submit" type="submit" value="Registrar Vehiculo" name="Registrar Vehiculo"></a>
                    <a href="consultarVehiculo.jsp"><input class="submit" type="submit" value="Consultar Vehiculo" name="Consultar Vehiculo"></a>
                    <a href="consultarDatos.jsp"><input class="submit" type="submit" value="Consultar Datos" name="Consultar Datos"></a>
                    <a href="editarPerfil.jsp"><input class="submit" type="submit" value="Editar Perfil" name="Editar Perfil"></a>
                    <a href="mas.jsp"><input class="submit" type="submit" value="Acerca de Nicole" name="Acerca de Nicole"></a>

                </div>


                
    <center>
        <form method="post" action="Datos" class="conteR">
            <br>
            <input type="hidden" name="textNombre"  value="<%=datpVO.getUsuId()%>">
            <input type="hidden" name="textNombre"  value="<%=datpVO.getDatId()%>">
            Nombre<br>
            <input type="text" name="textNombre"  value="<%=Nombre%>">
            <br>
            <br>
            Apellido <br>
            <input type="text" name="textApellido"  value="<%=Apellido%>"><br>
            <br>
            Telefono <br>
            <input type="text" name="textTelefono"  value="<%=datpVO.getDatTelefono()%>"><br>
            <br>
            Correo<br>
            <input type="text" name="textCorreo" value="<%=datpVO.getDatCorreo()%>" ><br>
            <button class="submit" >Actualizar Perfil</button>
            <input class="submit" type="hidden" value="1" name="opcion">

            <%
            if (request.getAttribute("mensajeError") != null) {  %>  

        ${mensajeError}

        <%} else {%>
        <div style="color: #18241e;">${mensajeExito}</div>
        <% }%>

        
        </form>

        <br>
        <br>

    </center> 
        
         </div>
        </div>  
        <div class="footer">
            <a href="menu.jsp"><input class="submit" type="submit" value="Volver al Menú" name="Volver al Menú"></a>
                 
            <h1>Nicole Valentina Romero Polo - </h1>
            <br>
            <h2>2242760 - ADSsI</h2>

        </div>

</body>
</html>
