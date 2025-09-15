/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana4;

/**
 *
 * @author giuli
 */
public class Semana4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de empleados usando ambos constructores
        Empleado e1 = new Empleado(100, "Juan Pérez", "Analista", 75000);
        Empleado e2 = new Empleado("María López", "Programadora");
        Empleado e3 = new Empleado("Carlos Gómez", "Tester");

        // Aplicando aumentos de salario con sobrecarga
        e1.actualizarSalario(10.0);   // 10% de aumento (double)
        e2.actualizarSalario(5000);   // aumento fijo de 5000 (int)

        // Mostrar información de empleados
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
