/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.Controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;
/**
 *
 * @author nigel
 */
@Controller
public class CatalogoController {

    @GetMapping("/catalogo")
    public String catalogo(HttpSession session, Model model) {
        Object usuario = session.getAttribute("usuario");
        model.addAttribute("usuario", usuario);
        return "catalogo";
    }
}
