package com.bnp.pessoa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pessoaRepository", path = "pessoaRepository")
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
	List<Pessoa> findByNome(String nome);
	Pessoa findByDocumento(Long documento);

}
