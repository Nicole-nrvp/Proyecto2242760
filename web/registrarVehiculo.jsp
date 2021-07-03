<%-- 
    Document   : registrarUsuario
    Created on : 07-may-2021, 9:13:12
    Author     : usuario
--%>

<%@page import="ModeloVO.VehiculoVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.DatosPDAO"%>
<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@include file="Sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos/estiloRegistrarV.css" rel="stylesheet" type="text/css"/>
        <title>Registrar Vehiculo</title>
    </head>

    <body>
        <div class="contenedor">

            <div class="header">
                <br>
                <h2>REGISTRAR VEHICULO</h2>
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
                    <form method="post" action="Vehiculo" class="conteR">

                        <table>
                            <tr>
                                <th>  

                                    Placa <input type="text" name="textPlaca">
                                    <input type="hidden" name="textDatId" value="<%=datpVO.getDatId()%>" >  <br>
                                    <br>
                                    Categoria  <select name="textCatId">
                                        <option>Seleccione...</option>
                                        <%                                CategoriaDAO catDAO = new CategoriaDAO();
                                            for (CategoriaVO catVO : catDAO.listar()) {
                                        %>
                                        <option value="<%=catVO.getCatId()%>"><%=catVO.getCatTipo()%></option>
                                        <%} %>

                                    </select><br>
                                    <br>

                                    Modelo<input type="text" name="textModelo"><br>
                                    <br>
                                    Marca<input type="text" name="textMarca"><br>
                                    <br>
                                    Estado <select name="textEstado">
                                        <option> NUEVO </option>
                                        <option> USADO </option>

                                    </select><br>
                                    <br>
                                    Precio <input type="number" name="textPrecio"><br>
                                </th>
                            </tr>
                        </table>
                        <button class="submit">Registrar</button>
                        <input type="hidden" value="1" name="opcion">
                        <div style="color: red;">


                            <%                if (request.getAttribute(
                                    "mensajeError") != null) {  %>  

                            ${mensajeError}
                            <%} else {%>
                            <div style="color: #18241e;">${mensajeExito}</div>
                            <% }%>

                        </div>
                    </form>
                </center>

            </div>
        </div>  
        <div class="footer">
            <a href="menu.jsp"><input class="submit" type="submit" value="Volver al Menú" name="Volver al Menú"></a>
                 
            <h1>Nicole Valentina Romero Polo - </h1>
            <br>
            <h2>2242760 - ADSI</h2>

        </div>
    </body>
</html>
