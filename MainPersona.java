/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;
import java.time.LocalDate;


/**
 *
 * @author mac
 */
public class MainPersona {
  public static void main(String[] args) {
    // Crea una nueva persona con una fecha de nacimiento
    Persona persona = new Persona(LocalDate.of(2004, 06, 26));
    // Imprime la edad en años
    System.out.println("Edad en años: " + persona.getEdad());

    // Imprime la edad en meses
    System.out.println("Edad en meses: " + persona.getMeses());

    // Imprime la edad en días
    System.out.println("Edad en días: " + persona.getDias());
  }

}