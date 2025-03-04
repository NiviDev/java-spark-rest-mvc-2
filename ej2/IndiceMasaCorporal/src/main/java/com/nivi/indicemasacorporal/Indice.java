/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.indicemasacorporal;

import lombok.Data;

/**
 *
 * @author nicov
 */
@Data
public class Indice {

    private double valor;
    private String estado;

    public Indice(double altura, double peso) {
        altura = altura / 100;
        valor = peso / (Math.pow(altura, 2));
        if (valor >= 18.5 && valor < 25) {
            estado = "Normal";
        } else if (valor < 18.5) {
            estado = "Peso Bajo";
        } else if (valor >= 30) {
            estado = "Obesidad";
        } else {
            estado = "Sobrepeso";
        }
    }
}
