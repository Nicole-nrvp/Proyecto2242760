

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
        <link href="Estilos/estiloInicio.css" rel="stylesheet" type="text/css"/>
        <title>Inicio de Sesion</title>
    </head>
    <body>
    <center>

        <h1>INICIO DE SESION</h1>

        <form method="post" action="Usuario" class="conteInicio">
            <table>
                <tr>
                    Usuario<br>
                <input type="text" name="textUsuario"><br>
                <br>
                Contraseña<br>
                <input type="password" name="textClave"><br>
                <br>
                </tr>
            </table>
            <img src="Imagenes/login.jpg" alt=""/>
            <br>
            <button>Ingresar</button>
            <input type="hidden" value="3" name="opcion">
            <br>
            <a href="Intro.jsp"><input type="submit" value="Volver Pag Principal" name="Volver Pag Principal"></a>

        </form>
        <div class="mensaje">

            <center>
                <%
                    if (request.getAttribute("mensajeError") != null) {  %>  

                ${mensajeError}
                <%} else {%>
                <div style="color: darkseagreen;">${mensajeExito}</div>
                <% }%>
            </center>
    </center>

</div>
</body>
</html>
