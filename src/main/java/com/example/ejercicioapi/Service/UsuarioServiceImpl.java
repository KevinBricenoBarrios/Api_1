package com.example.ejercicioapi.Service;

import com.example.ejercicioapi.moldes.Usuario;
import com.example.ejercicioapi.repository.ComentariosRepository;
import com.example.ejercicioapi.repository.TareaRepository;
import com.example.ejercicioapi.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    TareaRepository tareaRepository;
    @Autowired
    ComentariosRepository comentariosRepository;


   // @Override
   // public Usuario crearUsuario(Usuario nuevoUsuario) {
        //return null;
   // }

    @Override
    public List<Usuario> enlistarUsuario(){
        return usuarioRepository.findAll();
    }
    @Override
    public Usuario buscarUsuarioPorId(Long id){
        Boolean existe = usuarioRepository.existsById(id);

        if (existe) {
            //Optional es una clase que no es el objeto en sí, para obtener el objeto hay otro método
            Usuario usuarioEscogido = usuarioRepository.findById(id).get();
            return usuarioEscogido;
        } else {
            System.out.println("El id es inválido o no existe");
            return null;
        }
    }
    @Override
    public Usuario guardarUsuario(Usuario usuarioNuevo){
        Usuario usuarioExiste = usuarioRepository.findByUsuarioNombre(usuarioNuevo.getUsuarioNombre());
        if(usuarioExiste != null){
            System.out.println("Nombre de usuario ya esta registrado");
            return null;
        }else {
            return usuarioRepository.save(usuarioNuevo);
        }
    }

    @Override
    public void borrarUsuarioPorId(Long id){
        usuarioRepository.deleteById(id);
    }
    @Override
    public Usuario editarUsuarioPorId(Long id, Usuario usuarioActualizado){
        Boolean existe = usuarioRepository.existsById(id);

        if(existe){
            Usuario usuarioSeleeccionado = usuarioRepository.findById(id).get();
            usuarioSeleeccionado.setUsuarioNombre(usuarioActualizado.getUsuarioNombre());
            usuarioSeleeccionado.setEmail(usuarioActualizado.getEmail());
            System.out.println("Usuario Actualizado");
            return usuarioRepository.save(usuarioSeleeccionado);

        }else {
            System.out.println("Usuario no existe o el id es invalido");
            return null;
        }
    }



}





