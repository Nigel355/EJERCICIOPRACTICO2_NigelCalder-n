/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.Controllers;
import com.mycompany.ejerciciopractico2nigel.Domain.Reserva;
import com.mycompany.ejerciciopractico2nigel.Domain.Usuario;
import com.mycompany.ejerciciopractico2nigel.Domain.Pelicula;
import com.mycompany.ejerciciopractico2nigel.Domain.Funcion;
import com.mycompany.ejerciciopractico2nigel.Service.FuncionService;
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
    private FuncionService funcionService;
    @Autowired
    private ReservaService reservaService;

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/reservar")
public String crearReserva(@RequestParam Long idFuncion, HttpSession session) {

    Usuario usuario = (Usuario) session.getAttribute("usuarioLogeado");
    if (usuario == null) {
        return "redirect:/login2";
    }

    Funcion funcion = funcionService.obtenerFuncionPorId(idFuncion);
    if (funcion != null) {
        Reserva reserva = new Reserva();
        reserva.setFuncion(funcion);
        reserva.setUsuario(usuario);
        reservaService.guardarReserva(reserva);
    }

    return "redirect:/index";
}
}