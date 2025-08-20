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
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese números enteros y el programa sumará solo los pares.\n" + "Ingrese 0 para terminar.\n");

        int numero;
        int sumaPares = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (esPar(numero)) {
                sumaPares += numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
    }

    public static boolean esPar(int num) {
        // Retorna true si el número es par
        return num % 2 == 0;
    }
}
