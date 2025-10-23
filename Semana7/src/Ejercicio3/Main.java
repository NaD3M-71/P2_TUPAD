/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {
    public static void main(String[] args) {
        // Lista polimórfica de empleados
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Laura", 150000, 25000));
        empleados.add(new EmpleadoTemporal("Carlos", 80000, 10, 5000));
        empleados.add(new EmpleadoPlanta("María", 170000, 30000));

        // Mostrar información usando polimorfismo
        for (Empleado e : empleados) {
            e.mostrarInfo();

            // Clasificación usando instanceof
            if (e instanceof EmpleadoPlanta) {
                System.out.println(e.nombre+" Es un empleado de planta fija.\n");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(e.nombre+" Es un empleado temporal.\n");
            }
        }
    }
}
