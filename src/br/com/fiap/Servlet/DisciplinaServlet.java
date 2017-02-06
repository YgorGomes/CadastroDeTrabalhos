package br.com.fiap.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Cursos;
import br.com.fiap.entity.Disciplina;


/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(
		urlPatterns = { "/admin/disciplina" }, 
		initParams = { 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "pwd", value = "admin")
		})
public class DisciplinaServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Disciplina post");
		
		try {
			String nomeDisciplina = request.getParameter("nomeDisciplina");
			int idcurso = Integer.parseInt(request.getParameter("idcurso")); 
			int idProfessor = Integer.parseInt(request.getParameter("idProfessor"));
			
			Disciplina disciplina = new Disciplina();
			disciplina.setIdCurso(idcurso);
			disciplina.setIdProfessor(idProfessor);
					
			
			
			GenericDao<Disciplina> dao = new GenericDao(Disciplina.class); 
			dao.adicionar(disciplina);			
			request.setAttribute("msg", "Curso cadastrado "+ disciplina.getNomeDisciplna());
			request.getRequestDispatcher("admin/cadastroDisciplina.jsp").forward(request, response);

			System.out.println("Disciplina Cadastrada");
		} catch (Exception e) {
			System.out.println("caiu no catch");
			e.printStackTrace();
			request.setAttribute("mensagem", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("cadastroAluno.jsp").forward(request, response);

		}
		
	}

}
