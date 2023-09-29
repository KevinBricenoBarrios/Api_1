package com.example.ejercicioapi.Service;

import com.example.ejercicioapi.moldes.Comentario;

import java.util.List;

public interface ComentarioService {

    Comentario crearComentario(Comentario nuevoComentario);

    List<Comentario>listaComentario();

    Comentario buscarComentarioPorId(Long id);

    Comentario guardarComentario(Comentario comentarioNuevo);

    void borrarComentario(Long id);

}
