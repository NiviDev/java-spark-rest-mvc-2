/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.convertidor;

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
public class ConvertidorControlador {

    public static Route celsAFahr = (Request req, Response res) -> {
        double cels = Double.parseDouble(req.queryParams("valor"));
        String result = String.format("%.2f", Convertidor.celsAFahr(cels));
        return mostrarResultado(req.queryParams("valor"), result, "°C", "°F");
    };

    public static Route fahrACels = (Request req, Response res) -> {
        double fahr = Double.parseDouble(req.queryParams("valor"));
        String result = String.format("%.2f", Convertidor.fahrACels(fahr));
        return mostrarResultado(req.queryParams("valor"), result, "°F", "°C");
    };
    
    public static Route metrosAPies = (Request req, Response res) -> {
        double metros = Double.parseDouble(req.queryParams("valor"));
        String result = String.format("%.2f", Convertidor.metrosAPies(metros));
        return mostrarResultado(req.queryParams("valor"), result, "m", "ft");
    };

    public static Route piesAMetros = (Request req, Response res) -> {
        double pies = Double.parseDouble(req.queryParams("valor"));
        String result = String.format("%.2f", Convertidor.piesAMetros(pies));
        return mostrarResultado(req.queryParams("valor"), result, "ft", "m");
    };
    
    public static Route kgALb = (Request req, Response res) -> {
        double kg = Double.parseDouble(req.queryParams("valor"));
        String result = String.format("%.2f", Convertidor.kgALb(kg));
        return mostrarResultado(req.queryParams("valor"), result, "Kg", "Lb");
    };

    public static Route lbAKg = (Request req, Response res) -> {
        double lb = Double.parseDouble(req.queryParams("valor"));
        String result = String.format("%.2f", Convertidor.lbAKg(lb));
        return mostrarResultado(req.queryParams("valor"), result, "Lb", "Kg");
    };
    
    public static String mostrarResultado(String valorI, String valorF, String unidadI, String unidadF) {
        HashMap model = new HashMap();
        model.put("valorI", valorI);
        model.put("valorF", valorF);
        model.put("unidadI", unidadI);
        model.put("unidadF", unidadF);
        model.put("template", "templates/convertidor.vtl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    }
}
