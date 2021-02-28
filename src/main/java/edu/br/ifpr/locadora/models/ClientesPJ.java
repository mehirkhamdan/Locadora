package edu.br.ifpr.locadora.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="clientespj")
public class ClientesPJ {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoClientePJ;
	private String nome;
	private String cnpj;
    private String email;
	private EnderecosPJ enderecosPJ;
    private TelefonesPJ telefonesPJ;
    
    
	public ClientesPJ() {}


	public ClientesPJ(int codigoClientePJ, String nome, String cnpj, String email, EnderecosPJ enderecosPJ,
			TelefonesPJ telefonesPJ) {
		super();
		this.codigoClientePJ = codigoClientePJ;
		this.nome = nome;
		this.cnpj = cnpj;
		this.email = email;
		this.enderecosPJ = enderecosPJ;
		this.telefonesPJ = telefonesPJ;
	}


	public int getCodigoClientePJ() {
		return codigoClientePJ;
	}


	public void setCodigoClientePJ(int codigoClientePJ) {
		this.codigoClientePJ = codigoClientePJ;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public EnderecosPJ getEnderecosPJ() {
		return enderecosPJ;
	}


	public void setEnderecosPJ(EnderecosPJ enderecosPJ) {
		this.enderecosPJ = enderecosPJ;
	}


	public TelefonesPJ getTelefonesPJ() {
		return telefonesPJ;
	}


	public void setTelefonesPJ(TelefonesPJ telefonesPJ) {
		this.telefonesPJ = telefonesPJ;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoClientePJ;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientesPJ other = (ClientesPJ) obj;
		if (codigoClientePJ != other.codigoClientePJ)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ClientesPJ [codigoClientePJ=" + codigoClientePJ + ", nome=" + nome + ", cnpj=" + cnpj + ", email="
				+ email + ", enderecosPJ=" + enderecosPJ + ", telefonesPJ=" + telefonesPJ + "]";
	}
	
	
	
    
    
    

}
