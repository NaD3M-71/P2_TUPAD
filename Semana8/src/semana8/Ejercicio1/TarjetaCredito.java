/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana8.Ejercicio1;

/**
 *
 * @author Giuliano Scaglioni
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numero;
    private String titular;

    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // Ejemplo sencillo: 5% de descuento por promoci�n con tarjeta
        return monto * 0.95;
    }

    @Override
    public boolean procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        // Lógica simulada: si monto < 10000 OK
        System.out.println("Procesando pago con Tarjeta de " + titular + ". Monto final: $" + montoFinal);
        return montoFinal < 1000000; // siempre true a efectos del ejemplo
    }
}