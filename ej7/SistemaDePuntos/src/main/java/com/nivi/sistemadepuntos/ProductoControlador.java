/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.sistemadepuntos;

import java.util.HashMap;
import java.util.List;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author nicov
 */
public class ProductoControlador {
    public static Route getProductos = (Request req, Response res) -> {
        ProductoDAO pDAO = new ProductoDAO();
        List<Producto> p = pDAO.getProductos();
        
        HashMap model = new HashMap();
        model.put("p", p);
        model.put("textoTabla", "Lista Completa");
        model.put("template", "templates/SistemaDePuntos.vtl");
        
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
    
    public static Route getCanjeables = (Request req, Response res) -> {
        ProductoDAO pDAO = new ProductoDAO();
        int puntos = Integer.parseInt(req.queryParams("puntos"));
        List<Producto> p = pDAO.getCanjeables(puntos);
        
        HashMap model = new HashMap();
        model.put("p", p);
        model.put("textoTabla", "Lista de Canjeables");
        model.put("template", "templates/SistemaDePuntos.vtl");
        
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
}
