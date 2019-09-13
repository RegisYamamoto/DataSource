package com.regis.datasource.repository.atrativa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.regis.datasource.model.atrativa.ClienteAtrativa;

@Repository
public interface ClienteAtrativaRepository extends JpaRepository<ClienteAtrativa, Long> {

	ClienteAtrativa findByCpf(String cpf);

}