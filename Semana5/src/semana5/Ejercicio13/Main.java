/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5.Ejercicio13;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {

    public static void main(String[] args) {
        Usuario user = new Usuario("Fiama Scaglioni", "fiama@gmail.com");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("QR123", user); // dependencia de creación

    }
}
