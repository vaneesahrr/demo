package com.grupodeyonkis.demo.dao;

import com.grupodeyonkis.demo.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);
}
