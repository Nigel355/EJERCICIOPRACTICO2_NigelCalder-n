/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.Controllers;
import com.mycompany.ejerciciopractico2nigel.Domain.Reserva;
import com.mycompany.ejerciciopractico2nigel.Domain.Usuario;
import com.mycompany.ejerciciopractico2nigel.Domain.Pelicula;
import com.mycompany.ejerciciopractico2nigel.Service.ReservaService;
import com.mycompany.ejerciciopractico2nigel.Service.PeliculaService;
import jakarta.servlet.http.HttpSession;
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
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/reservar")
    public String crearReserva(@RequestParam Long idPelicula, HttpSession session) {
        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            return "redirect:/login";
        }

        Pelicula pelicula = peliculaService.obtenerPeliculaPorId(idPelicula);
        if (pelicula != null) {
            Reserva reserva = new Reserva();
            reserva.setPelicula(pelicula);
            reserva.setUsuario(usuario);
            reservaService.guardarReserva(reserva);
        }

        return "redirect:/catalogo";
    }
}