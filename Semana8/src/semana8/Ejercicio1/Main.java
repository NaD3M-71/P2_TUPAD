/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana8.Ejercicio1;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("María Perez", "maria@ejemplo.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Auriculares", 4500));
        pedido.agregarProducto(new Producto("Teclado", 3200));

        System.out.println(pedido); // muestra total
        // Pago por Tarjeta con descuento
        Pago tarjeta = new TarjetaCredito("1234-5678-9012-3456", "María Perez");
        boolean exito = tarjeta.procesarPago(pedido.calcularTotal());
        if (exito) {
            pedido.cambiarEstado(Pedido.Estado.PAGADO);
            // luego se puede marcar ENVIADO...
            pedido.cambiarEstado(Pedido.Estado.ENVIADO);
        }
    }
}