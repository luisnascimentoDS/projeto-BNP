package com.bnp.movimentosmanuais;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnp.produto.Produto;
import com.bnp.produto.ProdutoService;

@RestController
@RequestMapping(value = "/movimentos-manuais") 
public class MovimentosManuaisEndpoint {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<?> getAllProdutos() throws Exception {
		return new ResponseEntity<List<Produto>>(produtoService.getAllProdutos(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Produto produto) throws Exception {
		return new ResponseEntity<Produto>(produtoService.save(produto), HttpStatus.OK);
	}

}
