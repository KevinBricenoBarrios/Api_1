package com.example.ejercicioapi.repository;

import com.example.ejercicioapi.moldes.Usuario;
import jdk.jfr.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsuarioNombre(String usuarioNombre);
}
