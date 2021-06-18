<%-- 
    Document   : consultarVehiculo
    Created on : 14/05/2021, 08:45:44 AM
    Author     : Andrés
--%>

<%@page import="ModeloDAO.DatosPDAO"%>
<%@page import="ModeloVO.DatosPVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.VehiculoDAO"%>
<%@page import="ModeloVO.VehiculoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Estilos/estiloConsultarV.css" rel="stylesheet" type="text/css"/>
        <title>Consultar Datos</title>
    </head>
    <body>
    <center>

        <h1>Datos</h1>

        <form method="post" action="Datos">
            <br>
            <table>
                <tr>
                    <th>
                        Nombre
                        <input type="text" name="textNombre"> 
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
                    <th>NOMBRE</th>
                    <th>APELLIDO</th>
                    <th>TELEFONO</th>
                    <th>CORREO</th>
                </tr>

                <%
                    DatosPVO datpVO = new DatosPVO();
                    DatosPDAO datpDAO = new DatosPDAO();
                    ArrayList<DatosPVO> listaDatos = datpDAO.obtener();
                    for (int i = 0; i < listaDatos.size(); i++) {

                        datpVO = listaDatos.get(i);
                %>

                <tr>

                    <td><%=datpVO.getDatNombre()%></td>
                    <td><%=datpVO.getDatApellido()%></td>
                    <td><%=datpVO.getDatTelefono()%></td>
                    <td><%=datpVO.getDatCorreo()%></td>


                </tr>
                <%}%>
            </table>
        </form>
        <br>
         <a href="menu.jsp"><input type="submit" value="Volver al Menù" name="Volver al Menù"></a>
    </center>

</body>
</html>
