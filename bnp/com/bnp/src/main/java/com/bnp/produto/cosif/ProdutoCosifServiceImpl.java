package com.bnp.produto.cosif;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ProdutoCosifServiceImpl implements ProdutoCosifService {

	@Autowired
	private ProdutoCosifRepository produtoCosifRepository;
	
	@Override
	public List<ProdutoCosif> getAllProdutos() throws Exception {
		return produtoCosifRepository.findAll();
	}

}
