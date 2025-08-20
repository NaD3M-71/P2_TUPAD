package semana2;

import java.util.Scanner;

/**
 *
 * @author giuli
 */
public class Semana2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un año y el programa dirá si fue o es bisiesto.\n");
        int anio =  sc.nextInt();
        if (esBisiesto(anio)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }

    }
    public static boolean esBisiesto(int anio) {
    // Un año es bisiesto si es divisible por 4 pero no por 100,
    // excepto que también sea divisible por 400.
    return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    
}
