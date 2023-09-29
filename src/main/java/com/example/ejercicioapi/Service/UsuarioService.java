package com.example.ejercicioapi.Service;

import com.example.ejercicioapi.moldes.Usuario;

import java.util.List;

public interface UsuarioService {

    //Usuario crearUsuario(Usuario nuevoUsuario);

    List<Usuario> enlistarUsuario();

    Usuario buscarUsuarioPorId(Long id);

    Usuario guardarUsuario(Usuario usuarioNuevo);

    void borrarUsuarioPorId(Long id);
    Usuario editarUsuarioPorId(Long Id, Usuario usuarioActualizado);




}
