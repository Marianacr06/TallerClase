/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author mac
 */
public class MainCuadrado {
    public static void main(String[] args) {
        // Crear un objeto Cuadrado con un lado de longitud 5
        Cuadrado cuadrado = new Cuadrado(5.0);

        // Imprimir el cuadrado utilizando el método toString()
        System.out.println("Cuadrado: " + cuadrado);

        // Calcular y mostrar el área del cuadrado
        System.out.println("Área del cuadrado: " + cuadrado.area());

        // Calcular y mostrar el perímetro del cuadrado
        System.out.println("Perímetro del cuadrado: " + cuadrado.perimetro());
    }
}


   