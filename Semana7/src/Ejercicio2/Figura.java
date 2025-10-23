/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio2;

/**
 *
 * @author Giuliano Scaglioni
 */
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: cada figura implementa su propio cálculo de área
    public abstract double calcularArea();

    public void mostrarInfo() {
        System.out.println("Figura: " + nombre);
        System.out.println("Área: " + calcularArea());
        System.out.println("--------------------");
    }
}