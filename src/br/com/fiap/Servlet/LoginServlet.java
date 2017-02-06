package br.com.fiap.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.entity.Usuario;

//@WebServlet(value="CadastroDeTrabalhos/admin/CadastroAluno.jsp")

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(
		urlPatterns = { "/login" }, 
		initParams = { 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "pwd", value = "admin")
		})
public class LoginServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login post");
		try {
			String nome = request.getParameter("nome");
			String senha = request.getParameter("senha");
						
			UsuarioDao dao = new UsuarioDao(Usuario.class);			
			
			Usuario usuario = dao.buscarUsuario(nome, senha);
			System.out.println("Passou aqui");
			
			
			if(usuario != null){
				
				HttpSession session = request.getSession();
				session.setAttribute("session_usuario", usuario);
				response.sendRedirect("admin/cadastroAluno.jsp");
			}
			else{
				System.out.println("Não criou a session");
				response.sendRedirect("login.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("mensagem", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("cadastroAluno.jsp").forward(request, response);

		}
	}

}
