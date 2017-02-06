<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" href="../resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="../resources/css/estilo2.css">
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<!-- barra de navegação -->
     <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle de navegação</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Controle de Trabalhos</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="../login.jsp">Logout</a></li>
          </ul>
        </div>
      </div>
    </nav>
    <!-- fim barra de navegação -- >
   <div class="container-fuild">
      <div class="row">
        
        <!-- Corpo -->
        <div class="col-sm-12 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1>Gerenciador de trabalhos escolares</h1>
          <h2 class="sub-header">Dados do Aluno</h2>
          <h4>Curso: </h4>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
              <tr>
                <th>Disciplina</th>
                <th>Nota 1</th>
                <th>Nota 2</th>
                <th>Nota 3</th>
                <th>Média Final</th>
               
                
              </tr>
             </thead>
             <tbody id="tabela">
               <tr>
                  <td>Java 1</td>
                  <td>7.0</td>
                  <td>6.0</td>
                  <td>8.0</td>
                  <td>7</td>
                  
                </tr>
               
              </tbody>
              
            </table>
          </div>
        </div>
        <!-- fim Corpo -->
         
     
	
</body>
<script  src="../resources/js/jquery.js" type="text/javascript"></script>
<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</html>