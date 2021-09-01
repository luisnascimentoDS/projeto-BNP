package com.bnp.movimentomanual;

import java.time.LocalDateTime;

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
@Table(name="MOVIMENTO_MANUAIS")
@SequenceGenerator(name = "SQ_PRODUTO", sequenceName = "DB_DUPLICIDADE.SQ_PRODUTO", allocationSize = 1)
public class MovimentoManuais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRODUTO")
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
