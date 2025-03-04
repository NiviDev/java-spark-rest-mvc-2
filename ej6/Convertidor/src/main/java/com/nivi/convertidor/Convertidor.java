/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.convertidor;

/**
 *
 * @author nicov
 */
public class Convertidor {

    public static double celsAFahr(double cels) {
        double fahr = (cels * 1.8) + 32;
        return fahr;
    }
    
    public static double fahrACels(double fahr) {
        double cels = (fahr - 32) / 1.8;
        return cels;
    }
    
    public static double metrosAPies(double metros) {
        return metros * 3.281;
    }
    
    public static double piesAMetros(double pies) {
        return pies / 3.281;
    }
    
    public static double kgALb(double kg){
        return kg * 2.205;
    }
    
    public static double lbAKg(double lb){
        return lb / 2.205;
    }

}
