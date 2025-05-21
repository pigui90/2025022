package service;

import javax.swing.JOptionPane;
/**
 * Clase con el ejercicio numero 1 de la presentacion de la semana 2
 * @author Sergio
 */
public class Ejercicio1 {
	/**
	 * Metodo main con la logica del ejercicio 1
	 * 
	 * @author Sergio 
	 * @param args Por defecto que usa Java para poder ejecutar el metodo main
	 */
	public static void main(String[] args) {
		// Variable para recibir el valor numerico
		int numero;
		// Estructura del try-catch para evitar errores de excepcion
		try {
			do {
				//Se solicita el numero al usuario
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
				//Se valida que si es menor o igual a 0
				if (numero <= 0) {
					JOptionPane.showMessageDialog(null, "El numero debe ser mayor a 0", "Problema!!!!!",
							JOptionPane.ERROR_MESSAGE);
				}
				// Lo realiza mientra que sea menor o igual a 0
			} while (numero <= 0);
			// Evalua si es par, muestra el mensaje
			if (numero % 2 == 0) {
				JOptionPane.showMessageDialog(null, "El numero es par", "ES PAAAAAR!!!!!",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				// Si es impar muestra el mensaje pero como un mensaje de advertencia
				JOptionPane.showMessageDialog(null, "El numero es impar", "ES IMPAAAAAR!!!!!",
						JOptionPane.WARNING_MESSAGE);

			}
		} catch (NumberFormatException nfe) {
			// En caso de no escribir el formato del numero correcto muestra un mensaje de error
			JOptionPane.showMessageDialog(null, "Lo digitado no corresponde a un numero entero " + nfe.getMessage(), "Error!!!!!",
					JOptionPane.ERROR_MESSAGE);
		}

	}
}
