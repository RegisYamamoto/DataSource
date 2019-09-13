package com.regis.datasource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.regis.datasource.repository.atrativa.ClienteAtrativaRepository;

@Service
public class ClienteAtrativaService {

	@Autowired
	private ClienteAtrativaRepository clienteAtrativaRepository;

	// Teste de conexão com um banco ORACLE
	@Scheduled(fixedDelay = 900000)
	void imprimeClienteAtrativa() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------------- " + clienteAtrativaRepository.findByCpf("01283704919") + " -------------------");

	}
	
}