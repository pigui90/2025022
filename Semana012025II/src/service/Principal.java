package service;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Digite su nombre completo");
		
		JOptionPane.showMessageDialog(null, "Su nombre digitado es: " + nombre);
//		String edadStr = JOptionPane.showInputDialog("Digite su edad");
//		int edad = Integer.parseInt(edadStr);
		// es lo mismo que las lineas 12 y 13
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
		
		JOptionPane.showMessageDialog(null, edad);
		
		
		
		
	}

}
