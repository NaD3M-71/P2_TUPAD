/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tres números enteros y el programa determinará el mayor.\n");

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();

        System.out.println("El mayor es: " + mayorDeTres(num1, num2, num3));
    }
    public static int mayorDeTres(int a, int b, int c) {
        // Retorna el mayor de tres números enteros
        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }
        return mayor;
    }


}
