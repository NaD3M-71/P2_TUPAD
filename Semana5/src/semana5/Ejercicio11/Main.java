/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5.Ejercicio11;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {

    public static void main(String[] args) {
        Artista artista = new Artista("Linkin Park", "Nu Metal");
        Cancion cancion = new Cancion("Points of Authority", artista);
        Reproductor r = new Reproductor();
        r.reproducir(cancion); // Dependencia de uso

    }
}
