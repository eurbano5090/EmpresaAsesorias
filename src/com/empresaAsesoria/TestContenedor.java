package com.empresaAsesoria;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestContenedor {
	
	 private final ByteArrayOutputStream salidaConsola = new ByteArrayOutputStream();

	@BeforeEach
	void setUp() throws Exception {
		Usuario.getUsuarios().clear(); 
        System.setOut(new PrintStream(salidaConsola));
	}
   
	  @Test
	    void testListarUsuariosPorTipoAdministrador() {
	        Usuario.getUsuarios().add(new Profesional("Pedro", LocalDate.of(1990, 1, 1), "12345678-9", "TI",  LocalDate.of(2020,11,11)));    
	        Usuario.getUsuarios().add(new Administrador("Ana", LocalDate.of(1990, 1, 1), "12345678-9", "TI", "10 años"));

	        Contenedor.listarUsuariosPorTipo(3); // Administrador

	        String salida = salidaConsola.toString();

	        assertTrue(salida.contains("Usuarios de Tipo: 3"));
	        assertTrue(salida.contains("Ana"));
	        assertFalse(salida.contains("Pedro"));
	    }
	
	@Test
    void testListarUsuariosPorTipoListaVacia() {
        Contenedor.listarUsuariosPorTipo(2);
        String salida = salidaConsola.toString();
        assertTrue(salida.contains("No hay Usuarios Registrados"));
    }
	}


