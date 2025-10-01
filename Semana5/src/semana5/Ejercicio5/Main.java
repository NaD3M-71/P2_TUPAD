/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5.Ejercicio5;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {

    public static void main(String[] args) {
        Propietario propietario = new Propietario("Giuliano Scaglioni", "40089752");
        Computadora pc = new Computadora("ACER", "SN123456", "NITRO5", "I5");
        propietario.setComputadora(pc);

        System.out.println("Propietario: " + pc.getPropietario().getNombre());
        System.out.println("Placa Madre: " + pc.getPlacaMadre().getModelo());

    }

}
