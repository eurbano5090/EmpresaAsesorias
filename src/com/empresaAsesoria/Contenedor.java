package com.empresaAsesoria;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Contenedor {

    private List<AsesoriaInterface> usuarios = new ArrayList<>();
    private List<Capacitacion> capacitaciones = new ArrayList<>();
    private static final DateTimeFormatter FMT = 
        DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void almacenarCliente(Cliente c) {
        usuarios.add(c);
        System.out.println("Cliente almacenado: " + c.obtenerNombre());
    }

    public void almacenarProfesional(Profesional p) {
        usuarios.add(p);
        System.out.println("Profesional almacenado: " + p.getNombre());
    }

    public void almacenarAdministrador(Administrador a) {
        usuarios.add(a);
        System.out.println("Administrador almacenado: " + a.getNombre());
    }

    public void almacenarCapacitacion(Capacitacion c) {
        capacitaciones.add(c);
        System.out.println("Capacitación almacenada (ID " + c.getIdCapacitacion() + ")");
    }

    public boolean eliminarUsuario(String rut) {
        Iterator<AsesoriaInterface> it = usuarios.iterator();
        while (it.hasNext()) {
            Usuario u = (Usuario) it.next();
            if (u.getRut().equals(rut)) {
                it.remove();
                System.out.println("Usuario eliminado (RUN " + rut + ")");
                return true;
            }
        }
        System.out.println("Usuario no encontrado (RUN " + rut + ")");
        return false;
    }

    public void listarUsuarios() {
        System.out.println("\n--- Usuarios registrados ---");
        for (AsesoriaInterface ai : usuarios) {
            Usuario u = (Usuario) ai;
            String fn = u.getFechaNacimiento().format(FMT);
            System.out.printf("- %s | FN: %s | RUN: %s%n", u.getNombre(), fn, u.getRut());
        }
    }

    public void listarUsuariosPorTipo(String tipo) {
        System.out.println("\n--- Usuarios tipo: " + tipo + " ---");
        for (AsesoriaInterface ai : usuarios) {
            switch (tipo.toLowerCase()) {
                case "cliente":
                    if (ai instanceof Cliente)  System.out.println(ai);
                    break;
                case "profesional":
                    if (ai instanceof Profesional) System.out.println(ai);
                    break;
                case "administrador":
                    if (ai instanceof Administrador) System.out.println(ai);
                    break;
                default:
                    System.out.println("Tipo desconocido: " + tipo);
                    return;
            }
        }
    }

    public void listarCapacitaciones() {
        System.out.println("\n--- Capacitaciones registradas ---");
        for (Capacitacion c : capacitaciones) {
            // mostramos el detalle completo
            System.out.println(c);

            // ahora buscamos al Cliente por su RUN
            String rutCli = c.getRutCliente();          
            usuarios.stream()
                .filter(u -> u instanceof Cliente)
                .map(u -> (Cliente) u)
                .filter(cli -> cli.getRut().equals(rutCli))
                .findFirst()
                .ifPresent(cli ->
                    System.out.println("   Cliente: " + cli.obtenerNombre())
                );
        }
    }
        }
