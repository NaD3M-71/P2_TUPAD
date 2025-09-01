/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana3;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    // Método para envejecer
    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " cumplió años. Edad actual: " + edad);
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina +
                           "\nEdad: " + edad +
                           "\nHuevos puestos: " + huevosPuestos);
    }
}
