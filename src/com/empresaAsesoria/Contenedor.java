package com.empresaAsesoria;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Contenedor
 *
 * Clase orquestadora de operaciones sobre usuarios y capacitaciones.
 * Invoca las colecciones estáticas de Usuario y Capacitacion,
 * e incluye validaciones para manejar listas vacías sin lanzar excepciones.
 */
public class Contenedor {

    /**
     * Elimina un usuario según su RUN.
     * Si no hay usuarios registrados, informa y retorna sin error.
     *
     * @param rut RUN del usuario a eliminar
     */
    public static void eliminarUsuario(String rut) {
        // Si la lista global de usuarios está vacía, no hay nada que eliminar
        if (Usuario.getUsuarios().isEmpty()) {
            System.out.println("❌ No hay Usuarios Registrados para Eliminar.");
            return;
        }

        // Intentamos eliminar cualquier usuario cuyo RUN coincida
        boolean removed = Usuario.getUsuarios()
            .removeIf(u -> u.getRut().equals(rut));

        // Mensaje de éxito o de fallo según corresponda
        if (removed) {
            System.out.println("🗑️ Usuario Eliminado (RUT: " + rut + ")");
        } else {
            System.out.println("❌ Usuario no Encontrado (RUT: " + rut + ")");
        }
    }

    /**
     * Lista todos los usuarios registrados.
     * Si la colección está vacía, informa al usuario.
     */
    public static void listarUsuarios() {
        System.out.println("\n--- Lista de Usuarios Registrados ---");

        // Validación de lista vacía
        if (Usuario.getUsuarios().isEmpty()) {
            System.out.println("No hay Usuarios Registrados.");
            return;
        }

        // Imprime cada usuario llamando a su toString()
        for (Usuario u : Usuario.getUsuarios()) {
            System.out.println(u);
        }
    }

    /**
     * Lista usuarios filtrados por tipo (cliente, profesional, administrador).
     * • Si no hay usuarios, informa y retorna.
     * • Si no hay coincidencias, avisa al usuario.
     *
     * @param tipo Cadena con uno de los valores: "Cliente", "Profesional", "Administrador"
     */
    public static void listarUsuariosPorTipo(int tipo) {
        System.out.println("\n--- Usuarios de Tipo: " + tipo + " ---");

        // Validación de lista vacía
        if (Usuario.getUsuarios().isEmpty()) {
            System.out.println("No hay Usuarios Registrados");
            return;
        }

        // Filtramos según el tipo solicitado
        List<Usuario> filtrados = Usuario.getUsuarios().stream()
            .filter(u -> {
            	 switch (tipo) { 
                    case 1: return u instanceof Cliente;
                    case 2: return u instanceof Profesional;
                    case 3: return u instanceof Administrador;
                    default: return false;
                }
            })
            .collect(Collectors.toList());

        // Si no se encontraron usuarios de ese tipo, lo indicamos
        if (filtrados.isEmpty()) {
            System.out.println("No hay usuarios del Tipo '" + tipo + "'.");
            return;
        }

        // Mostramos los usuarios filtrados
        for (Usuario u : filtrados) {
            System.out.println(u);
        }
    }

    /**
     * Lista todas las capacitaciones registradas.
     * Para cada capacitación:
     * 1) Imprime su toString()
     * 2) Busca al Cliente asociado por RUN y, si existe, muestra su nombre completo
     *
     * Si no hay capacitaciones, informa al usuario.
     */
    public static void listarCapacitaciones() {
        System.out.println("\n--- Capacitaciones Registradas ---");

        // Validación de lista vacía de capacitaciones
        if (Capacitacion.getCapacitaciones().isEmpty()) {
            System.out.println("No hay Capacitaciones Registradas.");
            return;
        }

        // Recorremos cada capacitación y presentamos la info
        for (Capacitacion c : Capacitacion.getCapacitaciones()) {
            // imprime la descripción básica de la capacitación
            System.out.println(c);

            // busca el cliente en la lista global Usuario.getUsuarios()
            Usuario.getUsuarios().stream()
                .filter(u -> u instanceof Cliente)
                .map(u -> (Cliente) u)
                .filter(cli -> cli.getRut().equals(c.getRutCliente()))
                .findFirst()
                .ifPresent(cli ->
                    // muestra el nombre completo del cliente si se encuentra
                    System.out.println("   → Cliente: " + cli.obtenerNombre())
                );
        }
    }
}