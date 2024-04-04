/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author mac
 */
public class Persona {

    private LocalDate fechaNacimiento;

    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        LocalDate hoy = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, hoy);

        return edad.getYears();
    }

    public int getMeses() {
        LocalDate hoy = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, hoy);

        return edad.getMonths();
    }

    public int getDias() {
        LocalDate hoy = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, hoy);

        return edad.getDays();
    }
    
}
