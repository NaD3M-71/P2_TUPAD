/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana3;

/**
 *
 * @author Giuliano Scaglioni
 */
public class NaveEspacial {
    String nombre;
    int combustible;
    int capacidadMaxima = 100;
    
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("La nave "+nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar");
        }
    }
    
    public void avanzar(int distancia) {
        int consumo = distancia * 2; // supongamos 2 unidades de combustible por unidad de distancia
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= capacidadMaxima) {
            combustible += cantidad;
            System.out.println(nombre + " recargó " + cantidad + " unidades. Total: " + combustible);
        } else {
            combustible = capacidadMaxima;
            System.out.println(nombre + " alcanzó su capacidad máxima de " + capacidadMaxima);
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + capacidadMaxima);
    }
}
