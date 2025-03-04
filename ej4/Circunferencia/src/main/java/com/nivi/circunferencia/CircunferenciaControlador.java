/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.circunferencia;

import java.util.HashMap;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author nicov
 */
class CircunferenciaControlador {

    public static Route circunferencia = (Request request, Response response) -> {
        Circunferencia c = new Circunferencia();
        float radio = Float.parseFloat(request.queryParams("rad"));
        float perim = c.getPerimetro(radio);
        float area = c.getArea(radio);
        
        HashMap model = new HashMap();
        model.put("perim", perim);
        model.put("area", area);
        model.put("template", "templates/circunferencia.vtl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
}
