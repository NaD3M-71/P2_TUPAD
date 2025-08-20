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
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Actualización de stock\n");

        // pedir stock actual
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = sc.nextInt();

        // pedir cantidad vendida
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = sc.nextInt();

        // pedir cantidad recibida
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = sc.nextInt();

        // calcular nuevo stock usando la función
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // mostrar resultado
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

}
