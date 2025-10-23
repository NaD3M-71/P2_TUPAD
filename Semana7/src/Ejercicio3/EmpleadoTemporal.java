/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio3;

/**
 *
 * @author Giuliano Scaglioni
 */
public class EmpleadoTemporal extends Empleado {
    private int diasTrabajados;
    private double pagoPorDia;

    public EmpleadoTemporal(String nombre, double salarioBase, int diasTrabajados, double pagoPorDia) {
        super(nombre, salarioBase);
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + (diasTrabajados * pagoPorDia);
    }
}
