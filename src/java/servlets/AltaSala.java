package servlets;

import controller.ControladoraCines;
import controller.ControladoraSalas;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cine;

@WebServlet(name = "AltaSala", urlPatterns = {"/alta_sala"})
public class AltaSala extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF8");

        ControladoraSalas controlSalas = ControladoraSalas.getInstance();

        int id = Integer.parseInt(request.getParameter("cine")),
                filas = Integer.parseInt(request.getParameter("filas")),
                columnas = Integer.parseInt(request.getParameter("columnas"));

        String nombre = request.getParameter("nombre");

        Cine cine = ControladoraCines.getInstance().buscarPorId(id);
        controlSalas.agregar(cine, nombre, filas, columnas);
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
