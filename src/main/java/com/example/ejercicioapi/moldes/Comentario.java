package com.example.ejercicioapi.moldes;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Comentario_Api")

public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comentariosId;

    @Column(name = "comentarios")
    @NotNull
    private String comentarioId;

    @Column(name = "texto")
    @NotNull
    private String comentarioTexto;

    @Column(name = "fecha")
    @JsonFormat(pattern="yyyy-MM-dd")
    @NotNull
    private String comentarioFecha;

    @ManyToOne
    @JoinColumn(name = "tareaId", nullable = false)
    private Tarea tarea;

    public Comentario() {
    }

    public Comentario(Long comentariosId, String comentarioId, String comentarioTexto, String comentarioFecha) {
        this.comentariosId = comentariosId;
        this.comentarioId = comentarioId;
        this.comentarioTexto = comentarioTexto;
        this.comentarioFecha = comentarioFecha;
    }

    public Long getComentariosId() {
        return comentariosId;
    }

    public void setComentariosId(Long comentariosId) {
        this.comentariosId = comentariosId;
    }

    public String getComentarioId() {
        return comentarioId;
    }

    public void setComentarioId(String comentarioId) {
        this.comentarioId = comentarioId;
    }

    public String getComentarioTexto() {
        return comentarioTexto;
    }

    public void setComentarioTexto(String comentarioTexto) {
        this.comentarioTexto = comentarioTexto;
    }

    public String getComentarioFecha() {
        return comentarioFecha;
    }

    public void setComentarioFecha(String comentarioFecha) {
        this.comentarioFecha = comentarioFecha;
    }
}
