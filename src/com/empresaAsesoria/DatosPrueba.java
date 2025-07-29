/**
 * 
 */
package com.empresaAsesoria;

/**
 * 
 */
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DatosPrueba {

    public static void cargarDatos() {
        // 🧍‍♀️ Carga de 20 trabajadores
        Cliente cliente1 = new Cliente("Ana Torres", LocalDate.of(1990, 3, 15), "12345678-9", "Ana", "Torres", "987654321", "ProVida", 1, "Av. Matta 100", "Santiago", 34);
        Cliente cliente2 = new Cliente("Carlos Ruiz", LocalDate.of(1985, 6, 22), "11223344-5", "Carlos", "Ruiz", "912345678", "Cuprum", 2, "Calle Falsa 123", "Valparaíso", 39);
        Usuario.usuarios.add(cliente1);
        Usuario.usuarios.add(cliente2);

        for (int i = 3; i <= 20; i++) {
        	 Usuario.usuarios.add(new Cliente(
                "Trabajador" + i,
                LocalDate.of(1980 + i % 10, i % 12 + 1, i % 28 + 1),
                "1000000" + i + "-" + (i % 10),
                "Nombre" + i,
                "Apellido" + i,
                "9" + (int)(Math.random() * 100000000),
                "ModeloAFP",
                (i % 2) + 1,
                "Direccion " + i,
                "Comuna " + i,
                20 + i
            ));
        }

        // 🎓 Carga de 40 capacitaciones (2 por trabajador)
        int idCap = 1;

        for (Usuario u : Usuario.getUsuarios()) {
            if (u instanceof Cliente c) {
                Capacitacion cap1 = new Capacitacion(
                    idCap++, c.getRut(), "martes",
                    LocalDateTime.of(2025, 8, 5, 9, 0),
                    "Sala A", "120", 12
                );
                Capacitacion cap2 = new Capacitacion(
                    idCap++, c.getRut(), "jueves",
                    LocalDateTime.of(2025, 8, 12, 14, 0),
                    "Sala B", "90", 10
                );
                Capacitacion.listaCapacitaciones.add(cap1);
                Capacitacion.listaCapacitaciones.add(cap2);
            }
        }

        // 🧑‍🔧 Profesionales
        Profesional profesional1 = (new Profesional("Marcela Ríos", LocalDate.of(1992, 4, 10), "99887766-5", "Prevencionista", LocalDate.of(2020, 1, 15)));
        Profesional profesional2 =(new Profesional("Luis Cáceres", LocalDate.of(1988, 12, 1), "77665544-3", "Auditor HSE", LocalDate.of(2019, 3, 10)));
        Profesional profesional3 =(new Profesional("José Morales", LocalDate.of(1985, 7, 22), "88990011-2", "Consultor Ambiental", LocalDate.of(2021, 5, 5)));
        Profesional profesional4 =(new Profesional("Camila Soto", LocalDate.of(1991, 9, 13), "66554433-6", "Inspectora HSE", LocalDate.of(2022, 8, 1)));
        Usuario.usuarios.add(profesional1);
        Usuario.usuarios.add(profesional2);
        Usuario.usuarios.add(profesional3);
        Usuario.usuarios.add(profesional4);

        
        // 🧑‍💼 Administradores
        Administrador admin1 = (new Administrador("Claudia Herrera", LocalDate.of(1978, 2, 5), "12345677-9", "Gestión General", "15 años en dirección"));
        Administrador admin2 =(new Administrador("Rodrigo Pérez", LocalDate.of(1982, 5, 20), "11224434-7", "Soporte Técnico", "Infraestructura y redes"));
        Administrador admin3 =(new Administrador("Felipe León", LocalDate.of(1980, 1, 12), "33445568-8", "Seguridad", "Auditorías internas HSE"));
        Administrador admin4 =(new Administrador("Sara Muñoz", LocalDate.of(1985, 11, 30), "77889908-1", "RRHH", "Gestión de talentos"));
        Usuario.usuarios.add(admin1);
        Usuario.usuarios.add(admin2);
        Usuario.usuarios.add(admin3);
        Usuario.usuarios.add(admin4);
        
        // ⚠️ Accidentes
        Accidente.listaAccidentes.add(new Accidente(1, "12345678-9", LocalDate.of(2025, 6, 12), LocalDateTime.of(2025, 6, 12, 10, 30), "Soldadura", "Corte menor", "Vendaje"));
        Accidente.listaAccidentes.add(new Accidente(2, "11223344-5", LocalDate.of(2025, 7, 1), LocalDateTime.of(2025, 7, 1, 11, 15), "Extracción", "Caída de herramienta", "Contusión"));
        Accidente.listaAccidentes.add(new Accidente(3, "99887766-5", LocalDate.of(2025, 7, 5), LocalDateTime.of(2025, 7, 5, 13, 50), "Carga", "Deslizamiento", "Tobillo lesionado"));
        Accidente.listaAccidentes.add(new Accidente(4, "66554433-6", LocalDate.of(2025, 7, 7), LocalDateTime.of(2025, 7, 7, 16, 10), "Eléctrica", "Contacto leve", "Evaluación médica"));

        for (int i = 1; i <= 10; i++) {
            int estado = (i % 3) + 1;  // garantiza valores válidos: 1, 2 o 3
            Revision nueva = new Revision(
                i,                     // idRevision
                (i % 4) + 1,           // idVisita asociada
                "Revisión " + i,       // nombreRevision
                "Detalle técnico " + i,// detalleRevisar
                estado                 // estado válido
            );
            Revision.listaRevisiones.add(nueva);
        }



        // 👷 Visitas en terreno
        VisitaEnTerreno.listaVisitas.add(new VisitaEnTerreno(1, "12345677-9", LocalDate.of(2025, 7, 20), LocalDateTime.of(2025, 7, 20, 9, 0), "Obra Central", "Revisión general"));
        VisitaEnTerreno.listaVisitas.add(new VisitaEnTerreno(2, "11223344-5", LocalDate.of(2025, 7, 21), LocalDateTime.of(2025, 7, 21, 10, 30), "Sector Norte", "Uso de EPP"));
        VisitaEnTerreno.listaVisitas.add(new VisitaEnTerreno(3, "33445566-8", LocalDate.of(2025, 7, 22), LocalDateTime.of(2025, 7, 22, 15, 0), "Faena Minera", "Control de acceso"));
        VisitaEnTerreno.listaVisitas.add(new VisitaEnTerreno(4, "77889900-1", LocalDate.of(2025, 7, 23), LocalDateTime.of(2025, 7, 23, 11, 45), "Instalación Sur", "Procedimientos internos"));

             
        // ✅ Log final
        System.out.println("✅ Datos de prueba cargados exitosamente: 20 trabajadores, 40 capacitaciones, 4 profesionales, 4 administradores, 4 accidentes, 10 revisiones, 4 visitas.");
     // 🔗 Asociación de revisiones con visitas correspondientes
        for (Revision r : Revision.listaRevisiones) {
            for (VisitaEnTerreno v : VisitaEnTerreno.listaVisitas) {
                if (v.getIdVisita() == r.getIdVisita()) {
                    v.agregarRevision(r);
                }
            }
        }

        for (VisitaEnTerreno visita : VisitaEnTerreno.listaVisitas) {
            System.out.println(visita);
            System.out.println("Revisiones asociadas:");
            for (Revision rev : visita.revisiones) {
                System.out.println("  - " + rev.getNombreRevision() + " [" + rev.getEstado() + "]");
            }
        }
    }
}