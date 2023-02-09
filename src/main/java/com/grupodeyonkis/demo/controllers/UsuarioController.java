package com.grupodeyonkis.demo.controllers;

import com.grupodeyonkis.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Vanesa");
        usuario.setApellido("Herrera");
        usuario.setEmail("vanesaherrera@gmail.com");
        usuario.setTelefono("600000000");
        return usuario;
    }

    @RequestMapping(value="usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(234L);
        usuario.setNombre("Vanesa");
        usuario.setApellido("Herrera");
        usuario.setEmail("vanesaherrera@gmail.com");
        usuario.setTelefono("600000000");

        Usuario usuario2 = new Usuario();
        usuario2.setId(345L);
        usuario2.setNombre("Maria");
        usuario2.setApellido("Gonzalez");
        usuario2.setEmail("maria.gon@gmail.com");
        usuario2.setTelefono("654621874");

        Usuario usuario3 = new Usuario();
        usuario3.setId(11L);
        usuario3.setNombre("Gabriel");
        usuario3.setApellido("Aliaga");
        usuario3.setEmail("aliaga1234@gmail.com");
        usuario3.setTelefono("652221121");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping(value="usuario/2344")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");
        return usuario;
    }

    @RequestMapping(value="usuario/2333")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");
        return usuario;
    }

    @RequestMapping(value="usuario/2332")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");
        return usuario;
    }
}
