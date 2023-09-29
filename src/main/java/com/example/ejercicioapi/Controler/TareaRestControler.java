package com.example.ejercicioapi.Controler;

import com.example.ejercicioapi.Service.TareaServiceImpl;
import com.example.ejercicioapi.moldes.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarea")
public class TareaRestControler {

    @Autowired
    TareaServiceImpl tareaService;

    @GetMapping("/lista")
    public List<Tarea> listaTarea(){
        List<Tarea> listaTareaMostrar = tareaService.listaTarea();
        return listaTareaMostrar;
    }
    @GetMapping("/{id}")
    public Tarea tareaPorId(@PathVariable Long id) {
        Tarea tareaMostrar = tareaService.buscarTareaPorId(id);
        return tareaMostrar;
    }


    @PostMapping("/nuevo")
    public Tarea guardarTareaNueva(@RequestBody Tarea tareaNuevo) {
        Tarea tareaParaGuardar = tareaService.guardarTarea(tareaNuevo);
        return tareaParaGuardar;
    }
    @DeleteMapping("/borrar/{id}")
    public String borrarTareaPorId(@PathVariable Long id){
        tareaService.borrarTarea(id);
        return "Tarea Borrada";
    }




}
