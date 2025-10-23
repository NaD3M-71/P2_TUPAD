/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio1;

/**
 *
 * @author Giuliano Scaglioni
 */
// Subclase Auto que hereda de Vehiculo
class Auto extends Vehiculo {
    private int cantidadPuertas;

    // Constructor que usa super para inicializar la parte de Vehiculo
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    // Sobrescritura del método mostrarInfo()
    @Override
    public void mostrarInfo() {
        // Llamo al método de la superclase para no repetir código
        super.mostrarInfo();
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
}