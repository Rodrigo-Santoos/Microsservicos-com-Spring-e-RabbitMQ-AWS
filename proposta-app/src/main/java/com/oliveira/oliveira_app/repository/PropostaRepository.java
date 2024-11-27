package com.oliveira.oliveira_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oliveira.oliveira_app.entity.Proposta;

@Repository
public interface PropostaRepository extends JpaRepository<Proposta, Long> {

}
