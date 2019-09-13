package com.regis.datasource.repository.clubefato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.regis.datasource.model.clubefato.AcessoCliente;

@Repository
public interface AcessoClienteRepository extends JpaRepository<AcessoCliente, Long> {

	AcessoCliente findByCpf(String cpf);
	
}