package br.com.fiap.dao;

import java.util.List;

import javax.persistence.Query;

import br.com.fiap.entity.Usuario;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class UsuarioDao extends GenericDao{

	public UsuarioDao(Class classe) {
		super(classe);
		
	}
	
	
	public Usuario buscarUsuario(String nome, String senha){
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();		

		Query query = em.createQuery(
			"select u from Usuario u where nome = :nome and senha = :senha");

		query.setParameter("nome", nome);
		query.setParameter("senha", senha);
		List<Usuario> usuarios = query.getResultList();
		if(usuarios.size() > 0)
			return usuarios.get(0);
		else
			return null;
	}
	
		
	}
	
	


