/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.indicemasacorporal;

/**
 *
 * @author nicov
 */
public class IndiceDAO {
    public Indice getIMC(double altura, double peso){
        return new Indice(altura, peso);
    }
}
