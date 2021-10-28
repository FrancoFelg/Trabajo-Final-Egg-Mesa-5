package com.Mesa5.Mesa5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mesa5.Mesa5.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{

}
