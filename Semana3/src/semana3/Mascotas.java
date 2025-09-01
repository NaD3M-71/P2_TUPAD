/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana3;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Mascotas {
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+".\nEspecie: "+especie+"\nEdad: "+edad+" años");
    }
    
    public int cumplirAnios(){
        edad++;
        return edad;
    }
}
