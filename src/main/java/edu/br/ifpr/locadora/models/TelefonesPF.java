package edu.br.ifpr.locadora.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "telefonespf")
public class TelefonesPF {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoTelefonePF;
    private String Telefone;
    
    
	public TelefonesPF() {}


	public TelefonesPF(int codigoTelefonePF, String telefone) {
		super();
		this.codigoTelefonePF = codigoTelefonePF;
		Telefone = telefone;
	}


	public int getCodigoTelefonePF() {
		return codigoTelefonePF;
	}


	public void setCodigoTelefonePF(int codigoTelefonePF) {
		this.codigoTelefonePF = codigoTelefonePF;
	}


	public String getTelefone() {
		return Telefone;
	}


	public void setTelefone(String telefone) {
		Telefone = telefone;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoTelefonePF;
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
		TelefonesPF other = (TelefonesPF) obj;
		if (codigoTelefonePF != other.codigoTelefonePF)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TelefonesPF [codigoTelefonePF=" + codigoTelefonePF + ", Telefone=" + Telefone + "]";
	}
	
	
}
