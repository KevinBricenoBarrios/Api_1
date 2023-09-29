package com.example.ejercicioapi.Service;

import com.example.ejercicioapi.moldes.Comentario;
import com.example.ejercicioapi.moldes.Tarea;
import com.example.ejercicioapi.repository.ComentariosRepository;
import com.example.ejercicioapi.repository.TareaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ComentarioServiceImpl implements ComentarioService{

    @Autowired
    ComentariosRepository comentariosRepository;

    @Override
    public Comentario crearComentario(Comentario nuevaComentario) {
        return null;
    }
    @Override
    public List<Comentario> listaComentario(){
        return comentariosRepository.findAll();
    }
    @Override
    public Comentario buscarComentarioPorId(Long id) {
        Boolean existe = comentariosRepository.existsById(id);

        if(existe) {
            Comentario comentarioEscogido = comentariosRepository.findById(id).get();
            return comentarioEscogido;
        }else {
            System.out.println("El id es invalido o no existe");
            return null;
        }
    }
    @Override
    public Comentario guardarComentario(Comentario comentarioNuevo){
        return comentariosRepository.save(comentarioNuevo);
    }
    @Override
    public void borrarComentario(Long id) {
        comentariosRepository.deleteById(id);
    }

}


