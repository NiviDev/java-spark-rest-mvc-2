/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nivi.calculadora;

import static spark.Spark.*;

/**
 *
 * @author nicov
 */
public class CalculadoraMain {

    public static void main(String[] args) {
        /* Ruta , Controlador */
        get("/sumar", CalculadoraControlador.sumar);
        get("/restar", CalculadoraControlador.restar);
        get("/multiplicar", CalculadoraControlador.multiplicar);
        get("/dividir", CalculadoraControlador.dividir);
    }
}
