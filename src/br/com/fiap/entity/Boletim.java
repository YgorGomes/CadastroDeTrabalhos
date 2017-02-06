package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="boletim")
public class Boletim implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="IDBOLETIM")
	private int idBoletim;
	
	@Column(name="IDALUNO")
	private int idAluno;
	
	@Column(name="IDDISCIPLINA")
	private int idDisciplina;
	
	@Column(name="NOTA1")
	private double nota1;
	
	@Column(name="NOTA2")
	private double nota2;
	
	@Column(name="NOTA3")
	private double nota3;

	public int getIdBoletim() {
		return idBoletim;
	}

	public void setIdBoletim(int idBoletim) {
		this.idBoletim = idBoletim;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	

}
