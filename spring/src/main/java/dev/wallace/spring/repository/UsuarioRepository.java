package dev.wallace.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.wallace.spring.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
