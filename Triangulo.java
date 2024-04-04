/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

/**
 *
 * @author mac
 */
public class Triangulo {

    private double lado;
    private double base;
    private double altura;

    public Triangulo(double lado, double base, double altura) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado=" + lado + ", base=" + base + ", altura=" + altura + '}';
    }

    public double area() {
        return (this.base * this.altura) / 2;
    }

    public double perimetro() {
        return this.lado + this.lado + this.lado;
    }

    public double hipotenusa() {
        return Math.sqrt(Math.pow(this.lado, 2) + Math.pow(this.lado, 2));
    }
}
