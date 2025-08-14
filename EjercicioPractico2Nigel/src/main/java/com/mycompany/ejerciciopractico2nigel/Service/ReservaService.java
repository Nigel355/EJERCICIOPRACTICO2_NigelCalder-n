/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.Service;
import com.mycompany.ejerciciopractico2nigel.Domain.Reserva;
import java.util.List;
/**
 *
 * @author nigel
 */

public interface ReservaService {
    List<Reserva> listarReservas();
    void guardarReserva(Reserva reserva);
    void eliminarReserva(Reserva reserva);
    Reserva obtenerReservaPorId(Long idReserva);
}