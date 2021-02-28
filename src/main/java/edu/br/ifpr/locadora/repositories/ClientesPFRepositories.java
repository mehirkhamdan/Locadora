package edu.br.ifpr.locadora.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.br.ifpr.locadora.models.ClientesPF;

@Repository
public interface ClientesPFRepositories extends JpaRepository<ClientesPF, Integer> {
	
	public List<ClientesPF> findByNome(String nome);
	public List<ClientesPF> findByNomeContaining(String nome);
	
	public ClientesPF findByEmail(String email);

}
