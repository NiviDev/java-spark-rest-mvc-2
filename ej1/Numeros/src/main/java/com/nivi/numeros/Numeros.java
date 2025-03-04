/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nivi.numeros;
import static spark.Spark.*;
/**
 *
 * @author nicov
 */
public class Numeros {

    public static void main(String[] args) {
        get("/ordenar", NumeroControlador.ordenar);
        get("/desordenar", NumeroControlador.desordenar);
    }
}
