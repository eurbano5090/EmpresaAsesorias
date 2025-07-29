package com.empresaAsesoria;

import java.util.Scanner;

/**
 * Clase de entrada con un menú de consola que invoca
 * los métodos estáticos de Usuario, Capacitacion y Contenedor.
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion;
        /** 1) Cargo datos de prueba*/
        DatosPrueba.cargarDatos();
        do {
            // Menú de opciones
        	System.out.println();
	        System.out.println("=".repeat(45));
	        System.out.println("Bienvenida/o al Sistema de Asesorias BootHSE");
	        System.out.println("=".repeat(45));
	        System.out.println();
            System.out.println("1. 🆕👤 Registrar Usuario");
            System.out.println("2. 🎓📆 Registrar Capacitación");
            System.out.println("3. 🗑️👤 Eliminar Usuario");
            System.out.println("4. 📋👥 Listar Usuarios");
            System.out.println("5. 🔍📂 Listar Usuarios por Tipo");
            System.out.println("6. 📖🎓 Listar Capacitaciones");
            System.out.println("7. 🛑   Salir");
            System.out.print("👉 Seleccione una opción: ");
            opcion = Integer.parseInt(scan.nextLine().trim());

            switch (opcion) {
                case 1:
                    // Delegamos la creación de usuario a Usuario.crearUsuario()
                    Usuario.crearUsuario(scan);
                    break;
                case 2:
                    // Delegamos la creación de capacitación
                    Capacitacion.crearCapacitacion();
                    break;
                case 3:
                    System.out.print("RUT a eliminar: ");
                    String rut = scan.nextLine().trim();
                    Contenedor.eliminarUsuario(rut);
                    break;
                case 4:
                    Contenedor.listarUsuarios();
                    break;
                case 5:
                    System.out.print("Ingrese Tipo de Usuario (1: Cliente |2: Profesional |3: Administrador): ");
                    int tipo = Integer.parseInt(scan.nextLine().trim());
                    Contenedor.listarUsuariosPorTipo(tipo);
                    break;
                case 6:
                    Contenedor.listarCapacitaciones();
                    break;
                case 7:
                    System.out.println("👋 Muchas Gracias por utilzar nuestro sistema");
                    break;
                default:
                    System.out.println("❌ Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 7);

        scan.close();
    }
}