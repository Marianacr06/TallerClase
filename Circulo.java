/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import static java.lang.Math.pow;

/**
 *
 * @author mac
 */
public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
      public double area(){
        return 3.1416* pow(this.radio,2);
    }
    public double perimetro(){
            return 2*(3.1416* this.radio);
    }
}
    
    


