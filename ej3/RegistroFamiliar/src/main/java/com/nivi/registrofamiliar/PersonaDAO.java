/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.registrofamiliar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicov
 */
public class PersonaDAO {

    private List<Persona> personas;

    private void init() {
        personas = new ArrayList<Persona>();
        Persona pMaria = new Persona("Maria", "Perez");
        Persona pDorila = new Persona("Dorila", "Lopez");
        Persona pOrlando = new Persona("Orlando", "Martinez");
        Persona pRosana = new Persona("Rosana", "Perez");
        Persona pAriel = new Persona("Ariel", "Perez");
        Persona pNico = new Persona("Nicolás", "Perez");
        Persona pSergio = new Persona("Sergio", "Martinez");
        Persona pMariela = new Persona("Mariela", "Perez");
        Persona pKevin = new Persona("Kevin", "Martinez");
        Persona pGere = new Persona("Claudio", "Perez");
        pMaria.addHijo(pAriel);
        pMaria.addHijo(pMariela);
        pDorila.addHijo(pRosana);
        pDorila.addHijo(pSergio);
        pOrlando.addHijo(pSergio);
        pOrlando.addHijo(pRosana);
        pAriel.addHijo(pNico);
        pRosana.addHijo(pNico);
        pSergio.addHijo(pKevin);
        pMariela.addHijo(pGere);
        personas.add(pNico);
        personas.add(pMaria);
        personas.add(pDorila);
        personas.add(pOrlando);
        personas.add(pRosana);
        personas.add(pAriel);
        personas.add(pGere);
        personas.add(pMariela);
        personas.add(pSergio);
        personas.add(pKevin);
    }

    ;
    
    public List<Persona> getNietos(String nombre) {
        init();
        List<Persona> nietos;
        nietos = new ArrayList<Persona>();
        Persona pEncontrada = personas.stream()
                .filter(p -> nombre.equals(p.getNombre()))
                .findAny()
                .orElse(null);
        if (pEncontrada != null) {
            pEncontrada.getHijos().forEach(persona -> {
                nietos.addAll(persona.getHijos());
            });
        }
        return nietos;
    }

    public List<Persona> getPersonas() {
        init();
        return personas;
    }

    public List<Persona> getHijos(String nombre) {
        init();
        List<Persona> hijos = null;
        Persona pEncontrada = personas.stream()
                .filter(p -> nombre.equals(p.getNombre()))
                .findAny()
                .orElse(null);
        if (pEncontrada != null) {
            hijos = pEncontrada.getHijos();
        }
        return hijos;
    }

    public List<Persona> getPadres(String nombre) {
        init();
        List<Persona> padres = new ArrayList<>();
        Persona pEncontrada = personas.stream()
                .filter(p -> nombre.equals(p.getNombre()))
                .findAny()
                .orElse(null);
        if (pEncontrada != null) {
            for (Persona p : personas) {
                if (p.getHijos().contains(pEncontrada)) {
                    padres.add(p);
                }
                if (padres.size() > 1) {
                    break; //Deja de iterar si ya encontro los dos padres
                }
            }
        }
        return padres;
    }

    public List<Persona> getHermanos(String nombre) {
        init();
        List<Persona> hermanos = new ArrayList<>();
        List<Persona> padres = getPadres(nombre);
        if (!padres.isEmpty()) {
            hermanos = padres.get(0).getHijos();
            for (Persona p : hermanos) {
                if (nombre.equals(p.getNombre())) {
                    hermanos.remove(p);
                    break;
                }
            }
        }
        return hermanos;
    }

    public List<Persona> getSobrinos(String nombre) {
        init();
        List<Persona> sobrinos = new ArrayList<>();
        List<Persona> hermanos = getHermanos(nombre);
        if (!hermanos.isEmpty()) {
            for (Persona hermano : hermanos) {
                sobrinos.addAll(hermano.getHijos());
            }
        }
        return sobrinos;
    }

    public List<Persona> getTios(String nombre) {
        init();
        List<Persona> tios = new ArrayList<>();
        List<Persona> padres = getPadres(nombre);
        if (!padres.isEmpty()) {
            for (Persona padre : padres) {
                tios.addAll(getHermanos(padre.getNombre()));
            }
        }
        return tios;
    }

}
