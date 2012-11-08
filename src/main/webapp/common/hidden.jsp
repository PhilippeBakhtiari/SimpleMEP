<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">SimpleMEP About</h3>
  </div>
  <div class="modal-body">
    <p>Created by Philippe Bakhtiari - 2012.</p>
        <p>Spring MVC 3, boostrap.js, jQuery, XQuery, JSF...</p>
  </div>
  <div class="modal-footer">
    <button class="btn btn-success" data-dismiss="modal" aria-hidden="true">Okay !</button>
  </div>
</div>

    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="<c:url value="/"/>">SimpleMEP</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li class="active"><a href="<c:url value="/"/>">Home</a></li>
              <li><a href="<c:url value="/mep"/>">MEPs</a></li>
              <li><a href="<c:url value="/impact"/>">Impacts</a></li>
              <li><a href="#myModal" data-toggle="modal">About</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>