/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {
    public static void main(String[] args) {
        // Creamos una lista de animales
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Mishi"));
        animales.add(new Vaca("Lola"));

        // Mostramos la descripción y el sonido de cada animal
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("-------------------------");
        }
    }
}
