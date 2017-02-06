package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="professores")
public class Professores implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="IDPROFESSORES")
	private int idProfessores;
	
	@Column(name="NOMEPROFESSOR")
	private String nomeProfessor;
	
	@Column(name="IDESCOLA")
	private int idEscola;

	public int getIdprofessores() {
		return idProfessores;
	}

	public void setIdprofessores(int idprofessores) {
		this.idProfessores = idprofessores;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public int getIdescola() {
		return idEscola;
	}

	public void setIdescola(int idescola) {
		this.idEscola = idescola;
	}
	
	

}
