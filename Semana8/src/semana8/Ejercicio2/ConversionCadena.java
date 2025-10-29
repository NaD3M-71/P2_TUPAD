/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana8.Ejercicio2;

/**
 *
 * @author Giuliano Scaglioni
 */
public class ConversionCadena {
    public static Integer convertirAInt(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("Número inválido: '" + texto + "'. Detalle: " + e.getMessage());
            return null;
        }
    }
}
