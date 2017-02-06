package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cursos")
public class Cursos implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="IDCURSO")
	private int idCurso;
	
	@Column(name="NOMECURSO")
	private String nomeCurso;
	
	@Column(name="IDESCOLA")
	private int idEscola;
	

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public int getIdEscola() {
		return idEscola;
	}

	public void setIdEscola(int idEscola) {
		this.idEscola = idEscola;
	}
	
	

}
