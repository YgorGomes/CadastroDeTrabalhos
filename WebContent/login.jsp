<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="br.com.fiap.entity.Usuario"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
	<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="resources/css/estilo.css">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Login</title>
</head>
<body>
<div class="container">
			<form class="form-signin" action="login" method="post">
				<h2 class="form-signin-heading">Login de acesso</h2>
				<div  >
					<input type="text" class="form-control" id="user" name="nome" placeholder="Usuário de acesso">	
				</div>
				<div >
					<input type="password" class="form-control" id="senha" name="senha" placeholder="Password">	
				</div>
				<div>
					 <button id="login" class="btn btn-lg btn-primary btn-block" type="submit" title="Acessar"  >Acessar</button>
				</div>
			</form>
			
			


		</div>

</body>
</html>