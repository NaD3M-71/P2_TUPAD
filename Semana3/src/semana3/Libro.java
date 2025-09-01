/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana3;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    // Getter para titulo
    public String getTitulo() {
        return titulo;
    }

    // Setter para titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para autor
    public String getAutor() {
        return autor;
    }

    // Setter para autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Getter para añoPublicacion
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setter con validación para añoPublicacion
    public void setAnioPublicacion(int cambioAnio) {
        if (cambioAnio > 0 && cambioAnio <= 2025) {
            anioPublicacion = cambioAnio;
        } else {
            System.out.println("⚠️ Año de publicación inválido: " + cambioAnio);
        }
    }

    // Método para mostrar info
    public void mostrarInfo() {
        System.out.println("Título: " + titulo +
                           "\nAutor: " + autor +
                           "\nAño de publicación: " + anioPublicacion);
        System.out.println("\n");
    }
}
