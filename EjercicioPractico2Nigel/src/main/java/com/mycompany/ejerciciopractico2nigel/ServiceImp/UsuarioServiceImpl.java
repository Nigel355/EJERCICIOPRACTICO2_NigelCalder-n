/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.ServiceImp;
import com.mycompany.ejerciciopractico2nigel.Dao.UsuarioDao;
import com.mycompany.ejerciciopractico2nigel.Domain.Usuario;
import com.mycompany.ejerciciopractico2nigel.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author nigel
 */


@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public Usuario buscarPorUsername(String username) {
        return usuarioDao.findByUsername(username);
    }

    @Override
    public Usuario login(String username, String password) {
        Usuario usuario = usuarioDao.findByUsername(username);
        if (usuario != null && usuario.getPassword().equals(password)) {
            return usuario;
        }
        return null;
    }

    @Override
    public boolean registrar(Usuario usuario) {
        if (usuarioDao.findByUsername(usuario.getUsername()) != null) {
            return false; 
        }
        usuarioDao.save(usuario);
        return true;
    }
}