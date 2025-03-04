/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.registrofamiliar;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

/**
 *
 * @author nicov
 */
@Data
public class Persona {

    public String nombre;
    public String apellido;
    public List<Persona> hijos;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.hijos = new ArrayList<Persona>();
    }

    public void addHijo(Persona h) {
        this.hijos.add(h);
    }
}
