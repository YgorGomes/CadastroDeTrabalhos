package br.com.fiap.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.entity.Usuario;

@WebFilter("/professor/*")
public class FilterpProfessor implements Filter {

    public FilterpProfessor() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpSession session = ((HttpServletRequest)request).getSession();
		HttpServletRequest req = (HttpServletRequest)request;
		Usuario usuario = (Usuario)session.getAttribute("session_usuario");
		
	
		
		if(usuario != null){
			if(usuario.getNivel() == 2){
				((HttpServletResponse)response).sendRedirect("/CadastroDeTrabalhos/aluno/dadosAluno.jsp?id="+usuario.getId());
			}else if(usuario.getNivel() == 3){
				((HttpServletResponse)response).sendRedirect("/CadastroDeTrabalhos/professor/inicio.jsp?id="+usuario.getId());
				
			}
			chain.doFilter(request, response);
		}
		else {
			
			((HttpServletResponse)response).sendRedirect("/CadastroDeTrabalhos/login.jsp");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}
