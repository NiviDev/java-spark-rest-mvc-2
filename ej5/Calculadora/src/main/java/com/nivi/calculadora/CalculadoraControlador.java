/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.calculadora;

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
public class CalculadoraControlador {

    public static Route sumar = (Request request, Response response) -> {
        Calculadora c = new Calculadora();
        int a = Integer.parseInt(request.queryParams("a"));
        int b = Integer.parseInt(request.queryParams("b"));
        int resSuma = c.sumar(a, b);
        return mostrarResultado(a, b, resSuma, "+");
    };

    public static Route restar = (Request request, Response response) -> {
        Calculadora c = new Calculadora();
        int a = Integer.parseInt(request.queryParams("a"));
        int b = Integer.parseInt(request.queryParams("b"));
        int resResta = c.restar(a, b);
        return mostrarResultado(a, b, resResta, "-");
    };
    
    public static Route multiplicar = (Request request, Response response) -> {
        Calculadora c = new Calculadora();
        int a = Integer.parseInt(request.queryParams("a"));
        int b = Integer.parseInt(request.queryParams("b"));
        int resMulti = c.multiplicar(a, b);
        return mostrarResultado(a, b, resMulti, "*");
    };
    
    public static Route dividir = (Request request, Response response) -> {
        Calculadora c = new Calculadora();
        int a = Integer.parseInt(request.queryParams("a"));
        int b = Integer.parseInt(request.queryParams("b"));
        int resDiv = c.dividir(a, b);
        return mostrarResultado(a, b, resDiv, "/");
    };

    public static String mostrarResultado(int a, int b, int res, String operador) {
        HashMap model = new HashMap();
        model.put("res", res);
        model.put("a", a);
        model.put("b", b);
        model.put("operador", operador);
        model.put("template", "templates/calculadora.vtl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    }
}
