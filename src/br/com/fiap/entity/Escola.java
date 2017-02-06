package br.com.fiap.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.fiap.dao.GenericDao;

@Entity
@Table(name="escola")
public class Escola implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="IDESCOLA")
	private int idescola;
	
	@Column(name="NOMEESCOLA")
	private String nomeEscola;
	
	@Column(name="ENDERECO")
	private String endereco;
	
	@Column(name="TELEFONE")
	private String telefone;

	public int getIdescola() {
		return idescola;
	}

	public void setIdescola(int idescola) {
		this.idescola = idescola;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	

}
