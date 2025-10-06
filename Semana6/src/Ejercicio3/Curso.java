/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio3;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    // Asigna o cambia el profesor sincronizando ambos lados
    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor == nuevoProfesor) return;

        // Si tenía un profesor anterior, lo eliminamos de su lista
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }

        this.profesor = nuevoProfesor;

        // Si hay un nuevo profesor, lo agregamos a su lista
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " (" + codigo + ")");
        System.out.println("Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
        System.out.println("-----------------------------");
    }

    @Override
    public String toString() {
        return nombre + " [" + codigo + "]";
    }
}
