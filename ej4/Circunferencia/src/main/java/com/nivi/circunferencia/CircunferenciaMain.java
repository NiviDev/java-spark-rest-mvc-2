/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nivi.circunferencia;

import static spark.Spark.*;

/**
 *
 * @author nicov
 */
public class CircunferenciaMain {

    public static void main(String[] args) {
        /* Ruta, Controlador */
        get("/circunferencia", CircunferenciaControlador.circunferencia);
    }
}
