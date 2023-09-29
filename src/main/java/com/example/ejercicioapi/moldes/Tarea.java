package com.example.ejercicioapi.moldes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name = "Tarea_Api")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tareaId;

    @Column(name = "tituloTarea")
    @NotNull
    private String titulo_tarea;

    @Column(name = "descripcionTarea")
    @NotNull
    private String descripcion_tarea;

    @Column(name = "fechaTarea")
    @JsonFormat(pattern="yyyy-MM-dd")
    @NotNull
    private String fechaTarea;

    @ManyToOne
    @JoinColumn(name = "usuarioId",nullable = false)
    private Usuario usuario;


    @JsonIgnore
    @OneToMany(mappedBy = "tarea", cascade = CascadeType.ALL)
    private List<Comentario> tareaComentario;

    public Tarea() {
    }

    public Tarea(Long tareaId, String titulo_tarea, String descripcion_tarea, String fechaTarea) {
        this.tareaId = tareaId;
        this.titulo_tarea = titulo_tarea;
        this.descripcion_tarea = descripcion_tarea;
        this.fechaTarea = fechaTarea;
    }

    public Long getTareaId() {
        return tareaId;
    }

    public void setTareaId(Long tareaId) {
        this.tareaId = tareaId;
    }

    public String getTitulo_tarea() {
        return titulo_tarea;
    }

    public void setTitulo_tarea(String titulo_tarea) {
        this.titulo_tarea = titulo_tarea;
    }

    public String getDescripcion_tarea() {
        return descripcion_tarea;
    }

    public void setDescripcion_tarea(String descripcion_tarea) {
        this.descripcion_tarea = descripcion_tarea;
    }

    public String getFechaTarea() {
        return fechaTarea;
    }

    public void setFechaTarea(String fechaTarea) {
        this.fechaTarea = fechaTarea;
    }
}
