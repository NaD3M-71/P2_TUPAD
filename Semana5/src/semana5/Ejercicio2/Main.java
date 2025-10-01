/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana5.Ejercicio2;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {
public static void main(String[] args) {
        Usuario usuario = new Usuario("Giuliano Scaglioni", "40089752");
        Bateria bateria = new Bateria("BatGenerica1", 5000);
        Celular celular = new Celular("Motorola", "RZR", "6518431538432", bateria);
        usuario.setCelular(celular);
        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Batería: " + celular.getBateria().getModelo());
    }
}
