package com.bnp.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bnp.produto.cosif.ProdutoCosif;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name="PRODUTO")
public class Produto {
	
	@Column(name = "COD_PRODUTO")
	private String  codProduto;
	
	@Column(name = "DES_PRODUTO")
	private String desProduto;
	
	@Column(name = "STA_STATUS")
	private String status;
	
	@JsonIgnore
	@OneToMany(targetEntity = ProdutoCosif.class, fetch = FetchType.LAZY)
	@JoinColumn(name="COD_COSIF")
	private ProdutoCosif produtoCosif;

}
