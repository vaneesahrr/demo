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
