package service;

import javax.swing.JOptionPane;

/**
 * CLase con el ejercicio 3 de la semana 2
 */
public class Ejercicio3 {
	/**
	 * Metodo main con la logica del ejercicio 3 con divisiones y varios catch en un mismo try
	 * 
	 * @param args Por defecto que usa Java para poder ejecutar el metodo main
	 */
	public static void main(String[] args) {
		int numeroDivisor;
		int numeroDividendo;
		boolean correcto = false;
		int resultado;
		do {
			try {
				numeroDivisor = Integer.parseInt(JOptionPane.showInputDialog("indique el divisor de la division"));
				numeroDividendo = Integer.parseInt(JOptionPane.showInputDialog("indique el dividendo de la division"));

				resultado = numeroDivisor / numeroDividendo;
				correcto = true;
				JOptionPane.showMessageDialog(null, "El resultado es : " + resultado);
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Error al digitar el numero", ">(", JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}catch(ArithmeticException ae) {
				JOptionPane.showMessageDialog(null, "Por dividir entre 0, eso no se puede", ">(", JOptionPane.ERROR_MESSAGE);
				correcto = false;
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Di yo no se, pero fallo", ">(", JOptionPane.ERROR_MESSAGE);
			}
		} while (!correcto);
	}

}
