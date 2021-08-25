package com.bnp.pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PESSOA")
public class Pessoa {
	
	@Id
	@PrimaryKeyJoinColumn
	@Column(name = "ID_PESSOA")
	private Long id;
	
	@Column(name = "NOME_PESSOA")
	private String nome;
	
	@Column(name = "DOCUMENTO_PESSOA")
	private Long documento;

}
