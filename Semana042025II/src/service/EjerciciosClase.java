package service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * Clase con la logica de los ejercicios de semana 4
 */
public class EjerciciosClase {

	/**
	 * MEtodo main para ejecutar el programa
	 * 
	 * @param args parametro por defecto
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu = "**************************\n" + "Menu del profesor \n" + "1. Ejercicio 1\n" + "2. Ejercicio 2\n"
				+ "3. Ejercicio 3\n" + "Digite una opcion: ";
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

		switch (opcion) {
		case 1:
			try {
				// Se piden los numeros al usuario
				int numeroA = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
				int numeroB = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
				// Variables para acumular el valor de los divisores
				int sumaDivA = 0;
				int sumaDivB = 0;
				// ciclo para encontrar divisores y sumarlos
				for (int i = 1; i < numeroA; i++) {
					// condicion para saber si es divisor del numero
					if (numeroA % i == 0) {
						// se acumula el divisor
						sumaDivA = sumaDivA + i;
					}
				}
				// ciclo para encontrar divisores y sumarlos
				for (int i = 1; i < numeroB; i++) {
					// condicion para saber si es divisor del numero
					if (numeroB % i == 0) {
						// se acumula el divisor
						sumaDivB = sumaDivB + i;
					}
				}
				// se comparan si los resultados son iguales al numero correspondiente
				if (sumaDivA == numeroB && sumaDivB == numeroA) {
					JOptionPane.showMessageDialog(null, "SON AMIGOS");
				} else {
					JOptionPane.showMessageDialog(null, "NO SON AMIGOS");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
			break;

		case 2:
			try {
				String dia = JOptionPane.showInputDialog("Digite un dia, en numeros");
				String mes = JOptionPane.showInputDialog("Digite un mes, en numeros");
				String anio = JOptionPane.showInputDialog("Digite un año, en numeros");

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				String fechaStr = dia + "/" + mes + "/" + anio;

				Date fechaUsuario = sdf.parse(fechaStr);
				Date fechaHoy = new Date();
				
				if(fechaUsuario.before(fechaHoy)) {
					JOptionPane.showMessageDialog(null, "La fecha ingresada esta antes de hoy");
				}else {
					if(fechaUsuario.after(fechaHoy)) {
						JOptionPane.showMessageDialog(null, "La fecha ingresada esta despues de hoy");
					}else {
						JOptionPane.showMessageDialog(null, "La fecha ingresada es igual a hoy");
					}
				}
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(null, "Error al convertir el String a Date", "Error de parseo",
						JOptionPane.ERROR_MESSAGE);
			}
			break;
		case 3:
			break;

		default:
			JOptionPane.showMessageDialog(null, "Valor ingresado no valido, intente de nuevo");
			break;
		}
	}

}
