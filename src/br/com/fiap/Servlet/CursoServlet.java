package br.com.fiap.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.Cursos;


/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(
		urlPatterns = { "/admin/curso" }, 
		initParams = { 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "pwd", value = "admin")
		})
public class CursoServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("curso post");
		
		try {
			String nomeCurso = request.getParameter("nomeCurso");
			int idescola = Integer.parseInt(request.getParameter("idescola")); 
			
			Cursos curso = new Cursos();
			curso.setNomeCurso(nomeCurso);
						
			GenericDao<Cursos> dao = new GenericDao(Cursos.class); 
			dao.adicionar(curso);			
			request.setAttribute("msg", "Curso cadastrado "+ curso.getNomeCurso());
			request.getRequestDispatcher("admin/cadastroCurso.jsp").forward(request, response);

			System.out.println("Curso Cadastrado");
		} catch (Exception e) {
			System.out.println("caiu no catch");
			e.printStackTrace();
			request.setAttribute("mensagem", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("cadastroAluno.jsp").forward(request, response);

		}
		
	}

}
