/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana8.Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) División segura
        System.out.println("DIVISIÓN SEGURA: 10 / 0 (demo)");
        try {
            double res = DivisionSeguro.dividirSeguro(10, 0);
            System.out.println("Resultado: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Capturada ArithmeticException: " + e.getMessage());
        }

        // 2) Conversión de cadena
        System.out.print("\nCONVERSIÓN: Ingresá un número (ejemplo: '123' o 'abc'): ");
        String entrada = sc.nextLine();
        Integer numero = ConversionCadena.convertirAInt(entrada);
        if (numero != null) {
            System.out.println("Parse OK: " + numero);
        }

        // 3) Lectura de archivo
        System.out.print("\nLECTURA DE ARCHIVO: Ingresá ruta de archivo (ej: /tmp/archivo.txt): ");
        String ruta = sc.nextLine();
        LecturaArchivo.mostrarArchivo(ruta);

        // 4) Excepción personalizada (edad)
        System.out.print("\nVALIDAR EDAD: Ingresá una edad: ");
        int edad;
        try {
            edad = Integer.parseInt(sc.nextLine());
            try {
                ValidarEdad.validar(edad);
            } catch (EdadInvalidaException e) {
                System.out.println("EdadInvalidaException capturada: " + e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println("Debes ingresar un número entero para la edad.");
        }

        // 5) try-with-resources ya se mostró en LecturaArchivo; aquí cerramos scanner
        sc.close();
    }
}