package br.com.fiap.bean.copy;

import java.util.List;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Escola;

public class ProfessoresBean {
	public List<Escola> getListaEscola(){
		GenericDao<Escola> dao = new GenericDao<>(Escola.class);
		return dao.listar();
	}

}
