/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana2;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        // declarar e inicializar el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // mostrar precios originales
        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
        }

        // modificar el precio de un producto específico (índice 4 en este caso)
        precios[1] = 12900;

        // mostrar precios modificados
        System.out.println("Precios modificados:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
        }
    }
}

