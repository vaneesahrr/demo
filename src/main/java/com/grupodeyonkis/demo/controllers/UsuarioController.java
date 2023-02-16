package com.grupodeyonkis.demo.controllers;

import com.grupodeyonkis.demo.dao.UsuarioDao;
import com.grupodeyonkis.demo.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Vanesa");
        usuario.setApellido("Herrera");
        usuario.setEmail("vanesaherrera@gmail.com");
        usuario.setTelefono("600000000");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
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

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id) {
        usuarioDao.eliminar(id);
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
