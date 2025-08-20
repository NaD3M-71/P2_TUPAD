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
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular el costo de envío y el total de la compra.\n");

        // pedir el precio
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        // pedir el peso
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        // pedir el tipo de envío
        String opcionZona = "";
        boolean opcionValida = false;

        while (!opcionValida) {
            System.out.print("Ingrese la zona de envío (A = Nacional, B = Internacional): ");
            opcionZona = sc.nextLine().trim().toUpperCase();

            switch (opcionZona) {
                case "A":
                    double costoEnvioA = calcularCostoEnvio(peso, opcionZona);
                    double totalA = calcularTotalCompra(precioProducto, costoEnvioA);
                    System.out.println("El costo de envío es: " + costoEnvioA);
                    System.out.println("El total a pagar es: " + totalA);
                    opcionValida = true;
                    break;

                case "B":
                    double costoEnvioB = calcularCostoEnvio(peso, opcionZona);
                    double totalB = calcularTotalCompra(precioProducto, costoEnvioB);
                    System.out.println("El costo de envío es: " + costoEnvioB);
                    System.out.println("El total a pagar es: " + totalB);
                    opcionValida = true;
                    break;

                default:
                    System.out.println("Opción inválida. Por favor ingrese 'A' o 'B'.");
            }
        }
    }

    public static double calcularCostoEnvio(double peso, String opcionZona) {
        if (opcionZona.equals("A")) {
            return peso * 5.0; // Nacional
        } else {
            return peso * 10.0; // Internacional
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

}
