<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="br.com.fiap.entity.Usuario"%>
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
            <li><a href="#">Inicio</a></li>
            <li><a href="../login.jsp">Logout</a></li>
          </ul>
        </div>
      </div>
    </nav>
    <!-- fim barra de navegação -- >
   <div class="container-fuild">
      <div class="row">
        <!-- Barra lateral -->
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
          	<li><h4>Funcionalidades</h4></li>
          	<li><a href="cadastroEscola.jsp">Nova Escola</a></li>
          	<li><a href="cadastroProfessor.jsp">Novo Professor</a></li>
          	<li><a href="cadastroCurso.jsp">Novo Curso</a></li>
          	<li><a href="cadastroDisciplina.jsp">Nova Disciplina</a></li>
            <li><a href="cadastroAluno.jsp">Novo Aluno</a></li>
          </ul>
        </div>
        <!-- fim Barra lateral -->
        <!-- Corpo -->
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1>Gerenciador de trabalhos escolares</h1>
          <h2 class="sub-header">Novo aluno</h2>
          <div class="">
            <form action="aluno" method="post">
             
              <div class="form-group">
                <label for="nomeAluno">Nome: </label>
                <input type="text" class="form-control" id="nomeAluno" name="nomeAluno" placeholder="Nome do aluno">
              </div>
              
              <div class="form-group">
                <label for="escola">Seleciona a Escola do aluno: </label>
                <select class="form-control" id="idescola" name="idescola">
                  <option value="1">Fiap</option>
                  <option value="2">Unip</option>
                  <option value="3">FMU</option>
          		</select>
              </div>
              
              <div class="form-group">
                <label for="escola">Seleciona o curso: </label>
                <select class="form-control" id="idcurso" name="idcurso">
                  <option value="20">Administração</option>
                  <option value="21">Sistemas de Informação</option>
                  <option value="22">Matemática</option>
          		</select>
              </div>
              <div class="form-group">
                <label for="escola">Selecione a disciplina: </label>
                <select class="form-control" id="iddisciplina" name="iddisciplina">
                  <option value="31">Calculo 1</option>
                  <option value="32">Java 1</option>
                  <option value="33">Banco de dados</option>
          		</select>
              </div>
              
              <div class="form-group">
              	<input type="submit" class="btn btn-success" id="salvar" value="Cadastrar novo aluno" >
              </div>
            </form>

          </div>
        </div>
        <!-- fim Corpo -->
         
</body>
<script  src="../resources/js/jquery.js" type="text/javascript"></script>
<script src="../resources/bootstrap/js/bootstrap.min.js"></script>
</html>