<%-- 
    Document   : menu
    Created on : 12-may-2021, 12:58:06
    Author     : usuario
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" media="only screen and (max-width: 768px)" href="estilos.css">
        <script src="Validaciones.js" type="text/javascript"></script>
        <link href="Estilos/estiloMas.css" rel="stylesheet" type="text/css"/>
        <title>Menu</title>
    </head>
    <body>

        <div class="contenedor">
            <div class="header">
                <br>
                <h2>CREADORA DEL CONSENCIONARIO</h2>
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
                <div class="frase">
                    <h1>Lo unico imposible es lo que no intentas</h1>    
                </div>
                <div class="conteimagen"></div>
                <div class="conteimagen2">
                   
                    <h2>17 años</h2>
                     <h1>Nicole Valentina Romero Polo</h1>
                    <h2>3145209916 - nvromero01@misena.edu.co</h2>
                    <h2>Lo que representa a Nicol es su Lidreazgo, Responsabilidad y Perfeccionismos</h2>
                    
                </div>
            </div>   



            <div class="footer">
                 <a href="menu.jsp"><input class="submit" type="submit" value="Volver al Menú" name="Volver al Menú"></a>

                <h1>Nicole Valentina Romero Polo - </h1>
                <br>
                <h2>2242760 - ADSI</h2>

            </div>

        </div>

    </body>
</html>
