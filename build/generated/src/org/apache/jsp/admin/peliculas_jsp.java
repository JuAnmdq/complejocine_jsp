package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import controller.ControladoraPeliculas;
import model.Pelicula;
import java.util.List;

public final class peliculas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          padding-left: 20px;\r\n");
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
      out.write("            <li><a href=\"salas.jsp\"><i class=\"fa fa-globe\"></i> Salas</a></li>\r\n");
      out.write("            <li class=\"selected\"><a href=\"peliculas.jsp\"><i class=\"fa fa-list-ol\"></i> Peliculas</a></li>\r\n");
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
      out.write("        <div class=\"row text-center\">\r\n");
      out.write("          <h2>Peliculas</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        ");
 List<Pelicula> peliculas = ControladoraPeliculas.getInstance().getLista(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("\r\n");
      out.write("          <table class=\"table table-hover\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th>Titulo</th>\r\n");
      out.write("                <th>Director</th>\r\n");
      out.write("                <th>Duración(minutos)</th>\r\n");
      out.write("                <th>Imagen</th>\r\n");
      out.write("                <th></th>\r\n");
      out.write("                <th></th>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("\r\n");
      out.write("            <tbody>\r\n");
      out.write("              ");
 for (Pelicula pelicula : peliculas) {
      out.write("\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td>");
      out.print( pelicula.getTitulo());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( pelicula.getDirector());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( pelicula.getDuracion());
      out.write("</td>\r\n");
      out.write("                <td><img src=\"");
      out.print( pelicula.getImagen());
      out.write("\" alt=\"\" height=\"40\" width=\"40\"></td>\r\n");
      out.write("                <td>  \r\n");
      out.write("                  <form action=\"modifica_pelicula.jsp\" method=\"post\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"pelicula\" value=\"");
      out.print( pelicula.getId());
      out.write("\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Modificar\" class=\"btn btn-primary\">\r\n");
      out.write("                  </form>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>  \r\n");
      out.write("                  <form action=\"../baja_pelicula\" method=\"post\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"pelicula\" value=\"");
      out.print( pelicula.getId());
      out.write("\">\r\n");
      out.write("                    <input type=\"submit\" value=\"Eliminar\" class=\"btn btn-primary\">\r\n");
      out.write("                  </form>\r\n");
      out.write("                </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              ");
 }
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("          </table> \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
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
