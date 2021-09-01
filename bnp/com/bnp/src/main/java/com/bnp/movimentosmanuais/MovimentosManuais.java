package com.bnp.movimentosmanuais;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="MOVIMENTOS_MANUAIS")
public class MovimentosManuais {
	
	@Column(name = "DAT_MES")
	private Integer datMes;
	
	@Column(name = "DAT_ANO")
	private Integer datAno;
	
	@Column(name = "NUM_LANCAMENTO")
	private Long numLancamento;
	
	@Column(name = "COD_PRODUTO")
	private String codProduto;
	
	@Column(name = "COD_COSIF")
	private String codCosif;
		
	@Column(name = "DES_PRODUTO")
	private String desDescricao;
	
	@Column(name = "DAT_MOVIMENTO")
	private LocalDateTime datMovimento;
	
	@Column(name = "COD_USUARIO")
	private String codUsuario;
	
	@Column(name = "VAL_VALOR")
	private Double valValor;
}
