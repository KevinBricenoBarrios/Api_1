package com.example.ejercicioapi.moldes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;

import java.util.List;

@Entity
@Table(name = "Usuarios_Api")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuariosId;

    @Column(name = "nombre_usuario")
    @NotNull
    private String usuarioNombre;

    @Email
    @NotNull
    private String email;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Tarea> usuarioTarea;

    public Usuario() {
    }

    public Usuario(Long usuariosId, String usuarioNombre, String email) {
        this.usuariosId = usuariosId;
        this.usuarioNombre = usuarioNombre;
        this.email = email;
    }

    public Long getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(Long usuariosId) {
        this.usuariosId = usuariosId;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
