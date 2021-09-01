package com.bnp.produto;

import java.util.List;

public interface ProdutoService {
	
	List<Produto> getAllProdutos() throws Exception;
	Produto save(Produto produto) throws Exception;

}
