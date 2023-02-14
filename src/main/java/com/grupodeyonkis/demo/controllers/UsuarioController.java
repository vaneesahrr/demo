package com.grupodeyonkis.demo.controllers;

import com.grupodeyonkis.demo.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Vanesa");
        usuario.setApellido("Herrera");
        usuario.setEmail("vanesaherrera@gmail.com");
        usuario.setTelefono("600000000");
        return usuario;
    }

    @RequestMapping(value = "usuario")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(123L);
        usuario.setNombre("Vanesa");
        usuario.setApellido("Herrera");
        usuario.setEmail("vanesaherrera@gmail.com");
        usuario.setTelefono("600000000");

        Usuario usuario2 = new Usuario();
        usuario2.setId(234L);
        usuario2.setNombre("Maria");
        usuario2.setApellido("Gonzalez");
        usuario2.setEmail("maria.gon@gmail.com");
        usuario2.setTelefono("611111111");

        Usuario usuario3 = new Usuario();
        usuario3.setId(345L);
        usuario3.setNombre("Gabriel");
        usuario3.setApellido("Aliaga");
        usuario3.setEmail("aliaga124@gmail.com");
        usuario3.setTelefono("622222222");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping(value = "usuario123")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Vanesa");
        usuario.setApellido("Herrera");
        usuario.setEmail("vanesaherrera@gmail.com");
        usuario.setTelefono("600000000");
        return usuario;
    }

    @RequestMapping(value = "usuario12")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Vanesa");
        usuario.setApellido("Herrera");
        usuario.setEmail("vanesaherrera@gmail.com");
        usuario.setTelefono("600000000");
        return usuario;
    }

    @RequestMapping(value = "usuario1")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Vanesa");
        usuario.setApellido("Herrera");
        usuario.setEmail("vanesaherrera@gmail.com");
        usuario.setTelefono("600000000");
        return usuario;
    }

}
