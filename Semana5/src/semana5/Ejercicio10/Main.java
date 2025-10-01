/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5.Ejercicio10;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {

    public static void main(String[] args) {
        Titular titular = new Titular("Edinson Cavani", "33445566");
        ClaveSeguridad cs = new ClaveSeguridad("Boca10", "2025-01-01");
        CuentaBancaria cuenta = new CuentaBancaria("681351835134", 350000.0, "Boca10", "2025-01-01");
        titular.setCuenta(cuenta);
        System.out.println("Titular: " + cuenta.getTitular().getNombre());
        System.out.println("Saldo: " + cuenta.getSaldo());
        System.out.println("Clave: " + cuenta.getClave().getCodigo());

    }
}
