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
import jakarta.servlet.http.HttpSession;
/**
 *
 * @author nigel
 */


@Controller
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        Model model) {
        Usuario usuario = usuarioService.login(username, password);
        if (usuario != null) {
            session.setAttribute("usuario", usuario);
            if("ADMIN".equals(usuario.getRol())) {
                return "redirect:/admin/catalogo";
            } else {
                return "redirect:/catalogo";
            }
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrecta");
            return "login";
        }
    }
}