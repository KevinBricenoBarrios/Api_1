package com.example.ejercicioapi.Service;

import com.example.ejercicioapi.moldes.Tarea;

import java.util.List;

public interface TareaService {

    Tarea crearTarea(Tarea nuevaTarea);

    List<Tarea> listaTarea();

    Tarea buscarTareaPorId(Long id);

    Tarea guardarTarea(Tarea tareaNueva);

    //Tarea editarTareaPorId(Long id, Tarea tareaActualizada);

    void borrarTarea(Long id);
}
