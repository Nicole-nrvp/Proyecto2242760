<%@page import="ModeloVO.CategoriaVO"%>
<%@page import="ModeloDAO.CategoriaDAO"%>
<%@page import="ModeloVO.VehiculoVO"%>
<%@include file="Sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos/estiloActualizarV.css" rel="stylesheet" type="text/css"/>
        <title>Actualizar Vehiculo</title>
    </head>
    <body>
        <div class="contenedor">

            <div class="header">
                <br>
                <h2>ACTUALIZAR VEHICULO</h2>
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
                    
                    <%            VehiculoVO vehVO = (VehiculoVO) request.getAttribute("vehiculoConsultado");
                        if (vehVO != null) {

                    %> 
                    <form method="post" action="Vehiculo" class="conteR">
                        <br>
                        
                        Placa <input type="text" name="textPlaca" value="<%=vehVO.getVehPlaca()%>">
                        <input type="hidden" name="textDatId" value="<%=vehVO.getDatosId()%>"><br>
                        <br>
                        Categoria <br>
                        <select name="textCatId">
                            <%
                                CategoriaDAO catDAO = new CategoriaDAO();
                                for (CategoriaVO catVO : catDAO.listar()) {
                            %>
                            <option value="<%=catVO.getCatId()%>"><%=catVO.getCatTipo()%></option>
                            <%}%>

                        </select><br>
                        <br>
                        Modelo<br>
                        <input type="text" name="textModelo" value="<%=vehVO.getVehModelo()%>"><br>
                        <br>
                        Marca<br>
                        <input type="text" name="textMarca" value="<%=vehVO.getVehMarca()%>"><br>
                        <br>
                        Estado<br>
                        <select name="textEstado">
                            <option> NUEVO </option>
                            <option> USADO </option>

                        </select><br>
                        <br>
                        Precio<br>
                        <input type="number" name="textPrecio" value="<%=vehVO.getVehPrecio()%>"><br>
                        <button class="submit" >Actualizar</button>
                        <input class="submit" type="hidden" value="2" name="opcion">

                    </form>
                    <%}%>
                    <%
            if (request.getAttribute("mensajeError") != null) {  %>  

                    ${mensajeError}
                    <%} else {%>
                    <div style="color: #ffffff;">${mensajeExito}</div>
                    <% }%>
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
