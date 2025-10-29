/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana8.Ejercicio1;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        // En un sistema real enviarías un email; acá solo simula en consola
        System.out.println("Notificación a " + nombre + " (" + email + "): " + mensaje);
    }

    @Override
    public String toString() {
        return nombre + " <" + email + ">";
    }
}
