package edu.br.ifpr.locadora.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "clientespf")
public class ClientesPF {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoClientePF;
	private String nome;
	
	private String cpf;
	private String email;
    private EnderecosPF enderecosPF;
    private TelefonesPF telefonesPF;
    
    
	public ClientesPF() {}


	public ClientesPF(int codigoClientePF, String nome, String cpf, String email, EnderecosPF enderecosPF,
			TelefonesPF telefonesPF) {
		super();
		this.codigoClientePF = codigoClientePF;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.enderecosPF = enderecosPF;
		this.telefonesPF = telefonesPF;
	}


	public int getCodigoClientePF() {
		return codigoClientePF;
	}


	public void setCodigoClientePF(int codigoClientePF) {
		this.codigoClientePF = codigoClientePF;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public EnderecosPF getEnderecosPF() {
		return enderecosPF;
	}


	public void setEnderecosPF(EnderecosPF enderecosPF) {
		this.enderecosPF = enderecosPF;
	}


	public TelefonesPF getTelefonesPF() {
		return telefonesPF;
	}


	public void setTelefonesPF(TelefonesPF telefonesPF) {
		this.telefonesPF = telefonesPF;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoClientePF;
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
		ClientesPF other = (ClientesPF) obj;
		if (codigoClientePF != other.codigoClientePF)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ClientesPF [codigoClientePF=" + codigoClientePF + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email
				+ ", enderecosPF=" + enderecosPF + ", telefonesPF=" + telefonesPF + "]";
	}
	
	
    
    
    

}
