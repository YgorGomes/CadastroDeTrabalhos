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

//@WebServlet(value="CadastroDeTrabalhos/admin/CadastroAluno.jsp")

/**
 * Servlet implementation class ServletLogin
 */
@WebServlet(
		urlPatterns = { "/admin/escola" }, 
		initParams = { 
				@WebInitParam(name = "user", value = "root"), 
				@WebInitParam(name = "pwd", value = "admin")
		})
public class EscolaServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Escola post");
		
		try {
			String nomeEscola = request.getParameter("nomeEscola");
			String endereco = request.getParameter("endereco");
			String telefone = request.getParameter("telefone");
			
			Escola escola = new Escola();
			escola.setNomeEscola(nomeEscola);
			escola.setEndereco(endereco);
			escola.setTelefone(telefone);
			
			GenericDao<Escola> dao = new GenericDao(Escola.class); 
			dao.adicionar(escola);			
			request.setAttribute("msg", "Escola cadastrada "+escola.getNomeEscola());
			request.getRequestDispatcher("cadastroEscola.jsp").forward(request, response);

			System.out.println("Escola Cadastrado");
		} catch (Exception e) {
			System.out.println("caiu no catch");
			e.printStackTrace();
			request.setAttribute("mensagem", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("cadastroAluno.jsp").forward(request, response);

		}
		
	}

}
