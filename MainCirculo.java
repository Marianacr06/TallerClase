/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author mac
 */
public class MainCirculo {
    public static void main(String[] args) {
        // Crear un objeto Circulo con un radio de 3
        Circulo circulo = new Circulo(3);
        
        // Imprimir el radio del círculo
        System.out.println("Radio del círculo: " + circulo.getRadio());
        
        // Calcular y imprimir el área del círculo
        System.out.println("Área del círculo: " + circulo.area());
        
        // Calcular y imprimir el perímetro del círculo
        System.out.println("Perímetro del círculo: " + circulo.perimetro());
        
        // Cambiar el valor del radio del círculo
        circulo.setRadio(5);
        
        // Imprimir el nuevo valor del radio
        System.out.println("Nuevo radio del círculo: " + circulo.getRadio());
        
        // Calcular y imprimir el área del círculo después de cambiar el radio
        System.out.println("Área del círculo después de cambiar el radio: " + circulo.area());
        
        // Calcular y imprimir el perímetro del círculo después de cambiar el radio
        System.out.println("Perímetro del círculo después de cambiar el radio: " + circulo.perimetro());
    }
}
