package edu.br.ifpr.locadora.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.br.ifpr.locadora.models.ClientesPJ;


@Repository
public interface ClientesPJRepositories extends JpaRepository<ClientesPJ, Integer> {
	
	public List<ClientesPJ> findByNome(String nome);
	public List<ClientesPJ> findByNomeContaining(String nome);
	
	public ClientesPJ findByEmail(String email);

}
