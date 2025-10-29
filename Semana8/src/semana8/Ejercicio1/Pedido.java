/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package semana8.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Pedido implements Pagable {
    public enum Estado { PENDIENTE, PAGADO, ENVIADO, CANCELADO }

    private List<Producto> productos = new ArrayList<>();
    private Estado estado = Estado.PENDIENTE;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::calcularTotal).sum();
    }

    public void cambiarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
        // Notificar al cliente del cambio
        if (cliente != null) {
            cliente.notificar("El pedido cambió su estado a: " + nuevoEstado);
        }
    }

    public Estado getEstado() { return estado; }
    @Override
    public String toString() {
        return "Pedido[" + productos + "] - Total: $" + calcularTotal();
    }
}
