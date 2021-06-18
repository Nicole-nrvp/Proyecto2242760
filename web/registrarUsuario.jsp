<%-- 
    Document   : registrarUsuario
    Created on : 07-may-2021, 9:13:12
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos/estiloRegistrarU.css" rel="stylesheet" type="text/css"/>
        <title>Registrar Usuario</title>
    </head>
    <body>
    <center> 
        <h1>REGISTRO DE USUARIOS</h1>
        <form method="post" action="Usuario">
            <br>
            <br>
            <table>
                <tr>
                    Usuario<br>
                <input type="text" name="textUsuario"><br>
                <br>
                <br>
                Contraseña<br>
                <input type="password" name="textClave"><br>
                </tr>
                <br>
                <br>
            </table>
            <button>Registrar</button>
            <input type="hidden" value="1" name="opcion">

        </form>
        <br>
         <a href="menu.jsp"><input type="submit" value="Volver al Menù" name="Volver al Menù"></a>

        <div style="color: red;">


            <%
                if (request.getAttribute("mensajeError") != null) {  %>  

            ${mensajeError}
            <%} else {%>
            <div style="color: darkseagreen;">${mensajeExito}</div>
            <% }%>

        </div>
    </center>
</body>
</html>
