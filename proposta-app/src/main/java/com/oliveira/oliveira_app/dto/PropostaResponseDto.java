package com.oliveira.oliveira_app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropostaResponseDto {
	
	private Long id;
	
	private String nome;
	
	private String sobrenome;
	
	private String telefone;
	
	private String cpf;
	
	private Double renda;
	
	private String valorSolicitadoFmt;
	
	private int prazoPagamento;
	
	private Boolean aprovado;
	
	private String observacao;

}
