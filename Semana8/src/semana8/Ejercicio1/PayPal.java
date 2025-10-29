/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana8.Ejercicio1;

/**
 *
 * @author Giuliano Scaglioni
 */
public class PayPal implements Pago {
    private String cuentaEmail;

    public PayPal(String cuentaEmail) {
        this.cuentaEmail = cuentaEmail;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago por PayPal (" + cuentaEmail + "). Monto: $" + monto);
        return true; // simulación OK
    }
}