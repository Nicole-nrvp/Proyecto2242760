/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ModeloDAO.DatosPDAO;
import ModeloVO.DatosPVO;
import ModeloVO.UsuarioVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Intel
 */
@WebServlet(name = "DatosControlador", urlPatterns = {"/Datos"})
public class DatosControlador extends HttpServlet {

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
        String datId = request.getParameter("textDatId");
        String usuId = request.getParameter("textUsuId");
        String datNombre = request.getParameter("textNombre");
        String datApellido = request.getParameter("textApellido");
        String datTipo = request.getParameter("textTipo");
        String datNumero = request.getParameter("textNumero");
        String datTelefono = request.getParameter("textTelefono");
        String datCorreo = request.getParameter("textCorreo");
        //PASO 2
        //QUIEN TIENE LOS DATOS DE FORMA SEGURA? EL VO 
        //Instacncio el VO
        DatosPVO datpVO = new DatosPVO(datId, usuId, datNombre, datApellido, datTipo, datNumero, datTelefono, datCorreo);

        //PASO 3 
        //QUIEN HACE LAS OPERACIONES? EL DAO 
        //Instacncio el DAO y hace las operaciones que estan en el VO
        DatosPDAO datpDAO = new DatosPDAO(datpVO);

        //PASO 4
        //ADMINISTRAR OPERACIONES CON CASOS (SWITCH)
        switch (opcion) {

            //METODOS GENERICOS
            case 1:
                //vvista dos actualizar registro
                //Si actualizar SE LOGRO EL LA VISTA MUESTRA CORRECTO
//////////////////////////////////////////////////////////////////////////////////////////////////////////////   
               // datpVO = datpDAO.consultarId(datId);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////                
                if (datpDAO.actualizarRegistro()) {
                    request.setAttribute("mensajeExito", "Los datos se actualizaron correctamente");
                    
                    //request.setAttribute("mensajeExito", "PASO AL CONTROLADOR");
                    //Si actualizar SE LOGRO EL LA VISTA MUESTRA ERROR 
                } else {
                    request.setAttribute("mensajeError", "Los datos no se actualizaron correctamente");
                }
                //REDIRECCIONA A LA MISMA PAGINA PARA QUE MUESTRE LOS MENSAJES 
                //.forwar me permite mandar peticiones http (un get)
                request.getRequestDispatcher("editarPerfil.jsp").forward(request, response);
                //acaba el caso
                break;

            case 2:
                
                datpVO = datpDAO.consultarDatos(usuId);
                if (datpVO != null) {

                    request.setAttribute("datoConsultado", datpVO);
                    request.getRequestDispatcher("registrarVehiculo.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "Los Datos NO Existen");
                    request.getRequestDispatcher("registrarVehiculo.jsp").forward(request, response);

                }
                break;
            //METODOS PROPIOS 
            case 3:

                datpVO = datpDAO.consultarNombre(datNombre);
                if (datpVO != null) {

                    request.setAttribute("datoConsultado", datpVO);
                    request.getRequestDispatcher("editarPerfil.jsp").forward(request, response);

                } else {
                    request.setAttribute("mensajeError", "Los Datos NO Existen");
                    request.getRequestDispatcher("consultarVehiculo.jsp").forward(request, response);

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
