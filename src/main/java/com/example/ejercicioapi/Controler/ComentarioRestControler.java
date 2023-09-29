package com.example.ejercicioapi.Controler;

import com.example.ejercicioapi.Service.ComentarioServiceImpl;
import com.example.ejercicioapi.moldes.Comentario;
import com.example.ejercicioapi.moldes.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentario")
public class ComentarioRestControler {

    @Autowired
    ComentarioServiceImpl comentarioService;

    @GetMapping("/lista")
    public List<Comentario> listaComentario(){
    List<Comentario> listaMostrar = comentarioService.listaComentario();
    return listaMostrar;
    }
    @GetMapping("/{id}")
    public Comentario comentarioPorId(@PathVariable Long id) {
        Comentario comentarioMostrar = comentarioService.buscarComentarioPorId(id);
        return comentarioMostrar;
    }
    @PostMapping("/nuevo")
    public Comentario guardarNuevoComentario(@RequestBody Comentario comentarioNuevo) {
        Comentario comentarioParaGuardar = comentarioService.guardarComentario(comentarioNuevo);
        return comentarioParaGuardar;
    }
    @DeleteMapping("/borrar/{id}")
    public String borrarComentarioPorId(@PathVariable Long id) {
        comentarioService.borrarComentario(id);
        return "comentario borrado";
    }
}
