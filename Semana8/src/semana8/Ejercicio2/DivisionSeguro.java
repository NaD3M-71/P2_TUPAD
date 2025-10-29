/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana8.Ejercicio2;

/**
 *
 * @author Giuliano Scaglioni
 */
public class DivisionSeguro {
    public static double dividir(double a, double b) {
        try {
            return a / b; // si b==0 lanza ArithmeticException para enteros; para double devuelve Infinity, así que validamos
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
            throw e;
        }
    }

    // Versión segura que chequea divisor
    public static double dividirSeguro(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return a / b;
    }
}
