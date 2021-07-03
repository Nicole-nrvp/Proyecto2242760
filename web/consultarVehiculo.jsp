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
        <div class="contenedor">

            <div class="header">
                <br>
                <h2>CONSULTAR VEHICULO</h2>
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
                <form method="post" action="Vehiculo">
                    <table>
                        <tr>
                            <th>
                                <h3>PLACA<input type="text" name="textPlaca"> <button>Consultar</button>  </h3>
                            </th>     
                        </tr>
                    </table><br><br>

                    <input type="hidden" value="3" name="opcion">    
                </form>
                <div style="color: red;">

                    <%                if (request.getAttribute("mensajeError") != null) { %>
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
                    <div class="reportes">
                <form method="post" action="GenerarPDF.jsp" target="_black">

                    <input class="submit" type="submit" value="Generar Reporte">
                    <input type="hidden" value="ReporteVehiculos.jasper" name="nombreReporte">
                </form>
                <form method="post" action="GenerarPDFParametrizado.jsp" target="_black">
                    <select name="textEstado">
                        <option value="NUEVO">NUEVO</option>
                        <option value="USADO">USADO</option>
                    </select>
                    <input class="submit" type="submit" value="Generar Reporte">
                    <input type="hidden" value="ReporteParametrizado.jasper" name="nombreReporte">
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
        </div>
    </div>

</body>
</html>
