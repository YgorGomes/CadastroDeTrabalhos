package br.com.fiap.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Escola;
import br.com.fiap.entity.Professores;

//@WebServlet(value="CadastroDeTrabalhos/admin/CadastroAluno.jsp")

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(
		urlPatterns = { "/admin/professores" }, 
		initParams = { 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "pwd", value = "admin")
		})
public class ProfessoresServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			
			
			
			
		}catch (Exception e){
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("professores post");
		try {
			String nomeProfessor = request.getParameter("nomeProfessor");
			int idescola = Integer.parseInt(request.getParameter("idescola"));
						
			Professores professor = new Professores();
			professor.setNomeProfessor(nomeProfessor);
			professor.setIdescola(idescola);
			
			
			GenericDao<Professores> dao = new GenericDao(Professores.class); 
			dao.adicionar(professor);			
			request.setAttribute("msg", "Professor cadastrada "+professor.getNomeProfessor());
			request.getRequestDispatcher("/admin/cadastroProfessor.jsp").forward(request, response);

			System.out.println("Professor Cadastrado");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("mensagem", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("cadastroProfessor.jsp").forward(request, response);

		}
	}

}
