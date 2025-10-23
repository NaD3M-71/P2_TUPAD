/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio3;

/**
 *
 * @author Giuliano Scaglioni
 */

public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método abstracto que cada tipo de empleado implementará
    public abstract double calcularSueldo();

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("Sueldo: $" + calcularSueldo());
        System.out.println("---------------------------");
    }
}
