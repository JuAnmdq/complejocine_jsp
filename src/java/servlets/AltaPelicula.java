package servlets;

import controller.ControladoraPeliculas;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AltaPelicula", urlPatterns = {"/alta_pelicula"})
public class AltaPelicula extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        
        String titulo = request.getParameter("titulo"), 
               director = request.getParameter("director"), 
               genero = request.getParameter("genero"), 
               imagen = request.getParameter("imagen");
        
        Double duracion = Double.parseDouble(request.getParameter("duracion"));
        
        ControladoraPeliculas controlPeliculas = ControladoraPeliculas.getInstance();
        controlPeliculas.agregar(titulo, director, duracion, genero, imagen);
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
