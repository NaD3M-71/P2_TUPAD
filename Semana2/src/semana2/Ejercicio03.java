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
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad y el programa clasificará su etapa de vida.\n");

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Eres un " + clasificarEdad(edad) + ".");
    }

    public static String clasificarEdad(int edad) {
        // Clasifica la etapa de vida según la edad ingresada
        if (edad < 12) {
            return "Niño";
        } else if (edad <= 17) {
            return "Adolescente";
        } else if (edad <= 59) {
            return "Adulto";
        } else {
            return "Adulto mayor";
        }
    }

}
