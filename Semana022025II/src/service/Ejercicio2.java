package service;

import javax.swing.JOptionPane;

/**
 * Clase para el ejercicio 2 de la semana 2
 */
public class Ejercicio2 {
	/**
	 * Metodo main con la logica del ejercicio 2 que es un numero random
	 * 
	 * @param args Por defecto que usa Java para poder ejecutar el metodo main
	 */
	public static void main(String[] args) {
		// declararion de metodos para la logica del aleatorio
		int numeroAdivinar = 0;
		boolean adivino = false;
		int numeroLimite = 0;
		int numeroUsuario;
		double numeroRand;
		// Se solicita al usuario el valor limite para el aleatorio
		try {
			numeroLimite = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero limite para el aleatorio"));
			numeroRand = (Math.random()) * numeroLimite;
			numeroAdivinar = (int) numeroRand;
			System.out.println(numeroAdivinar);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), ">(", JOptionPane.ERROR_MESSAGE);
		}
		// Estructura do-while, que se va a mantener hasta que el usuario adivine el numero
		do {
			try {
				//Se solicita el numero
				numeroUsuario = Integer
						.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 y " + numeroLimite));
				// Se verifica que sean iguales
				if (numeroAdivinar == numeroUsuario) {
					adivino = true;
					JOptionPane.showMessageDialog(null, "Felicidades, le atino, vuelva pronto");
				}else {
					// Si no son iguales se le advierte al usuario
					JOptionPane.showMessageDialog(null, "No pego, intente de nuevo", "CASI CASI", JOptionPane.WARNING_MESSAGE);
				}
			} catch (NumberFormatException nfe) {
				// Si ingresa un valor incorrecto
				JOptionPane.showMessageDialog(null, "Error al digitar el numero", ">(", JOptionPane.ERROR_MESSAGE);
			}

		} while (adivino == false);

	}

}
