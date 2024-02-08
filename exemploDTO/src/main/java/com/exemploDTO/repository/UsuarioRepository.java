package com.exemploDTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemploDTO.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
