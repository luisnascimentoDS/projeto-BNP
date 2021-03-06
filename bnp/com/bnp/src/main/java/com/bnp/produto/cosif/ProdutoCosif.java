package com.bnp.produto.cosif;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PRODUTO_COSIF")
public class ProdutoCosif {
	
	@Column(name = "COD_PRODUTO")
	private String codProduto;
	
	@Column(name = "COD_COSIF")
	private String codCosif;
	
	@Column(name = "COD_CLASSIFICACAO")
	private String codClassificacao;
	
	@Column(name = "STA_STATUS")
	private String staStatus;

}
