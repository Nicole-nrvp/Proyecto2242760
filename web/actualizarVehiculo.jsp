

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
    <center>

        <h1>Actualizar Vehìculo</h1>

        <%

            VehiculoVO vehVO = (VehiculoVO) request.getAttribute("vehiculoConsultado");
            if (vehVO != null) {

        %> 
        <form method="post" action="Vehiculo">


            Placa<br>
            <input type="text" name="textPlaca" value="<%=vehVO.getVehPlaca()%>">
            <br>
            <br>
            Datos Personales <br>
            <input type="text" name="textDatId" value="<%=vehVO.getDatosId()%>"><br>
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

            <br>
            <button>Actualizar</button>
            <input type="hidden" value="2" name="opcion">

        </form>
        <%}%>
        <br>
        <br>
        <a href="consultarVehiculo.jsp"><input type="submit" value="Volver" name="Volver"></a> 
        <br>
        <br>


        <%
    if (request.getAttribute("mensajeError") != null) {  %>  

        ${mensajeError}
        <%} else {%>
        <div style="color: darkseagreen;">${mensajeExito}</div>
        <% }%>
    </center>
</body>
</html>
