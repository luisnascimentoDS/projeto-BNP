package com.bnp.movimentosmanuais;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class MovimentosManuaisServiceImpl implements MovimentosManuaisService {

	@Autowired
	private MovimentosManuaisRepository movimentosRepository;
	
	@Override
	public List<MovimentosManuais> getAllMovimentos() throws Exception {
		return movimentosRepository.findAll();
	}

	@Override
	public MovimentosManuais save(MovimentosManuais movimento) throws Exception {
		movimento.setCodUsuario("TESTE");
		return movimentosRepository.save(movimento);
	}

}
