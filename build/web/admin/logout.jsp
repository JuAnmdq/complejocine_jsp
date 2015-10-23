<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% Usuario _user = (Usuario) session.getAttribute("user");%>

<ul class="nav navbar-nav navbar-right navbar-user">
  <li class="dropdown user-dropdown">
    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> <%= _user.getNombre()%><b class="caret"></b></a>
    <ul class="dropdown-menu">
      <li class="divider"></li>
      <li><a href="#"><i class="fa fa-power-off"></i> Log Out</a></li>
    </ul>
  </li>
</ul>