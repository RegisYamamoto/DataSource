package com.regis.datasource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.regis.datasource.repository.clubefato.AcessoClienteRepository;

@Service
public class AcessoClienteService {

	@Autowired
	private AcessoClienteRepository acessoClienteRepository;
	
	// Teste de conexão com um banco MySQL
	@Scheduled(fixedDelay = 900000)
	void imprimeAcessoClientes() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------------- " + acessoClienteRepository.findByCpf("01283704919") + " -------------------");
	}
	
}