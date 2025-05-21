package service;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {

		int sizeVector;
		int cantidadCalificaciones;
		int calificacion;
		sizeVector = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de estudiantes"));
		int vectorCalificaciones[] = new int[sizeVector];

		try {

			cantidadCalificaciones = Integer
					.parseInt(JOptionPane.showInputDialog("Indique la cantidad de calificaciones a ingresar"));

			for (int i = 0; i < cantidadCalificaciones; i++) {
				calificacion = Integer.parseInt(JOptionPane.showInputDialog("Indique una calificacion"));
				vectorCalificaciones[i] = calificacion;
			}
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			JOptionPane.showMessageDialog(null, "Error cantidad excede la cantidad de estudiantes",
					"Muchas calificaciones", JOptionPane.ERROR_MESSAGE);
		}catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Error en el formato del numero " + nfe.getMessage(), "Error :(" , JOptionPane.ERROR_MESSAGE);
		}

		for (int i = 0; i < vectorCalificaciones.length; i++) {
			if(vectorCalificaciones[i] != 0) {
				JOptionPane.showMessageDialog(null, "Valor de la posicion " + i + ": "+ vectorCalificaciones[i]);
			}
		}

	}

}
