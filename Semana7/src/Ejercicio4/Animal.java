/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio4;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Este animal hace un sonido genérico.");
    }

    public void describirAnimal() {
        System.out.println("Soy un animal llamado " + nombre + ".");
    }
}
