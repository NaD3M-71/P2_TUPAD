/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5.Ejercicio4;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Martina Scaglioni", "44004404");
        Banco banco = new Banco("Banco Macro", "30-12312312-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "06/26", banco);
        cliente.setTarjeta(tarjeta);
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());

    }

}
