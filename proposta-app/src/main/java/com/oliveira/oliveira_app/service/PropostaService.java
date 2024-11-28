package com.oliveira.oliveira_app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oliveira.oliveira_app.dto.PropostaRequestDto;
import com.oliveira.oliveira_app.dto.PropostaResponseDto;
import com.oliveira.oliveira_app.entity.Proposta;
import com.oliveira.oliveira_app.mapper.PropostaMapper;
import com.oliveira.oliveira_app.repository.PropostaRepository;

@Service
public class PropostaService {
	
	@Autowired
	private PropostaRepository propostaRepository;

	public PropostaResponseDto criaProposta(PropostaRequestDto propostaRequestDto) {
		Proposta proposta = PropostaMapper.INSTANCE.convertDtoToProposta(propostaRequestDto);
		propostaRepository.save(proposta);
		
		return PropostaMapper.INSTANCE.convertEntitytoResponse(proposta);
	}
	
	public List<PropostaResponseDto> obterProposta() {
		
		List<Proposta> propostas = propostaRepository.findAll();
		
		return PropostaMapper.INSTANCE.convertListEntityToListDto(propostas);
	}
	
}
