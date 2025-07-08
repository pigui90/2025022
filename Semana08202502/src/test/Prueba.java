package test;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Prueba {
	
	static int contador = 0;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		JOptionPane.showMessageDialog(null, "METODO DEL BEFORE ALL");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		JOptionPane.showMessageDialog(null, "METODO DEL AFTER ALL");

	}

	@BeforeEach
	void setUp() throws Exception {
		contador++;
		JOptionPane.showMessageDialog(null, "METODO DEL BEFORE EACH");

	}

	@AfterEach
	void tearDown() throws Exception {
		JOptionPane.showMessageDialog(null, "METODO DEL AFTER EACH " + contador);

	}

	@Test
	void test() {
		JOptionPane.showMessageDialog(null, "METODO TEST");
		int valor = 0;
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor"));
		if(valor > 100) {
			fail("EL test fallo porque el valor es mayor que 100");
		}
	}
	
	@Test
	void test2() {
		String respuesta = "";
		respuesta = JOptionPane.showInputDialog("Ingrese una respuesta");
		JOptionPane.showMessageDialog(null, "Lo que ingreso fue: " + respuesta);
	}

}
