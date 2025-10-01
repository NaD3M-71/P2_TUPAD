/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5.Ejercicio9;

/**
 *
 * @author Giuliano Scaglioni
 */
public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Andrea Otero", "SEROS");
        Profesional profesional = new Profesional("Dr. Christian Lewis", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-05-15", "16:30");
        cita.setProfesional(profesional);
        cita.setPaciente(paciente);
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());

    }
}
