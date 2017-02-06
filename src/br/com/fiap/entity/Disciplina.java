package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="disciplina")
public class Disciplina implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="IDDISCIPLINA")
	private int idDisciplina;
	
	@Column(name="NOMEDISCIPLINA")
	private String nomeDisciplna;
	
	@Column(name="IDCURSO")
	private int idCurso;
	
	@Column(name="IDPROFESSOR")
	private int idProfessor;

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNomeDisciplna() {
		return nomeDisciplna;
	}

	public void setNomeDisciplna(String nomeDisciplna) {
		this.nomeDisciplna = nomeDisciplna;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	
	

}
