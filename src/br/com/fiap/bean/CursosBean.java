package br.com.fiap.bean;

import java.util.List;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Cursos;


public class CursosBean {
	public List<Cursos> getListaCursos(){
		GenericDao<Cursos> dao = new GenericDao<>(Cursos.class);
		return dao.listar();
	}

}
