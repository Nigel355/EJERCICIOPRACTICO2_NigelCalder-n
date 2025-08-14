/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.Service;
import com.mycompany.ejerciciopractico2nigel.Domain.Pelicula;
import java.util.List;
/**
 *
 * @author nigel
 */
public interface PeliculaService {
    
   
    public List<Pelicula> listarPeliculas();
    
   
    public void guardarPelicula(Pelicula pelicula);
    
    
    public void eliminarPelicula(Pelicula pelicula);
    
  
    public Pelicula obtenerPeliculaPorId(Long idPelicula);
}