/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana2;

import java.util.Scanner;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular el precio final de un producto con impuesto y descuento.\n");

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuesto = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje: ");
        double descuento = sc.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Calcula el precio final aplicando impuesto y descuento sobre el precio base
        double montoImpuesto = precioBase * (impuesto / 100);
        double montoDescuento = precioBase * (descuento / 100);
        return precioBase + montoImpuesto - montoDescuento;
    }
}
