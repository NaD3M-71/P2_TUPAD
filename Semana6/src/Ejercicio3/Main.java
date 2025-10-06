/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio3;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {
       public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional de la Patagonia");

        // 1 Crear profesores
        Profesor prof1 = new Profesor("P1", "Giuliano Scaglioni", "Física");
        Profesor prof2 = new Profesor("P2", "Lucía Schooff", "Historia");
        Profesor prof3 = new Profesor("P3", "Hernán Rago", "Economía");

        // 2 Crear cursos
        Curso c1 = new Curso("C101", "Física I");
        Curso c2 = new Curso("C102", "Física II");
        Curso c3 = new Curso("C103", "Historia Contemporánea");
        Curso c4 = new Curso("C104", "Contabilidad");
        Curso c5 = new Curso("C105", "Economía I");

        // 3 Agregar profesores y cursos a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 4 Asignar profesores a cursos
        uni.asignarProfesorACurso("C101", "P1"); 
        uni.asignarProfesorACurso("C102", "P1"); 
        uni.asignarProfesorACurso("C103", "P2"); 
        uni.asignarProfesorACurso("C104", "P3"); 
        uni.asignarProfesorACurso("C105", "P3"); 

        // 5 Listar cursos y profesores
        System.out.println("\n=== LISTADO DE CURSOS ===");
        uni.listarCursos();

        System.out.println("\n=== LISTADO DE PROFESORES ===");
        uni.listarProfesores();

        // 6 Cambiar profesor de un curso (por ejemplo, Historia Contemporánea pasa a Giuliano)
        System.out.println("\n=== CAMBIAR PROFESOR DE HISTORIA CONTEMPORÁNEA ===");
        uni.asignarProfesorACurso("C103", "P1");

        // 7 Eliminar un curso (Economía I)
        System.out.println("\n=== ELIMINAR CURSO ECONOMÍA I ===");
        uni.eliminarCurso("C105");

        // 8 Eliminar un profesor (Lucía Schooff)
        System.out.println("\n=== ELIMINAR PROFESORA LUCÍA SCHOOFF ===");
        uni.eliminarProfesor("P2");

        // 9 Reporte final
        System.out.println("\n=== REPORTE FINAL ===");
        uni.mostrarReporteCursosPorProfesor();
    }
}
