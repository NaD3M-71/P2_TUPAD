/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio2;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {
    public static void main(String[] args) {
        // 1 Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Fantástica");

        // 2 Crear autores
        Autor autor1 = new Autor("A1", "J.R.R. Tolkien", "Británico");
        Autor autor2 = new Autor("A2", "C.S. Lewis", "Británico");
        Autor autor3 = new Autor("A3", "Arthur Conan Doyle", "Británico");

        // 3 Agregar libros
        biblioteca.agregarLibro("ISBN001", "El Hobbit", 1937, autor1);
        biblioteca.agregarLibro("ISBN002", "El Señor de los Anillos: La Comunidad del Anillo", 1954, autor1);
        biblioteca.agregarLibro("ISBN003", "Las Crónicas de Narnia: El León, la Bruja y el Ropero", 1950, autor2);
        biblioteca.agregarLibro("ISBN004", "El Silmarillion", 1977, autor1);
        biblioteca.agregarLibro("ISBN005", "Sherlock Holmes: Estudio en Escarlata", 1887, autor3);

        // 4 Listar todos los libros
        System.out.println("=== LISTADO DE LIBROS ===");
        biblioteca.listarLibros();

        // 5 Buscar libro por ISBN
        System.out.println("=== BUSCAR LIBRO POR ISBN ===");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN002");
        if (buscado != null) buscado.mostrarInfo();
        else System.out.println("No se encontró el libro con ese ISBN.");

        //6 Filtrar libros por año
        System.out.println("=== FILTRAR LIBROS PUBLICADOS EN 1954 ===");
        biblioteca.filtrarLibrosPorAnio(1954);

        // 7 Eliminar un libro
        System.out.println("=== ELIMINAR LIBRO ISBN004 ===");
        biblioteca.eliminarLibro("ISBN004");

        // 8 Cantidad total de libros
        System.out.println("Cantidad total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        // 9 Mostrar autores disponibles
        System.out.println("=== AUTORES DISPONIBLES ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}
