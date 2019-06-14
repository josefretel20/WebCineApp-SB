package com.empresariales.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.empresariales.app.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

}
