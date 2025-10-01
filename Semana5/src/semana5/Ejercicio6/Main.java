/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5.Ejercicio6;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fiama Scaglioni", "2945555555");
        Mesa mesa = new Mesa(7, 12);
        Reserva reserva = new Reserva("2025-11-21", "21:00", mesa);
        reserva.setCliente(cliente);
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Mesa número: " + reserva.getMesa().getNumero());

    }

}
