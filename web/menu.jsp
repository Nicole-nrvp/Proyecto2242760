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
        <link href="Estilos/estiloMenu.css" rel="stylesheet" type="text/css"/>
        <title>Menu</title>
    </head>
    <body>

        <div class="contenedor">
            <div class="header">
                <br>
                <form>
                    Roles:
                    <select name="textCatId" onchange="redireccion(value)">
                        <option>Seleccione...</option>
                        <%                        UsuarioDAO usuDAO = new UsuarioDAO();
                            UsuarioVO usuVO = new UsuarioVO();
                            ArrayList<UsuarioVO> listaRol = (ArrayList<UsuarioVO>) buscarSesion.getAttribute("rol");
                            for (int i = 0; i < listaRol.size(); i++) {
                                usuVO = listaRol.get(i);
                        %>
                        <option value="<%=usuVO.getRol()%>"><%=usuVO.getRol()%></option>
                        <%}%>
                    </select>
                </form>
                    <h2>TIENES LOS DOS ROLES</h2>
            </div>
                    
            <div class="main">
                <div class="Barraboton">
                    <a href="registrarUsuario.jsp"><input class="submit" type="submit" value="Registrar Usuario" name="Registrar Usuario"></a>
                    <a href="registrarVehiculo.jsp"><input class="submit" type="submit" value="Registrar Vehiculo" name="Registrar Vehiculo"></a>
                    <a href="consultarVehiculo.jsp"><input class="submit" type="submit" value="Consultar Vehiculo" name="Consultar Vehiculo"></a>
                    <a href="consultarDatos.jsp"><input class="submit" type="hidden" value="Consultar Datos" name="Consultar Datos"></a>
                    <a href="editarPerfil.jsp"><input class="submit" type="submit" value="Editar Perfil" name="Editar Perfil"></a>
                    <a href="mas.jsp"><input class="submit" type="submit" value="Acerca de Nicole" name="Acerca de Nicole"></a>

                </div>
                <div class="frase">
                    <h1>Lo unico imposible es lo que no intentas</h1>    
                </div>
                <div class="conteimagen"></div>
            </div>   



            <div class="footer">
                <h1>Nicole Valentina Romero Polo - </h1>
                <br>
                <h2>2242760 - ADSI</h2>

            </div>

        </div>

    </body>
</html>
