/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.DatosPDAO;
import ModeloDAO.UsuarioDAO;
import ModeloVO.DatosPVO;
import ModeloVO.UsuarioVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author usuario
 */
//quitar el controlador al final
@WebServlet(name = "UsuarioControlador", urlPatterns = {"/Usuario"})
public class UsuarioControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        //Recoger elementos scanner (RECIBIR DATOS DE LAS VISTAS)
        int opcion = Integer.parseInt(request.getParameter("opcion"));
        String usuId = request.getParameter("textId");
        String usuLogin = request.getParameter("textUsuario");
        String usuPassword = request.getParameter("textClave");

        //PASO 2
        //QUIEN TIENE LOS DATOS DE FORMA SEGURA? EL VO 
        //Instacncio el VO
        UsuarioVO usuVO = new UsuarioVO(usuId, usuLogin, usuPassword);
        // datPVO = new DatosPVO(usuId, usuId, usuLogin, usuId, usuId, usuId, usuLogin, usuLogin)
        //PASO 3 
        //QUIEN HACE LAS OPERACIONES? EL DAO 
        //Instacncio el DAO y hace las operaciones que estan en el VO
        UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
        
        //PASO 4
        //ADMINISTRAR OPERACIONES CON CASOS (SWITCH)
        switch (opcion) {

            //METODOS GENERICOS
            case 1: //vista uno (metodo agregar registro)
                //Si el registro SE LOGRO EL LA VISTA MUESTRA CORRECTO 
                if (usuDAO.agregarRegistro()) {
                    request.setAttribute("mensajeExito", "El usuario se registro correctamente");
                    //Si el registro SE LOGRO EL LA VISTA MUESTRA ERROR 
                } else {
                    request.setAttribute("mensajeError", "El usuario no se registro correctamente");
                }
                //REDIRECCIONA A LA MISMA PAGINA PARA QUE MUESTRE LOS MENSAJES 
                //.forwar me permite mandar peticiones http (un get)
                request.getRequestDispatcher("registrarUsuario.jsp").forward(request, response);
                //acaba el caso
                break;

            case 2: //vvista dos actualizar registro
                //Si actualizar SE LOGRO EL LA VISTA MUESTRA CORRECTO 
                if (usuDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "El usuario se actualizo correctamente");
                    //Si actualizar SE LOGRO EL LA VISTA MUESTRA ERROR 
                } else {
                    request.setAttribute("mensajeError", "El usuario no se actualizo correctamente");
                }
                //REDIRECCIONA A LA MISMA PAGINA PARA QUE MUESTRE LOS MENSAJES 
                //.forwar me permite mandar peticiones http (un get)
                request.getRequestDispatcher("actualizarUsuario.jsp").forward(request, response);
                //acaba el caso
                break;

            //METODOS PROPIOS 
            case 3: //vista tres iniciar sesion
                //Si inicio lo envia al menu 
                if (usuDAO.iniciarSesion(usuLogin, usuPassword)) {

//------------------crear sesiones ----------------------------------------------------------------------------------
                    //variable de sesion se almacenan los datos para manipular los datos...
                    //variable es httpSesion NOMBRE QUE QUIERAS
                    HttpSession miSesion = request.getSession(true);
                    //se dice que datos quiero manejar
                    usuVO = new UsuarioVO(usuVO.getUsuId(), usuLogin, usuPassword);
                    //atraves de la sesion evio un atributo me trae los datos
                    miSesion.setAttribute("datosUsuario", usuVO);
//......................................................................................................................
//------------------ROLES TRAERLOS--------------------------------------------------------------------------------------
                    
                    //VAMOS A CREAR UN ARREGLOPARA RECIBIR VALOR
                    ArrayList<UsuarioVO> listaRol = usuDAO.rol(usuLogin);

                    //evaluemos
                    for (int i = 0; i < listaRol.size(); i++) {
                        usuVO = listaRol.get(i);
                    }

                    miSesion.setAttribute("rol", listaRol);

                    if (listaRol.size() > 1) {
                        request.getRequestDispatcher("menu.jsp").forward(request, response);

                    } else if (usuVO.getRol().equals("VENDEDOR")) {

                        request.getRequestDispatcher("vendedor.jsp").forward(request, response);

                    } else {
                        request.getRequestDispatcher("comprador.jsp").forward(request, response);
                    }

                } else {

                    request.setAttribute("mensajeError", "El usuario y/o la contraseña son incorrectos");
                    request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);
                }
                break;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
