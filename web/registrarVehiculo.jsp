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
    <center> 
        <h1>REGISTRO DE VEHICULOS</h1>
        <form method="post" action="Vehiculo">

            <table>
                <tr>
                    <th>  

                        Placa<br>
                        <input type="text" name="textPlaca">
                        <br>
                        <br>
                        <input type="hidden" name="textDatId" value="<%=datpVO.getDatId()%>" ><br>   
                        Categoria <br>
                        <select name="textCatId">
                            <option>Seleccione...</option>
                            <%                                CategoriaDAO catDAO = new CategoriaDAO();
                                for (CategoriaVO catVO : catDAO.listar()) {
                            %>
                            <option value="<%=catVO.getCatId()%>"><%=catVO.getCatTipo()%></option>
                            <%} %>

                        </select><br>

                        <br>
                        Modelo<br>
                        <input type="text" name="textModelo"><br>
                        <br>
                        Marca<br>
                        <input type="text" name="textMarca"><br>
                        <br>
                        Estado<br>
                        <select name="textEstado">
                            <option> NUEVO </option>
                            <option> USADO </option>

                        </select><br>
                        <br>
                        Precio<br>
                        <input type="number" name="textPrecio"><br>
                    </th>
                </tr>
            </table>
            <br>
            <button>Registrar</button>
            <input type="hidden" value="1" name="opcion">

        </form>
        <br>
        <a href="menu.jsp"><input type="submit" value="Volver al Menù" name="Volver al Menù"></a>

        <div style="color: red;">


            <%                if (request.getAttribute(
                        "mensajeError") != null) {  %>  

            ${mensajeError}
            <%} else {%>
            <div style="color: darkseagreen;">${mensajeExito}</div>
            <% }%>

        </div>
    </center>
</body>
</html>
