package com.oliveira.oliveira_app.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.oliveira.oliveira_app.dto.PropostaRequestDto;
import com.oliveira.oliveira_app.dto.PropostaResponseDto;
import com.oliveira.oliveira_app.entity.Proposta;

@Mapper
public interface PropostaMapper {
	
	PropostaMapper INSTANCE = Mappers.getMapper(PropostaMapper.class);
	
	//mapeando usuario que vem no Request
	@Mapping(target = "usuario.nome", source = "nome")
	@Mapping(target = "usuario.sobrenome", source = "sobrenome")
	@Mapping(target = "usuario.cpf", source = "cpf")
	@Mapping(target = "usuario.telefone", source = "telefone")
	@Mapping(target = "usuario.renda", source = "renda")
	
	//Parte proposta
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "valorSolicitado", ignore = true)
	@Mapping(target = "prazoPagamento", ignore = true)
	@Mapping(target = "aprovado", ignore = true)
	@Mapping(target = "integrada", ignore = true)
	@Mapping(target = "observacao", ignore = true)
	Proposta convertDtoToProposta(PropostaRequestDto propostaRequestDto);
	
	
	//mapeando o que esta na entidade para o response
	@Mapping(target = "nome", source = "usuario.nome")
	@Mapping(target = "sobrenome", source = "usuario.sobrenome")
	@Mapping(target = "cpf", source = "usuario.cpf")
	@Mapping(target = "telefone", source = "usuario.telefone")
	@Mapping(target = "renda", source = "usuario.renda")
	@Mapping(target = "aprovado", source = "aprovado")
	PropostaResponseDto convertEntitytoResponse(Proposta proposta);
}