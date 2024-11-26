package com.oliveira.oliveira_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "proposta")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Proposta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Double valorSolicitado;
	
	private Integer prazoPagamento;
	
	private Boolean aprovado;
	
	private boolean integrada;
	
	private String observacao;
	
	@OneToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

}
