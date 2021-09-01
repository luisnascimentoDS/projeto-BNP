package com.bnp.movimentosmanuais;

import java.util.List;

public interface MovimentosManuaisService {

	List<MovimentosManuais> getAllMovimentos() throws Exception;
	MovimentosManuais save(MovimentosManuais movimento) throws Exception;
}
