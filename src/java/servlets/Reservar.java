package servlets;

import controller.ControladoraFunciones;
import controller.ControladoraReservas;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Funcion;
import model.Usuario;

@WebServlet(name = "Reservar", urlPatterns = {"/reservar"})
public class Reservar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession(true);

        int idFuncion = Integer.parseInt(request.getParameter("funcion"));

        ControladoraReservas controlReservas = ControladoraReservas.getInstance();

        Funcion funcion = ControladoraFunciones.getInstance().buscarPorId(idFuncion);
        Usuario user = (Usuario) session.getAttribute("user");

        controlReservas.reservar(funcion, user);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
