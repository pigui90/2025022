package model;

import javax.swing.JOptionPane;

public class Funcionario {
	
	private String nombre;
	private int edad;
	private int cedula;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public Funcionario(String nombre, int edad, int cedula) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
	}

	public Funcionario() {
		super();
	}

	public Boolean esMayor(int pEdad) {
		JOptionPane.showMessageDialog(null, this.getEdad() + " - " + pEdad);
		JOptionPane.showMessageDialog(null, (this.edad > pEdad));

		return this.getEdad() > pEdad;
	}
	
	public Boolean esMenor() {
		int edadUsuario = Integer.parseInt(JOptionPane.showInputDialog("Digite una edad"));
		return this.getEdad() < edadUsuario;
	}
}
