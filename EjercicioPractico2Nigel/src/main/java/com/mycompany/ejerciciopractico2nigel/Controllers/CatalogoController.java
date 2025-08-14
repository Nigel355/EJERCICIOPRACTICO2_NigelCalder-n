/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.Controllers;
import org.springframework.stereotype.Controller;

import com.mycompany.ejerciciopractico2nigel.Domain.Pelicula;
import com.mycompany.ejerciciopractico2nigel.Service.PeliculaService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
/**
 *
 * @author nigel
 */
@Controller
public class CatalogoController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/catalogo")
    public String verCatalogo(Model model) {
        List<Pelicula> peliculas = peliculaService.listarPeliculas();
        model.addAttribute("peliculas", peliculas);
        return "catalogo";
    }

    @GetMapping("/admin/catalogo")
    public String adminCatalogo(Model model) {
        List<Pelicula> peliculas = peliculaService.listarPeliculas();
        model.addAttribute("peliculas", peliculas);
        return "admin/catalogo"; 
    }
}