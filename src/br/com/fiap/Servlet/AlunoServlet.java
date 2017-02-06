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
import br.com.fiap.entity.Escola;


/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(
		urlPatterns = { "/admin/aluno" }, 
		initParams = { 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "pwd", value = "admin")
		})
public class AlunoServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Escola post");
		
		try {
			String nomeAluno = request.getParameter("nomeAluno");
			int idescola = Integer.parseInt(request.getParameter("idescola")); 
			int idcurso = Integer.parseInt(request.getParameter("idcurso"));
			int iddisciplina = Integer.parseInt(request.getParameter("iddisciplina"));
			
			Aluno aluno = new Aluno();
			aluno.setNomeAluno(nomeAluno);
			aluno.setIdEscola(idescola);
			aluno.setIdCurso(idcurso);
			aluno.setIdDisciplina(iddisciplina);
			
			
			
			
			GenericDao<Aluno> dao = new GenericDao(Aluno.class); 
			dao.adicionar(aluno);			
			request.setAttribute("msg", "Aluno cadastrado "+ aluno.getNomeAluno());
			request.getRequestDispatcher("admin/cadastroAluno.jsp").forward(request, response);

			System.out.println("Aluno Cadastrado");
		} catch (Exception e) {
			System.out.println("caiu no catch");
			e.printStackTrace();
			request.setAttribute("mensagem", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("cadastroAluno.jsp").forward(request, response);

		}
		
	}

}
