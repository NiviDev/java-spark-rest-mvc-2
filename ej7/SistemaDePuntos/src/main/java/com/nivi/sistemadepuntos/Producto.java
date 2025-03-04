/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.sistemadepuntos;

import lombok.Data;

/**
 *
 * @author nicov
 */
@Data
public class Producto {
    private String nombre;
    private int puntos;
    
    public Producto(String nombre, int puntos){
        this.nombre = nombre;
        this.puntos = puntos;
    }
}
