/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana3;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    int anio;
    double calificacion;
    
    public void mostrarInfo(){
        System.out.println("Nombre completo: "+nombre+", "+apellido+".\nCurso: "+curso+"\nAño: "+anio+"°");
    }
    public void subirCalificacion(double puntos){
        if(calificacion+puntos<=100){
            calificacion+=puntos;
            System.out.println("Nueva calificacion: "+calificacion);
        } else {
            calificacion= 100;
            System.out.println("Nueva calificacion: "+calificacion);
        }
    }
    public void bajarCalificacion(double puntos){
        if(calificacion-puntos>=0){
            calificacion-=puntos;
            System.out.println("Nueva calificacion: "+calificacion);
        } else {
            calificacion= 0;
            System.out.println("Nueva calificacion: "+calificacion);
        }
    }
}
