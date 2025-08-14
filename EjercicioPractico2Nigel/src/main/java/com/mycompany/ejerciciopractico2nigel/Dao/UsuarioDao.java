/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejerciciopractico2nigel.Dao;

/**
 *
 * @author nigel
 */
import com.mycompany.ejerciciopractico2nigel.Domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {

    @Query(value = "SELECT u.id, u.username, u.password, " +
                   "CASE WHEN u.rol_id = 1 THEN true ELSE false END AS admin " +
                   "FROM usuarios u WHERE u.username = :username", nativeQuery = true)
    Usuario findByUsername(@Param("username") String username);
}