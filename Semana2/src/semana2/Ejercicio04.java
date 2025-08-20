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
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio y la categoría del producto para calcular el descuento.\n");

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = sc.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String salto = sc.nextLine();
        String categoria = sc.nextLine().toUpperCase();

        double descuento = obtenerDescuento(categoria);
        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("\nPrecio original: $" + precioOriginal);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Precio final: $" + precioFinal);
    }

    public static double obtenerDescuento(String categoria) {
        // Retorna el porcentaje de descuento según la categoría
        switch (categoria) {
            case "A":
                return 10.0;
            case "B":
                return 15.0;
            case "C":
                return 20.0;
            default:
                System.out.println("Categoría no válida. Se aplicará 0% de descuento.");
                return 0.0;
        }
    }


}
