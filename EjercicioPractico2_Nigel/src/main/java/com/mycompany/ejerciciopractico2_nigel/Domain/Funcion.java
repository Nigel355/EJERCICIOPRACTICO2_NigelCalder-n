/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopractico2_nigel.Domain;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
/**
 *
 * @author nigel
 */


@Data
@Entity
public class Funcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fechaHora;

    @ManyToOne
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;
}
