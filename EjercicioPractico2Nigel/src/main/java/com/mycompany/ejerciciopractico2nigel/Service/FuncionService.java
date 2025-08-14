/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.Service;
import com.mycompany.ejerciciopractico2nigel.Domain.Funcion;
import java.util.List;
/**
 *
 * @author nigel
 */


public interface FuncionService {
    List<Funcion> listarFunciones();
    void guardarFuncion(Funcion funcion);
    void eliminarFuncion(Funcion funcion);
    Funcion obtenerFuncionPorId(Long idFuncion);
}