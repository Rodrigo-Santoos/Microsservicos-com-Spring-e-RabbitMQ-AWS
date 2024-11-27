package com.oliveira.oliveira_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oliveira.oliveira_app.dto.PropostaRequestDto;
import com.oliveira.oliveira_app.dto.PropostaResponseDto;
import com.oliveira.oliveira_app.service.PropostaService;

@RestController
@RequestMapping("/proposta")
public class PropostaController {
	
	@Autowired
	private PropostaService propostaService;

	@PostMapping
	public ResponseEntity<PropostaResponseDto> criaProposta(@RequestBody PropostaRequestDto propostaRequestDto) {
		
		PropostaResponseDto propostaResponseDto = propostaService.criaProposta(propostaRequestDto);
		return ResponseEntity.ok(propostaResponseDto);
		
	}
}
