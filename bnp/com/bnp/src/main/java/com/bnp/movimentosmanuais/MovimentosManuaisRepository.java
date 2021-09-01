package com.bnp.movimentosmanuais;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MovimentosManuaisRepository extends JpaRepository<MovimentosManuais, String>{
	
	List<MovimentosManuais> findByDatMesAndDatAno(Integer datMes, Integer datAno);

}
