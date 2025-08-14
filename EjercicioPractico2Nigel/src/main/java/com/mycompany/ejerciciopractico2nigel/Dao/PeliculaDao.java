/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopractico2nigel.Dao;
import com.mycompany.ejerciciopractico2nigel.Domain.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author nigel
 */

public interface PeliculaDao extends JpaRepository<Pelicula, Long> {}