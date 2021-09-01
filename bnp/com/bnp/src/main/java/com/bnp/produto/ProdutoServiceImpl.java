package com.bnp.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public List<Produto> getAllProdutos() throws Exception {
		return produtoRepository.findAll();
	}

	@Override
	public Produto save(Produto produto) throws Exception {
		return produtoRepository.save(produto);
	}
}
