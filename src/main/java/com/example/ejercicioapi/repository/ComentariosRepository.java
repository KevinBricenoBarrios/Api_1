package com.example.ejercicioapi.repository;

import com.example.ejercicioapi.moldes.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}
