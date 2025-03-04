/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.numeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.codehaus.jackson.map.ObjectMapper;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author nicov
 */
class NumeroControlador {

    public static Route ordenar = (Request req, Response res) -> {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            if (req.queryParams("numero" + i) != null && !req.queryParams("numero" + i).equals("")) {
                numeros.add(Integer.parseInt(req.queryParams("numero" + i)));
            }
        }
        numeros.sort((Integer o1, Integer o2) -> o1.compareTo(o2));
        HashMap model = new HashMap();
        model.put("numeros", numeros);
        model.put("template", "templates/numeros.vtl");

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };

    public static Route desordenar = (Request req, Response res) -> {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            if (req.queryParams("numero" + i) != null && !req.queryParams("numero" + i).equals("")) {
                numeros.add(Integer.parseInt(req.queryParams("numero" + i)));
            }
        }

        Collections.shuffle(numeros);
        HashMap model = new HashMap();
        model.put("numeros", numeros);
        model.put("template", "templates/numeros.vtl");

        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
}
