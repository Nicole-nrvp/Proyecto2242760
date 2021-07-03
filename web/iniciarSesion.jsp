

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

        <form id="login" class="input-group-login" method="post" action="Usuario">

            <div class="ContentT">
                <div class="part1">
                    <div class="login">
                        <h1>Login</h1>
                        <input type="text"  class="txt" placeholder="Ingresar Usuario" name="textUsuario" required>
                        <input type="password"  class="txt" placeholder="Ingresar Clave" name="textClave" required>


                        <button class="submit" class="submit-btn">Ingresar</button>
                        <input type="hidden" value="3" name="opcion">

                        <span class="span"><input type="checkbox" class="check-box">terminos y condiciones</span>

                        <input type="hidden" id="opcion" name="opcion" value="1">

                        <h2 id="Error"></h2>

                        <h2 id="Error"></h2>

                        <div class="part2"> </div>



                        </form>
    <center>
                        <div class="mensaje">

                            <%
                if (request.getAttribute("mensajeError") != null) {  %>  

                            ${mensajeError}
                            <%} else {%>
                            <div style="color: red;">${mensajeExito}</div>
                            <% }%>


                        </div
    </center>
                    </div>
                </div>
            </div>
    </body>
</html>
