package com.consignado.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.consignado.api.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
