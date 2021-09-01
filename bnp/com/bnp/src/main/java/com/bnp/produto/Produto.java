package com.bnp.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PRODUTO")
@SequenceGenerator(name = "SQ_PRODUTO", sequenceName = "DB_DUPLICIDADE.SQ_PRODUTO", allocationSize = 1)
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRODUTO")
	@Column(name = "COD_PRODUTO")
	private String  codProduto;
	
	@Column(name = "DES_PRODUTO")
	private String desProduto;
	
	@Column(name = "STA_STATUS")
	private String status;

}
