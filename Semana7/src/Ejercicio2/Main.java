/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio2;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {
    public static void main(String[] args) {
        // Creamos un array de figuras (polimorfismo en acción)
        Figura[] figuras = new Figura[3];

        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 6);
        figuras[2] = new Circulo(2.5);

        // Recorremos el array y mostramos info de cada figura
        for (Figura f : figuras) {
            f.mostrarInfo(); // Polimorfismo: cada figura ejecuta su propio calcularArea()
        }
    }
}
