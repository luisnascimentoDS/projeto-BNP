package com.bnp.movimentosmanuais;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MovimentosManuaisRepository extends JpaRepository<MovimentosManuais, String>{

}
