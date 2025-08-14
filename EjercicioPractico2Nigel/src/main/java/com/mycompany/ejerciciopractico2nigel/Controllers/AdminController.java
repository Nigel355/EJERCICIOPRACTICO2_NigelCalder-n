/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.Controllers;
import com.mycompany.ejerciciopractico2nigel.Domain.Pelicula;
import com.mycompany.ejerciciopractico2nigel.Domain.Funcion;
import com.mycompany.ejerciciopractico2nigel.Service.PeliculaService;
import com.mycompany.ejerciciopractico2nigel.Service.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
/**
 *
 * @author nigel
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private PeliculaService peliculaService;

    @Autowired
    private FuncionService funcionService;

    
    @GetMapping("/peliculas")
    public String adminPeliculas(Model model) {
        List<Pelicula> peliculas = peliculaService.listarPeliculas();
        model.addAttribute("peliculas", peliculas);
        model.addAttribute("nuevaPelicula", new Pelicula());
        model.addAttribute("nuevaFuncion", new Funcion());
        return "adminPeliculas";
    }

    
    @PostMapping("/peliculas/guardar")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.guardarPelicula(pelicula);
        return "redirect:/admin/peliculas";
    }

   
    @PostMapping("/funciones/guardar")
    public String guardarFuncion(@ModelAttribute Funcion funcion) {
        funcionService.guardarFuncion(funcion);
        return "redirect:/admin/peliculas";
    }
}