/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nivi.registrofamiliar;

import static spark.Spark.*;

/**
 *
 * @author nicov
 */
public class RegistroFamiliar {

    public static void main(String[] args) {
        get("/getPersonas", PersonaControlador.getPersonas);
        get("/getNietos", PersonaControlador.getNietos);
        get("/getHijos", PersonaControlador.getHijos);
        get("/getPadres", PersonaControlador.getPadres);
        get("/getHermanos", PersonaControlador.getHermanos);
        get("/getSobrinos", PersonaControlador.getSobrinos);
        get("/getTios", PersonaControlador.getTios);
    }
}
