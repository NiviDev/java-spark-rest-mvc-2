/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.indicemasacorporal;

import com.fasterxml.jackson.databind.ObjectMapper;
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
public class IndiceControlador {

    public static Route getIMC = (Request req, Response res) -> {
        IndiceDAO iDAO = new IndiceDAO();
        double altura = Double.parseDouble(req.queryParams("altura"));
        double peso = Double.parseDouble(req.queryParams("peso"));
        Indice indice = iDAO.getIMC(altura, peso);
        String estado = indice.getEstado();
        String valor = String.format("%.2f", indice.getValor());
        
        HashMap model = new HashMap();
        model.put("estado", estado);
        model.put("valor", valor);
        model.put("template", "templates/icm.vtl");
        
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
    
}
