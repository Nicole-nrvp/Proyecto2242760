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
        <link href="Estilos/estiloMenu.css" rel="stylesheet" type="text/css"/>
        <script src="Validaciones.js" type="text/javascript"></script>
        <title>Menu</title>
    </head>
    <body>
        <br>
        <div style=" float: left;">
            
            <form>
                Roles:
                <select name="textCatId" onchange="redireccion(value)">
                    <option>Seleccione...</option>
                    <%                        
                        UsuarioDAO usuDAO = new UsuarioDAO();
                        UsuarioVO usuVO = new UsuarioVO();
                        ArrayList<UsuarioVO> listaRol = (ArrayList<UsuarioVO>)buscarSesion.getAttribute("rol");
                        for (int i = 0; i < listaRol.size(); i++) {
                            usuVO = listaRol.get(i);
                    %>
                    <option value="<%=usuVO.getRol()%>"><%=usuVO.getRol()%></option>
                    <%}%>
                </select>
            </form>
               
        </div>  
        <br>
        <br>
        <br>
    <center>
        <br>
        <div class="Botones">
            <a href="registrarUsuario.jsp"><input type="submit" value="Registrar Usuario" name="Registrar Usuario"></a>
            <a href="registrarVehiculo.jsp"><input type="submit" value="Registrar Vehiculo" name="Registrar Vehiculo"></a>
            <a href="consultarVehiculo.jsp"><input type="submit" value="Consultar Vehiculo" name="Consultar Vehiculo"></a>
            <a href="consultarDatos.jsp"><input type="submit" value="Consultar Datos" name="Consultar Datos"></a>
            <a href="editarPerfil.jsp"><input type="submit" value="Editar Perfil" name="Editar Perfil"></a>
            <a href="mas.jsp"><input type="submit" value="Acerca de Nicole" name="Acerca de Nicole"></a>

        </div>

        <center><img class="imagen" src="Imagenes/consensionario.jpg" alt=""/> </center>

        <div class="Fin">
            <p>GRACIAS</p>
        </div>
    </center>
</body>
</html>
