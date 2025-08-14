/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.ServiceImp;

/**
 *
 * @author nigel
 */
import com.mycompany.ejerciciopractico2nigel.Dao.PeliculaDao;
import com.mycompany.ejerciciopractico2nigel.Domain.Pelicula;
import com.mycompany.ejerciciopractico2nigel.Service.PeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    private PeliculaDao peliculaDao;

    @Override
    public List<Pelicula> listarPeliculas() {
        return peliculaDao.findAll();
    }

    @Override
    public void guardarPelicula(Pelicula pelicula) {
        peliculaDao.save(pelicula);
    }

    @Override
    public void eliminarPelicula(Pelicula pelicula) {
        peliculaDao.delete(pelicula);
    }

    @Override
    public Pelicula obtenerPeliculaPorId(Long idPelicula) {
        return peliculaDao.findById(idPelicula).orElse(null);
    }
}