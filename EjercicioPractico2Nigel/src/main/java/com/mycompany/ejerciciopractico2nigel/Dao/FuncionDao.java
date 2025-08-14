/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopractico2nigel.Dao;

/**
 *
 * @author nigel
 */
import com.mycompany.ejerciciopractico2nigel.Domain.Funcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionDao extends JpaRepository<Funcion, Long> {}