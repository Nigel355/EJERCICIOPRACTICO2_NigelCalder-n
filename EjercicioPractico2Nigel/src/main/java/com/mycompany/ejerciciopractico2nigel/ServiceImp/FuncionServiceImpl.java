/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.ServiceImp;
import com.mycompany.ejerciciopractico2nigel.Dao.FuncionDao;
import com.mycompany.ejerciciopractico2nigel.Domain.Funcion;
import com.mycompany.ejerciciopractico2nigel.Service.FuncionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author nigel
 */
@Service
public class FuncionServiceImpl implements FuncionService {

    @Autowired
    private FuncionDao funcionDao;

    @Override
    public List<Funcion> listarFunciones() {
        return funcionDao.findAll();
    }

    @Override
    public void guardarFuncion(Funcion funcion) {
        funcionDao.save(funcion);
    }

    @Override
    public void eliminarFuncion(Funcion funcion) {
        funcionDao.delete(funcion);
    }

    @Override
    public Funcion obtenerFuncionPorId(Long idFuncion) {
        return funcionDao.findById(idFuncion).orElse(null);
    }
}