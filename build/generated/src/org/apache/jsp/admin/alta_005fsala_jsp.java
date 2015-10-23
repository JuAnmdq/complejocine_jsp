package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.ControladoraCines;
import model.Cine;
import java.util.List;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">  \r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Administración</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/bootstrap/css/bootstrap-theme.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/font-awesome/css/font-awesome.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/css/local.css\" />\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("      div {\r\n");
      out.write("          padding-bottom:20px;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("      <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"index.html\">Administración</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav side-nav\">\r\n");
      out.write("            <li><a href=\"dashboard.jsp\"><i class=\"fa fa-bullseye\"></i> Dashboard</a></li>\r\n");
      out.write("            <li><a href=\"cines.jsp\"><i class=\"fa fa-tasks\"></i> Cines</a></li>\r\n");
      out.write("            <li class=\"selected\"><a href=\"salas.jsp\"><i class=\"fa fa-globe\"></i> Salas</a></li>\r\n");
      out.write("            <li><a href=\"peliculas.jsp\"><i class=\"fa fa-list-ol\"></i> Peliculas</a></li>\r\n");
      out.write("            <li><a href=\"funciones.jsp\"><i class=\"fa fa-font\"></i> Funciones</a></li>\r\n");
      out.write("            <li><a href=\"usuarios.jsp\"><i class=\"fa fa-font\"></i> Usuarios</a></li>\r\n");
      out.write("            <li><a href=\"reservas.jsp\"><i class=\"fa fa-font\"></i> Reservas</a></li>\r\n");
      out.write("\r\n");
      out.write("          </ul>\r\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right navbar-user\">\r\n");
      out.write("            <li class=\"dropdown messages-dropdown\">\r\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-envelope\"></i> Messages <span class=\"badge\">2</span> <b class=\"caret\"></b></a>\r\n");
      out.write("              <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li class=\"dropdown-header\">2 New Messages</li>\r\n");
      out.write("                <li class=\"message-preview\">\r\n");
      out.write("                  <a href=\"#\">\r\n");
      out.write("                    <span class=\"avatar\"><i class=\"fa fa-bell\"></i></span>\r\n");
      out.write("                    <span class=\"message\">Security alert</span>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"divider\"></li>\r\n");
      out.write("                <li class=\"message-preview\">\r\n");
      out.write("                  <a href=\"#\">\r\n");
      out.write("                    <span class=\"avatar\"><i class=\"fa fa-bell\"></i></span>\r\n");
      out.write("                    <span class=\"message\">Security alert</span>\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"divider\"></li>\r\n");
      out.write("                <li><a href=\"#\">Go to Inbox <span class=\"badge\">2</span></a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"dropdown user-dropdown\">\r\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\"></i> Steve Miller<b class=\"caret\"></b></a>\r\n");
      out.write("              <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-user\"></i> Profile</a></li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-gear\"></i> Settings</a></li>\r\n");
      out.write("                <li class=\"divider\"></li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-power-off\"></i> Log Out</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>\r\n");
      out.write("\r\n");
      out.write("      <div>\r\n");
      out.write("        <form action=\"../alta_sala\" method=\"post\" role=\"form\">           \r\n");
      out.write("          <div class=\"row text-center\">\r\n");
      out.write("            <h2>Alta sala</h2>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <label for=\"nombre\" class=\"col-md-2\">Nombre:</label>\r\n");
      out.write("            <div class=\"col-md-9\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"nombre\" name=\"nombre\" placeholder=\"Ingrese el nombre\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <label for=\"filas\" class=\"col-md-2\">Filas:</label>\r\n");
      out.write("            <div class=\"col-md-9\">\r\n");
      out.write("              <input type=\"text\" class=\"form-control\" id=\"filas\" name=\"filas\" placeholder=\"Ingrese las filas\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <label for=\"columnas\" class=\"col-md-2\">Columnas:</label>\r\n");
      out.write("            <div class=\"col-md-9\">\r\n");
      out.write("              <input type=\"number\" class=\"form-control\" id=\"columnas\" name=\"columnas\" placeholder=\"Ingrese las columnas\">\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <label for=\"cine\" class=\"col-md-2\">Genero:</label>\r\n");
      out.write("            <div class=\"col-md-9\">\r\n");
      out.write("\r\n");
      out.write("              ");
 List<Cine> cines = ControladoraCines.getInstance().getLista();
      out.write("\r\n");
      out.write("\r\n");
      out.write("              <select name=\"cine\" id=\"genero\" class=\"form-control\">\r\n");
      out.write("\r\n");
      out.write("                ");
 for (Cine cine : cines) {
      out.write("\r\n");
      out.write("                <option value=\"");
      out.print( cine.getId());
      out.write('"');
      out.write('>');
      out.print( cine.getNombre());
      out.write("</option>\r\n");
      out.write("                ");
 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("              </select>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-2\"></div>\r\n");
      out.write("            <div class=\"col-md-10\">\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary\">Ingresar</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
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
