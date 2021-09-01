package com.bnp.produto.cosif;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProdutoCosifRepository extends JpaRepository<ProdutoCosif, Long>{

}
