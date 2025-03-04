/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.registrofamiliar;

import java.util.List;
import spark.Request;
import spark.Response;
import spark.Route;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

/**
 *
 * @author nicov
 */
public class PersonaControlador {

    public static Route getNietos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p = pDAO.getNietos(req.queryParams("nombre"));

        HashMap model = new HashMap();
        model.put("p", p);
        model.put("template", "templates/registroFamiliar.vtl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
    public static Route getPersonas = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p = pDAO.getPersonas();

        HashMap model = new HashMap();
        model.put("p", p);
        model.put("template", "templates/registroFamiliar.vtl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
    public static Route getHijos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p = pDAO.getHijos(req.queryParams("nombre"));

        HashMap model = new HashMap();
        model.put("p", p);
        model.put("template", "templates/registroFamiliar.vtl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };

    public static Route getPadres = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p = pDAO.getPadres(req.queryParams("nombre"));

        HashMap model = new HashMap();
        model.put("p", p);
        model.put("template", "templates/registroFamiliar.vtl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
    public static Route getHermanos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p = pDAO.getHermanos(req.queryParams("nombre"));

        HashMap model = new HashMap();
        model.put("p", p);
        model.put("template", "templates/registroFamiliar.vtl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
    
    public static Route getSobrinos = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p = pDAO.getSobrinos(req.queryParams("nombre"));

        HashMap model = new HashMap();
        model.put("p", p);
        model.put("template", "templates/registroFamiliar.vtl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
    
    public static Route getTios = (Request req, Response res) -> {
        PersonaDAO pDAO = new PersonaDAO();
        List<Persona> p = pDAO.getTios(req.queryParams("nombre"));

        HashMap model = new HashMap();
        model.put("p", p);
        model.put("template", "templates/registroFamiliar.vtl");
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vtl"));
    };
}
