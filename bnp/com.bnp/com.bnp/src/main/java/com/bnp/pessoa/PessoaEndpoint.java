package com.bnp.pessoa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pessoa") 
public class PessoaEndpoint {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pessoa> findById(@PathVariable(name = "id")Long id) {
		return new ResponseEntity<Pessoa>(pessoaRepository.findById(id).get(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/nome/{nome}")
	public ResponseEntity<List<Pessoa>> findByNome(@PathVariable(name = "nome") String nome) {
		return new ResponseEntity<List<Pessoa>>(pessoaRepository.findByNome(nome), HttpStatus.OK);
	}
	
	@GetMapping(value = "/documento/{documento}")
	public ResponseEntity<Pessoa> findByDocumento(@PathVariable(name = "documento") Long documento) {
		return new ResponseEntity<Pessoa>(pessoaRepository.findByDocumento(documento), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
		return new ResponseEntity<Pessoa>(pessoaRepository.save(pessoa), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody List<Pessoa> pessoas) throws Exception {
		return new ResponseEntity<>(pessoaRepository.saveAll(pessoas), HttpStatus.OK);
	}

}
