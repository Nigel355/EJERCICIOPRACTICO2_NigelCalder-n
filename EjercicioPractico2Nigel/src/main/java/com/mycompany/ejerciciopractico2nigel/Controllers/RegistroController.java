/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.Controllers;
import com.mycompany.ejerciciopractico2nigel.Domain.Usuario;
import com.mycompany.ejerciciopractico2nigel.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author nigel
 */
@Controller
public class RegistroController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/registro")
    public String registroForm() {
        return "registro";
    }

    @PostMapping("/registro")
    public String registrar(@RequestParam String username, @RequestParam String password, Model model) {
        boolean exito = usuarioService.registrar(new Usuario(username, password));
        if (exito) {
            return "redirect:/login";
        } else {
            model.addAttribute("error", "El usuario ya existe");
            return "registro";
        }
    }
}
