package com.empresaAsesoria;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;
import java.util.Scanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


class TestUsuario {
	
	@Mock
	Scanner scannerMock;
	 
	 
	@BeforeEach
	void setUp() throws Exception {
	}

	  @Test
	    public void testConstructorYGetters() {
	        Usuario u = new Usuario("Ana Pérez", LocalDate.of(2000, 1, 1), "12.345.678-9");
	        assertEquals("Ana Pérez", u.getNombre());
	        assertEquals(LocalDate.of(2000, 1, 1), u.getFechaNacimiento());
	        assertEquals("12.345.678-9", u.getRut());
	    }

	  @Test
	    public void testCalculoEdad() {
		   LocalDate nacimiento = LocalDate.of(2000, 7, 28); 
		    Usuario u = new Usuario("Carlos", nacimiento, "12.345.678-9");

		    int edad = Period.between(nacimiento, LocalDate.now()).getYears();
		    String esperado = " El Usuario tiene " + edad + " años";

		    assertEquals(esperado, u.mostrarEdad());
	    }
	  

	  @Test
	  public void testAnalizarUsuarioAdministrador() {
	      Administrador admin = new Administrador("Ana", LocalDate.of(1990, 1, 1), "12345678-9", "TI", "10 años");

	      ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	      System.setOut(new PrintStream(outContent));

	      admin.analizarUsuario();

	      String salida = outContent.toString();

	      assertTrue(salida.contains("Área: TI"));
	      assertTrue(salida.contains("Años de Experiencia: 10 años"));

	      System.setOut(System.out); 
	  }
@Test
void testAnalizarUsuarioBase() {
    Usuario usuario = new Usuario("Luis", LocalDate.of(1995, 3, 20), "11.111.111-1");

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

    usuario.analizarUsuario();

    String salida = outContent.toString();
    assertTrue(salida.contains("Nombre: Luis"));
    assertTrue(salida.contains("RUT: 11.111.111-1"));
    assertTrue(salida.contains("Fecha de nacimiento:"));

    System.setOut(System.out);
}

	  

	  
}
