package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="IDALUNO")
	private int idaluno;
	
	@Column(name="NOMEALUNO")
	private String nomeAluno;
	
	@Column(name="IDESCOLA")
	private int idEscola;
	
	@Column(name="IDCURSO")
	private int idCurso;
	
	@Column(name="IDDISCIPLINA")
	private int idDisciplina;

	public int getIdaluno() {
		return idaluno;
	}

	public void setIdaluno(int idaluno) {
		this.idaluno = idaluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getIdEscola() {
		return idEscola;
	}

	public void setIdEscola(int idEscola) {
		this.idEscola = idEscola;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	
	

}
