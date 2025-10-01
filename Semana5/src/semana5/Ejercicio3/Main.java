/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5.Ejercicio3;

import semana5.Ejercicio3.*;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {

    public static void main(String[] args) {
        Autor autor = new Autor("J. R. R. Tolkien", "Inglés");
        Editorial editorial = new Editorial("Minotauro", "Av. Algo 123");
        Libro libro = new Libro("El Señor de los Anillos: Las Dos Torres", "978-84-450-1440-0", editorial);
        libro.setAutor(autor);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());

    }

}
