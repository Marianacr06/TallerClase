/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author mac
 */
public class MainTriangulo {

    public static void main(String[] args) {
        // Crear un objeto Triangulo con lados de 3, base de 4 y altura de 5
        Triangulo triangulo = new Triangulo(3, 4, 5);

        // Calcular y imprimir el área del triángulo
        System.out.println("Área del triángulo: " + triangulo.area());

        // Calcular y imprimir el perímetro del triángulo
        System.out.println("Perímetro del triángulo: " + triangulo.perimetro());

        // Calcular y imprimir la hipotenusa del triángulo
        System.out.println("Hipotenusa del triángulo: " + triangulo.hipotenusa());

    }
}
