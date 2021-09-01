package com.bnp.movimentosmanuais;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
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
		
		LocalDateTime hoje = LocalDateTime.now();
		movimento.setDatMovimento(hoje);
		movimento.setNumLancamento(getSequenceNumLancamento());
		movimento.setCodUsuario("TESTE");
		return movimentosRepository.save(movimento);
	}
	
	private Long getSequenceNumLancamento() {
		
		Long numLancamento = 1L;
		LocalDate hoje = LocalDate.now();
		List<MovimentosManuais> movimentosManuais = movimentosRepository.findByDatMesAndDatAno(hoje.getMonthValue(), hoje.getYear());
		
		if(movimentosManuais.size() < 0) {
			return numLancamento;
		} else {
			Collections.sort(movimentosManuais);
			numLancamento = movimentosManuais.get((movimentosManuais.size()-1)).getNumLancamento() + 1;
			return numLancamento;
		}
	}

}
