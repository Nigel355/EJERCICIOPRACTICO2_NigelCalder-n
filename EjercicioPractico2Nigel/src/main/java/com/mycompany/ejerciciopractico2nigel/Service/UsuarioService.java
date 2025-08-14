/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.Service;
import com.mycompany.ejerciciopractico2nigel.Domain.Usuario;
import java.util.List;
/**
 *
 * @author nigel
 */


public interface UsuarioService {
    Usuario buscarPorUsername(String username);
    Usuario login(String username, String password);
    boolean registrar(Usuario usuario);
}