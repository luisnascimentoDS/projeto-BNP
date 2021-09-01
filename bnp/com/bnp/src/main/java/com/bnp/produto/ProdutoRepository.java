package com.bnp.produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bnp.pessoa.Pessoa;

@RepositoryRestResource(collectionResourceRel = "produtoRepository", path = "produtoRepository")
public interface ProdutoRepository extends JpaRepository<Pessoa, Long> {

}
