/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.ServiceImp;
import com.mycompany.ejerciciopractico2nigel.Dao.ReservaDao;
import com.mycompany.ejerciciopractico2nigel.Domain.Reserva;
import com.mycompany.ejerciciopractico2nigel.Service.ReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nigel
 */

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaDao reservaDao;

    @Override
    public List<Reserva> listarReservas() {
        return reservaDao.findAll();
    }

    @Override
    public void guardarReserva(Reserva reserva) {
        reservaDao.save(reserva);
    }

    @Override
    public void eliminarReserva(Reserva reserva) {
        reservaDao.delete(reserva);
    }

    @Override
    public Reserva obtenerReservaPorId(Long idReserva) {
        return reservaDao.findById(idReserva).orElse(null);
    }
}