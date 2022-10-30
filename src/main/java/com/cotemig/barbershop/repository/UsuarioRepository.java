package com.cotemig.barbershop.repository;

import com.cotemig.barbershop.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
