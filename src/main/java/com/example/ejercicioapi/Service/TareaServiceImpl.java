package com.example.ejercicioapi.Service;

import com.example.ejercicioapi.moldes.Tarea;
import com.example.ejercicioapi.moldes.Usuario;
import com.example.ejercicioapi.repository.TareaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TareaServiceImpl implements TareaService {

    @Autowired
    TareaRepository tareaRepository;

    @Override
    public Tarea crearTarea(Tarea nuevaTarea) {

        return null;
    }
    @Override
    public List<Tarea> listaTarea(){

        return tareaRepository.findAll();
    }
    @Override
    public Tarea buscarTareaPorId(Long id){
        Boolean existe = tareaRepository.existsById(id);

        if(existe){
            Tarea tareaEscogida = tareaRepository.findById(id).get();
            return tareaEscogida;
        }else {
            System.out.println("id invalido o no existe");
            return null;
        }
    }
    @Override
    public Tarea guardarTarea(Tarea tareaNueva){
        return tareaRepository.save(tareaNueva);
    }
    //@Override
    //public Tarea editarTareaPorId

    @Override
    public void borrarTarea(Long id){
        tareaRepository.deleteById(id);
    }
}
