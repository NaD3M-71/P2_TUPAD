/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana2;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        // declarar e inicializar el array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // mostrar precios originales usando recursividad
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);

        // modificar el precio de un producto específico (índice 4 en este caso)
        precios[3] = 12900;

        // mostrar precios modificados usando recursividad
        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);
    }

    // función recursiva para mostrar los precios desde un índice dado
    public static void mostrarPrecios(double[] precios, int indice) {
        // caso base: si el índice es igual a la longitud, terminar
        if (indice == precios.length) {
            return;
        }
        // mostrar el precio actual
        System.out.println("Precio: $" + precios[indice]);
        // llamada recursiva al siguiente elemento
        mostrarPrecios(precios, indice + 1);
    }
}
