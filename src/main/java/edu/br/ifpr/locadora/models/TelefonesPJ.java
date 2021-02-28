package edu.br.ifpr.locadora.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "telefonespj")
public class TelefonesPJ {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoTelefonePJ;
    private String Telefone;
    
    
	public TelefonesPJ() {}


	public TelefonesPJ(int codigoTelefonePJ, String telefone) {
		super();
		this.codigoTelefonePJ = codigoTelefonePJ;
		Telefone = telefone;
	}


	public int getCodigoTelefonePJ() {
		return codigoTelefonePJ;
	}


	public void setCodigoTelefonePJ(int codigoTelefonePJ) {
		this.codigoTelefonePJ = codigoTelefonePJ;
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
		result = prime * result + codigoTelefonePJ;
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
		TelefonesPJ other = (TelefonesPJ) obj;
		if (codigoTelefonePJ != other.codigoTelefonePJ)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TelefonesPJ [codigoTelefonePJ=" + codigoTelefonePJ + ", Telefone=" + Telefone + "]";
	}
	
	
}
