package com.cotemig.barbershop.repository;

import com.cotemig.barbershop.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
