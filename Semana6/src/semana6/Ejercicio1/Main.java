/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana6.Ejercicio1;

/**
 *
 * @author giuli
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1 Crear productos
        Producto p1 = new Producto("P01", "Pan", 500, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P02", "Celular", 250000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P03", "Remera", 3500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P04", "Tostadora", 18000, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P05", "Yerba", 1500, 40, CategoriaProducto.ALIMENTOS);

        //2 Agregar al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        //3  Listar productos
        System.out.println("=== LISTADO DE PRODUCTOS ===");
        inventario.listarProductos();

        //4 Buscar producto por ID
        System.out.println("=== BUSCAR PRODUCTO POR ID ===");
        Producto buscado = inventario.buscarProductoPorId("P03");
        if (buscado != null) buscado.mostrarInfo();

        //5 Filtrar por categoría
        System.out.println("=== FILTRAR POR CATEGORÍA: ALIMENTOS ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        //6  Eliminar un producto
        System.out.println("=== ELIMINAR PRODUCTO P04 ===");
        inventario.eliminarProducto("P04");
        inventario.listarProductos();

        //7 Actualizar stock
        inventario.actualizarStock("P02", 20);

        //8 Total de stock
        System.out.println("Total de stock disponible: " + inventario.obtenerTotalStock());

        //9 Producto con mayor stock
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("Producto con mayor stock: " + mayorStock);

        //10 Filtrar por precio
        System.out.println("=== PRODUCTOS ENTRE $1000 Y $3000 ===");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        //11 Mostrar categorías disponibles
        System.out.println("=== CATEGORÍAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();
    
    }
    
}
