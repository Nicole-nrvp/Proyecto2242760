<%-- 
    Document   : Sesiones
    Created on : 02-jun-2021, 14:24:35
    Author     : Intel
--%>

<%@page import="ModeloVO.DatosPVO"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    //response peticiones internas... 
    //NO MANEJAR CACHE Y LE ESTOY DICIENDO QUE NO ME ALMACENE
    response.setHeader("Pragma", "No-cache");
    //LE VAMOS A DECIR valores predeterminados
    response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
    //Propiedad que se aplica (si experia se cierra y inicia sesion otra vez)
    response.setDateHeader("Expires", 0);

%>

<%    //traer la sesion
    HttpSession buscarSesion = (HttpSession) request.getSession();
    String usuario = "";
    String usuarioId = "";
    String Nombre = "";
    String Apellido = "";
    String Telefono = "";
    String Correo = "";

    if (buscarSesion.getAttribute("datosUsuario") == null) {
        request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);
    } else {
        //se crea un objeto
        UsuarioVO usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
        usuario = usuVO.getUsuLogin();
        usuarioId = usuVO.getUsuId();

    }

%>

<%    DatosPVO datpVO = new DatosPVO();
    datpVO = (DatosPVO) buscarSesion.getAttribute("datosPersonales");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style=" float: right;">
            <h1 style="color: black;">Bienvenido/a:  <%=datpVO.getDatNombre() + " " + datpVO.getDatApellido()%></h1>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <br>
            <form method="post" action="Sesiones">
                <a href="iniciarSesion.jsp"><input type="submit" value="Cerrar Sesion" name="Cerrar Sesiòn"></a>
            </form>
        </div>
    </body>
</html>
