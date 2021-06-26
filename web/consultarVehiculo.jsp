<%-- 
    Document   : consultarVehiculo
    Created on : 14/05/2021, 08:45:44 AM
    Author     : Andrés
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.VehiculoDAO"%>
<%@page import="ModeloVO.VehiculoVO"%>
<%@include file="Sesiones.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos/estiloConsultarV.css" rel="stylesheet" type="text/css"/>
        <title>Consultar Vehiculo</title>
    </head>
    <body>
    <center>

        <h1>Vehículos</h1>

        <form method="post" action="Vehiculo">
            <br>
            <table>
                <tr>
                    <th>
                        PLACA
                        <input type="text" name="textPlaca"> 
                        <button>Consultar</button>  
                    </th>     
                </tr>
            </table><br><br>

            <input type="hidden" value="3" name="opcion">    
        </form><br><br>
        <div style="color: red;">

            <%
                if (request.getAttribute("mensajeError") != null) { %>
            ${mensajeError}

            <%} else {%>
            <div style="color: darkgreen;">${mensajeExito}    </div> 

            <% }%>
        </div>


        <form>

            <table border="1" class="tabla">
                <tr>
                    <th>PLACA</th>
                    <th>DATOS</th>
                    <th>CATEGORÍA</th>
                    <th>MODELO</th>
                    <th>MARCA</th>
                    <th>ESTADO</th>
                    <th>PRECIO</th>
                </tr>

                <%
                    VehiculoVO vehVO = new VehiculoVO();
                    VehiculoDAO vehDAO = new VehiculoDAO();
                    ArrayList<VehiculoVO> listaVehiculos = vehDAO.listar();
                    for (int i = 0; i < listaVehiculos.size(); i++) {

                        vehVO = listaVehiculos.get(i);
                %>

                <tr>

                    <td><%=vehVO.getVehPlaca()%></td>
                    <td><%=vehVO.getDatosId()%></td>
                    <td><%=vehVO.getCategoriaId()%></td>
                    <td><%=vehVO.getVehModelo()%></td>
                    <td><%=vehVO.getVehMarca()%></td>
                    <td><%=vehVO.getVehEstado()%></td>
                    <td><%=vehVO.getVehPrecio()%></td>


                </tr>
                <%}%>
            </table>
        </form>
            <br>
            <br>
            <br>
            <form method="post" action="GenerarPDF.jsp" target="_black">
                
                <input type="submit" value="Generar Reporte">
                <input type="hidden" value="ReporteVehiculos.jasper" name="nombreReporte">
                
            </form >
            <br>
            <br>
            <form method="post" action="GenerarPDFParametrizado.jsp" target="_black">
                <select name="textEstado">
                    <option value="NUEVO">NUEVO</option>
                    <option value="USADO">USADO</option>
                    
                </select>
                
                <input type="submit" value="Generar Reporte">
                <input type="hidden" value="ReporteParametrizado.jasper" name="nombreReporte">
                
            </form >
        <br>
         <a href="menu.jsp"><input type="submit" value="Volver al Menù" name="Volver al Menù"></a>
    </center>

</body>
</html>
