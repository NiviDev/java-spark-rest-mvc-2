/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nivi.indicemasacorporal;
import static spark.Spark.*;
/**
 *
 * @author nicov
 */
public class IndiceMasaCorporal {

    public static void main(String[] args) {
        get("/getIMC", IndiceControlador.getIMC);
    }
}
