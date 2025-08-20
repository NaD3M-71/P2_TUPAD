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
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 y 10.\n");

        int nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();

            if (!esNotaValida(nota)) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (!esNotaValida(nota));

        System.out.println("Nota guardada correctamente.");
    }

    public static boolean esNotaValida(int nota) {
        // Retorna true si la nota está entre 0 y 10 (inclusive)
        return nota >= 0 && nota <= 10;
    }
}
