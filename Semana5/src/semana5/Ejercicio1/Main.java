/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana5.Ejercicio1;

import semana5.Ejercicio1.Pasaporte;
import semana5.Ejercicio1.Titular;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Giuliano Scaglioni", "12345678");
        Pasaporte pasaporte = new Pasaporte("AB123456", "2020-01-01", "foto.jpg", "JPEG");
        titular.setPasaporte(pasaporte);
        System.out.println("Pasaporte número: " + pasaporte.getNumero());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
    }
    
}