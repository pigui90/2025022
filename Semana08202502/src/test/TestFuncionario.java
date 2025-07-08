package test;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Funcionario;

class TestFuncionario {
	
	static Funcionario funcionario;
	int edad;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		funcionario = new Funcionario();
		funcionario.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del funcionario")));
		funcionario.setCedula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del funcionario")));
		funcionario.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del funcionario"));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		JOptionPane.showMessageDialog(null, "FINALIZARON LOS TEST");
	}

	@BeforeEach
	void setUp() throws Exception {
		edad = 0;
	}

	@AfterEach
	void tearDown() throws Exception {
		JOptionPane.showMessageDialog(null, "FINALIZO UN TEST");
	}

	@Test
	void testEsMayor() {
		try {
			edad = Integer.parseInt(JOptionPane.showInputDialog("Digite una edad para comparar con la edad del funcionario"));
			assertTrue(funcionario.esMayor(edad), "No es mayor");
		}catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	void testEsMenor() {
		try {
			assertTrue(funcionario.esMenor(), "No es menor");
		}catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
