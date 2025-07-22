package com.empresaAsesoria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Principal {

    private static final DateTimeFormatter F_FECHA = 
        DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter F_HORA  = 
        DateTimeFormatter.ofPattern("HH:mm");

    public static void main(String[] args) {
        Scanner scan       = new Scanner(System.in);
        Contenedor cont    = new Contenedor();
        int opcion;

        do {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Almacenar Cliente");
            System.out.println("2. Almacenar Profesional");
            System.out.println("3. Almacenar Administrador");
            System.out.println("4. Almacenar Capacitación");
            System.out.println("5. Eliminar Usuario");
            System.out.println("6. Listar Usuarios");
            System.out.println("7. Listar Usuarios por Tipo");
            System.out.println("8. Listar Capacitaciones");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scan.nextLine().trim());

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Datos Cliente ---");
                    System.out.print("Nombre (10–50 chars): ");
                    String nombreC = scan.nextLine().trim();
                    System.out.print("Fecha de nacimiento (dd/MM/yyyy): ");
                    LocalDate fnC = leerFecha(scan);
                    System.out.print("RUN: ");
                    String rutC = scan.nextLine().trim();
                    System.out.print("Nombres: ");
                    String n1 = scan.nextLine().trim();
                    System.out.print("Apellidos: ");
                    String a1 = scan.nextLine().trim();
                    System.out.print("Teléfono: ");
                    int tel = Integer.parseInt(scan.nextLine().trim());
                    System.out.print("AFP (4–30 chars): ");
                    String afp = scan.nextLine().trim();
                    System.out.print("Sistema de salud (1=Fonasa,2=Isapre): ");
                    int salud = Integer.parseInt(scan.nextLine().trim());
                    System.out.print("Dirección (≤70 chars): ");
                    String dir = scan.nextLine().trim();
                    System.out.print("Comuna (≤50 chars): ");
                    String com = scan.nextLine().trim();
                    System.out.print("Edad (0–149): ");
                    int ed = Integer.parseInt(scan.nextLine().trim());

                    Cliente cliente = new Cliente(
                        nombreC, fnC, rutC,
                        n1, a1, tel,
                        afp, salud,
                        dir, com, ed
                    );
                    cont.almacenarCliente(cliente);
                    break;

                case 2:
                    System.out.println("\n--- Datos Profesional ---");
                    System.out.print("Nombre (10–50 chars): ");
                    String nombreP = scan.nextLine().trim();
                    System.out.print("Fecha de nacimiento (dd/MM/yyyy): ");
                    LocalDate fnP = leerFecha(scan);
                    System.out.print("RUN: ");
                    String rutP = scan.nextLine().trim();
                    System.out.print("Título (10–50 chars): ");
                    String titulo = scan.nextLine().trim();
                    System.out.print("Fecha de ingreso (dd/MM/yyyy): ");
                    LocalDate fi = leerFecha(scan);

                    Profesional prof = new Profesional(
                        nombreP, fnP, rutP,
                        titulo, fi
                    );
                    cont.almacenarProfesional(prof);
                    break;

                case 3:
                    System.out.println("\n--- Datos Administrador ---");
                    System.out.print("Nombre (10–50 chars): ");
                    String nombreA = scan.nextLine().trim();
                    System.out.print("Fecha de nacimiento (dd/MM/yyyy): ");
                    LocalDate fnA = leerFecha(scan);
                    System.out.print("RUN: ");
                    String rutA = scan.nextLine().trim();
                    System.out.print("Área (5–20 chars): ");
                    String area = scan.nextLine().trim();
                    System.out.print("Experiencia previa (≤100 chars): ");
                    String exp = scan.nextLine().trim();

                    Administrador admin = new Administrador(
                        nombreA, fnA, rutA,
                        area, exp
                    );
                    cont.almacenarAdministrador(admin);
                    break;

                case 4:
                    System.out.println("\n--- Datos Capacitación ---");
                    System.out.print("ID Capacitación: ");
                    int idCap = Integer.parseInt(scan.nextLine().trim());
                    System.out.print("RUN Cliente: ");
                    String rutCl = scan.nextLine().trim();
                    System.out.print("Día de la semana (lunes…domingo): ");
                    String dia = scan.nextLine().trim();
                    System.out.print("Hora (HH:mm): ");
                    LocalTime lt = leerHora(scan);
                    LocalDateTime fechaHora = 
                        LocalDateTime.of(LocalDate.now(), lt);
                    System.out.print("Lugar (10–50 chars): ");
                    String lugar = scan.nextLine().trim();
                    System.out.print("Duración (minutos): ");
                    String dur = scan.nextLine().trim();
                    System.out.print("Cantidad asistentes (<1000): ");
                    int cant = Integer.parseInt(scan.nextLine().trim());

                    Capacitacion cap = new Capacitacion(
                        idCap, rutCl, dia, fechaHora, lugar, dur, cant
                    );
                    cont.almacenarCapacitacion(cap);
                    break;

                case 5:
                    System.out.print("RUN a eliminar: ");
                    cont.eliminarUsuario(scan.nextLine().trim());
                    break;

                case 6:
                    cont.listarUsuarios();
                    break;

                case 7:
                    System.out.print("Tipo (cliente|profesional|administrador): ");
                    cont.listarUsuariosPorTipo(scan.nextLine().trim());
                    break;

                case 8:
                    cont.listarCapacitaciones();
                    break;

                case 9:
                    System.out.println("👋 Saliendo del programa…");
                    break;

                default:
                    System.out.println("❌ Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 9);

        scan.close();
    }

    private static LocalDate leerFecha(Scanner scan) {
        while (true) {
            try {
                return LocalDate.parse(scan.nextLine().trim(), F_FECHA);
            } catch (DateTimeParseException e) {
                System.out.print("Formato inválido. Use dd/MM/yyyy: ");
            }
        }
    }

    private static LocalTime leerHora(Scanner scan) {
        while (true) {
            try {
                return LocalTime.parse(scan.nextLine().trim(), F_HORA);
            } catch (DateTimeParseException e) {
                System.out.print("Formato inválido. Use HH:mm: ");
            }
        }
    }
}