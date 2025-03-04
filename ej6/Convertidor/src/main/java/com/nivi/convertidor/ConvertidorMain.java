/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nivi.convertidor;

import static spark.Spark.*;

/**
 *
 * @author nicov
 */
public class ConvertidorMain {

    public static void main(String[] args) {
        get("/celsAFahr", ConvertidorControlador.celsAFahr);
        get("/fahrACels", ConvertidorControlador.fahrACels);
        get("/metrosAPies", ConvertidorControlador.metrosAPies);
        get("/piesAMetros", ConvertidorControlador.piesAMetros);
        get("/kgALb", ConvertidorControlador.kgALb);
        get("/lbAKg", ConvertidorControlador.lbAKg);
    }
}
