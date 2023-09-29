package com.example.ejercicioapi.Controler;

import com.example.ejercicioapi.Service.UsuarioServiceImpl;
import com.example.ejercicioapi.moldes.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestControler {

    @Autowired
    UsuarioServiceImpl usuarioService;

    @GetMapping("/lista")
    public List<Usuario> enlistarUsuario() {

        List<Usuario> listarMostrar = usuarioService.enlistarUsuario();
        return listarMostrar;
    }
    @GetMapping("/{id}")
    public Usuario UsuarioPorId(@PathVariable Long id) {
        Usuario usuarioMostrar = usuarioService.buscarUsuarioPorId(id);
        return usuarioMostrar;
    }
    @PostMapping("/nuevo")
    public Usuario guardarNuevoUsuario(@RequestBody Usuario usuarioNuevo) {
        Usuario usuarioParaGuardar = usuarioService.guardarUsuario(usuarioNuevo);
        return usuarioParaGuardar;
    }


    @DeleteMapping("/borrar/{id}")//localhost:8080/api/usuario/borrar?id=numero
    public String borrarUsuarioPorId(@PathVariable Long id){
        usuarioService.borrarUsuarioPorId(id);
        return "Usuario borrado";
    }
    @PutMapping("/editar/{id}")
    public Usuario editarUsuarioPorId(@PathVariable Long id, @RequestBody Usuario usuarioActualizado){
        Usuario usuarioEditado = usuarioService.editarUsuarioPorId(id, usuarioActualizado);
        return usuarioEditado;
    }

}
