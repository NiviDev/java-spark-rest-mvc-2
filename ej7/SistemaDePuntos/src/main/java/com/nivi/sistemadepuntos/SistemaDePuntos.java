/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nivi.sistemadepuntos;
import static spark.Spark.*;
/**
 *
 * @author nicov
 */
public class SistemaDePuntos {

    public static void main(String[] args) {
        get("/getProductos", ProductoControlador.getProductos);
        get("/getCanjeables", ProductoControlador.getCanjeables);
    }
}
