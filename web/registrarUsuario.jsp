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
        <div class="ContentT">
            <div class="part1">
                <div class="login">
                    <form id="login" class="input-group-login" method="post" action="Usuario">


                        <h1>Registro de Usuario</h1>
                        <input type="text"  class="txt" placeholder="Ingresar Usuario" name="textUsuario" >
                        <input type="password"  class="txt" placeholder="Ingresar Clave" name="textClave" >

                        <button class="submit" class="submit-btn">Registrar</button>
                        <input type="hidden" id="opcion" value="1" name="opcion">



                        <div class="part2"></div>

                    </form>   
                    <a href="menu.jsp"><input class="submit" type="submit" value="Volver al Menú" name="Volver al Menú"></a>


                    <div style="color: red;">


                        <%
                if (request.getAttribute("mensajeError") != null) {  %>  

                        ${mensajeError}
                        <%} else {%>
                        <div style="color: #18241e;">${mensajeExito}</div>
                        <% }%>
                    </div>
                </div>
            </div>
        </div>
    </center>
</body>
</html>
