/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Agregar libro al listado
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevo = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevo);
        System.out.println("Libro agregado: " + titulo);
    }

    // Listar todos los libros
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("=== Libros disponibles en " + nombre + " ===");
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    // Buscar libro por ISBN
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    // Eliminar libro por ISBN
    public void eliminarLibro(String isbn) {
        Libro encontrado = buscarLibroPorIsbn(isbn);
        if (encontrado != null) {
            libros.remove(encontrado);
            System.out.println("Libro eliminado: " + encontrado.getTitulo());
        } else {
            System.out.println("No se encontró un libro con ISBN " + isbn);
        }
    }

    // Obtener cantidad de libros
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // Filtrar libros por año
    public void filtrarLibrosPorAnio(int anio) {
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros publicados en el año " + anio);
        }
    }

    // Mostrar autores de los libros disponibles
    public void mostrarAutoresDisponibles() {
        System.out.println("=== Autores disponibles ===");
        libros.stream()
                .map(Libro::getAutor)
                .distinct()
                .forEach(a -> System.out.println(a.getNombre() + " (" + a.getNacionalidad() + ")"));
    }
}
