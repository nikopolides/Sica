<%-- 
    Document   : header
    Created on : 18/09/2012, 00:51:51
    Author     : TonGarcia
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>SICA</title>
	<meta http-equiv="Content-type" content="text/html; charset=ISO-8859-1" />
	<link rel="stylesheet" href="style.css" type="text/css" />
        <%@include file="includes_js.jsp" %>
	<script>

		$(function() {  
  			$("#tst").click(function() {  
				// TODO validate and process form here
								
  			});
		});

		$(document).ready(function() {
			/*
			var collapseOne = document.getElementById('collapseOne');
			collapseOne.style.height = '0px';
			
			var collapseTwo = document.getElementById('collapseTwo');
			collapseTwo.style.height = '0px';

			var collapseThree = document.getElementById('collapseThree');
			collapseThree.style.height = '0px';
			*/
		});
		
	</script>
</head>
<body>
	
	<div id="header">
		<div class="container_12">
                    <div class="grid_12">
                            <div class="grid_4">
                                    <img src="images/logo.png" />
                            </div>
                            <div class=" grid_3"  id="busca_abrigada">
                                <form class="form-search">
                                    <div class="input-append">
                                      <input placeholder="Nome da abrigada" type="text" class="span2 search-query">
                                      <button type="submit" class="btn">Pesquisar</button>
                                    </div>
                                </form>
                            </div>
                            <div class="grid_2 push_3">
                                    <img src="images/gdf.png" />
                            </div>
                    </div>
		</div>
	</div>