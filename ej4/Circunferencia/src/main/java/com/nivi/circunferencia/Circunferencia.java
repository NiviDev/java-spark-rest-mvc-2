/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.circunferencia;

/**
 *
 * @author nicov
 */
class Circunferencia {

    float PI = 3.14159f;

    float getPerimetro(float radio) {
        return (2 * PI * radio);
    }

    float getArea(float radio) {
        return (PI * radio * radio);
    }

}
