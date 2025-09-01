/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3;

/**
 *
 * @author giuli
 */
public class Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //************* Ejercicio 1*************
        Estudiante e1 = new Estudiante();
        e1.nombre = "Giuliano";
        e1.apellido = "Scaglioni";
        e1.curso = "A";
        e1.anio = 1;
        e1.calificacion=86.15;
        
        
        // Mostrando info
        e1.mostrarInfo();
        
        //Subir nota
        e1.subirCalificacion(9.15);
        e1.mostrarInfo();
        
        //Bajar nota
        e1.bajarCalificacion(4.65);
        e1.mostrarInfo();

        
        //************EJERCICIO 2**************
        Mascotas m1 = new Mascotas();
        m1.nombre = "Firulais";
        m1.especie = "Perro";
        m1.edad = 3;

        // Mostrando info
        m1.mostrarInfo();

        // cumple años
        m1.cumplirAnios();

        // Mostrando info
        m1.mostrarInfo();
        
        //***********EJERCICIO 3***************
        Libro libro1 = new Libro();

        // Seteo valores
        libro1.setTitulo("El Señor de los Anillos: La comunidad del anillo");
        libro1.setAutor("J. R. R. Tolkien");
        libro1.setAnioPublicacion(1954);

        libro1.mostrarInfo();

        System.out.println("\nIntentando cambiar año a -100...");
        libro1.setAnioPublicacion(-100); // inválido

        System.out.println("\nIntentando cambiar año a 2000...");
        libro1.setAnioPublicacion(2000); // válido

        System.out.println("\nInformación final del libro:");
        libro1.mostrarInfo();
        
        //***********EJERCICIO 4***************
        Gallina g1 = new Gallina();
        g1.idGallina = 1;
        g1.edad = 1;
        g1.huevosPuestos = 0;

        Gallina g2 = new Gallina();
        g2.idGallina = 2;
        g2.edad = 2;
        g2.huevosPuestos = 3;

        // Simulamos acciones
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.envejecer();

        // Mostrar estado final
        System.out.println("\n--- Estado Final ---");
        g1.mostrarEstado();
        System.out.println("\n");
        g2.mostrarEstado();
        
        //**********Ejercicio 5 *********
        System.out.println("");
        NaveEspacial nave1 = new NaveEspacial();
        nave1.nombre = "Pillar of Autumn";
        nave1.combustible = 50;

        nave1.mostrarEstado();
        
        // Despegar
        nave1.despegar(); // consume 10
        
        // Intentar avanzar sin recargar
        nave1.avanzar(30); // consume 60, pero solo tiene 50 -> falla

        // Recargar
        nave1.recargarCombustible(40); // recarga hasta 90

        // Avanzar correctamente
        nave1.avanzar(20); // consume 40, queda 50

        

        // Estado final
        System.out.println("\n--- Estado Final ---");
        nave1.mostrarEstado();
    
    }
    
}
