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
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 10 números enteros y el programa contará positivos, negativos y ceros.\n");

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = sc.nextInt();

            if (esPositivo(numero)) {
                positivos++;
            } else if (esNegativo(numero)) {
                negativos++;
            } else {
                ceros++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

    public static boolean esPositivo(int num) {
        // Retorna true si el número es mayor que 0
        return num > 0;
    }

    public static boolean esNegativo(int num) {
        // Retorna true si el número es menor que 0
        return num < 0;
    }
}
