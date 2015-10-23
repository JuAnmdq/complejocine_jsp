package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.ControladoraCines;
import model.Cine;
import java.util.List;
import model.Sala;
import controller.ControladoraSalas;

public final class alta_005fsala_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 List<Cine> cines = ControladoraCines.getInstance().getLista(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>JSP Page</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    <h1>Ingresar nueva sala</h1>\r\n");
      out.write("    <form action=\"alta_sala\" method=\"post\">\r\n");
      out.write("      <select name=\"cine\">\r\n");
      out.write("        ");
 for (Cine cine : cines) { 
      out.write("\r\n");
      out.write("        <option value=\"");
      out.print( cine.getId() );
      out.write('"');
      out.write('>');
      out.print( cine.getNombre() );
      out.write("</option>\r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("      </select> \r\n");
      out.write("     <input type=\"text\" name=\"nombre\" placeholder=\"Ingresa el nombre de la sala\">\r\n");
      out.write("      <input type=\"text\" name=\"filas\" placeholder=\"Ingresa la cantidad de filas\">\r\n");
      out.write("      <input type=\"text\" name=\"columnas\" placeholder=\"Ingresa la cantidad de columnas\">\r\n");
      out.write("      <input type=\"submit\" value=\"Ingresar\">\r\n");
      out.write("    </form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
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
