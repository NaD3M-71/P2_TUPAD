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
public class Ejercicio11 {
    // variable global para el porcentaje de descuento
    final static double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de descuento especial\n");

        // pedir el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        // calcular el precio final con el descuento especial
        calcularDescuentoEspecial(precioProducto);
    }

    public static void calcularDescuentoEspecial(double precio) {
        // variable local que almacena el monto del descuento aplicado
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;

        // calcular el precio final
        double precioFinal = precio - descuentoAplicado;

        // mostrar resultado
        System.out.println("Descuento aplicado: $-" + descuentoAplicado);
        System.out.println("Precio final con descuento: $" + precioFinal);
    }

}
