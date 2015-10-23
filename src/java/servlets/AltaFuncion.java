package servlets;

import controller.ControladoraFunciones;
import controller.ControladoraPeliculas;
import controller.ControladoraSalas;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Sala;
import model.Pelicula;

@WebServlet(name = "AltaFuncion", urlPatterns = {"/alta_funcion"})
public class AltaFuncion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        ControladoraFunciones controlFunciones = ControladoraFunciones.getInstance();

        int id_sala = Integer.parseInt(request.getParameter("sala")),
                id_pelicula = Integer.parseInt(request.getParameter("pelicula"));

        /*String string = "January 2, 2010";
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        Date date = format.parse(string);*/

        String fechaHora = request.getParameter("fecha_hora");
        
        SimpleDateFormat formatFecha = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        
        Date fecha = null;
        Time hora = null;
        
        try {
            fecha = formatFecha.parse(fechaHora);
            hora = new Time(fecha.getTime());
        } catch(ParseException e) {
            System.out.println(e.getMessage());
        }
     
        Sala sala = ControladoraSalas.getInstance().buscarPorId(id_sala);
        Pelicula pelicula = ControladoraPeliculas.getInstance().buscarPorId(id_pelicula);
        
        controlFunciones.agregar(pelicula, sala, fecha, hora);
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
