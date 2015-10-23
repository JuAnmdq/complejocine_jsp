package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.sql.Time;
import model.Reserva;
import java.util.List;
import controller.ControladoraReservas;

public final class reservas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 List<Reserva> reservas = ControladoraReservas.getInstance().getLista(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("    <title>Reservas</title>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <h1>Reservas</h1>\r\n");
      out.write("\r\n");
      out.write("    <table class=\"table table-hover\">\r\n");
      out.write("      <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th>Espectador</th>\r\n");
      out.write("          <th>Fecha</th>\r\n");
      out.write("          <th>Hora</th>         \r\n");
      out.write("          <th>Pelicula</th>\r\n");
      out.write("          <th>Sala</th>\r\n");
      out.write("          <th>Cine</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </thead>\r\n");
      out.write("      <tbody>\r\n");
      out.write("        ");
 for (Reserva reserva : reservas) { 
      out.write("\r\n");
      out.write("        ");
 String nombre = reserva.getUsuario().getNombre(); 
      out.write("\r\n");
      out.write("        ");
 Date fecha = reserva.getFuncion().getFecha(); 
      out.write("\r\n");
      out.write("        ");
 Time hora = (Time) reserva.getFuncion().getHora(); 
      out.write("\r\n");
      out.write("        ");
 String pelicula = reserva.getFuncion().getPelicula().getTitulo(); 
      out.write("\r\n");
      out.write("        ");
 String sala = reserva.getFuncion().getSala().getNombre(); 
      out.write("\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>");
      out.print( nombre );
      out.write("</td>\r\n");
      out.write("          <td>");
      out.print( fecha );
      out.write("</td>\r\n");
      out.write("          <td>");
      out.print( reserva.getFuncion().getHora() );
      out.write("</td>\r\n");
      out.write("          <td>");
      out.print( reserva.getFuncion().getPelicula().getTitulo() );
      out.write("</td>\r\n");
      out.write("          <td>");
      out.print( reserva.getFuncion().getSala().getNombre() );
      out.write("</td>\r\n");
      out.write("          <td>");
      out.print( reserva.getFuncion().getSala().getCine().getNombre() );
      out.write("</td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");
 }; 
      out.write("\r\n");
      out.write("      </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
