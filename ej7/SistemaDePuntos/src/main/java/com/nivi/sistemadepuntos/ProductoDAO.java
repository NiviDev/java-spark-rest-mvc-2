/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.sistemadepuntos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicov
 */
public class ProductoDAO {

    private List<Producto> productos;

    private void init() {
        productos = new ArrayList<>();
        Producto pKilo = new Producto("1 Kilo", 5000);
        Producto pMedio = new Producto("1/2 Kilo", 3000);
        Producto pCuarto = new Producto("1/4 Kilo", 1500);
        Producto pGigante2 = new Producto("Gigante 2 bochas", 1000);
        Producto pGigante3 = new Producto("Gigante 3 bochas", 1500);
        Producto pBatido = new Producto("Batido", 1500);
        Producto pFamiliar = new Producto("Pote Familiar 3lt", 7000);
        Producto pTentacion = new Producto("Tentacion", 3000);
        Producto pSuperGrid = new Producto("Super Gridito", 500);
        productos.add(pKilo);
        productos.add(pMedio);
        productos.add(pCuarto);
        productos.add(pGigante2);
        productos.add(pGigante3);
        productos.add(pBatido);
        productos.add(pFamiliar);
        productos.add(pTentacion);
        productos.add(pSuperGrid);
    }

    public List<Producto> getProductos() {
        init();
        return productos;
    }

    public List<Producto> getCanjeables(int puntos) {
        init();
        ArrayList<Producto> canjeables = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPuntos() <= puntos) {
                canjeables.add(p);
            }
        }
        return canjeables;
    }
}
