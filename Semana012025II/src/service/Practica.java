package service;

import javax.swing.JOptionPane;

public class Practica {
	public static void main(String[] args) {
		String menu = "Menu del profesor \n1. Ejercicio 1" + "\n2. Ejercicio 2" + "\n3. Ejercicio 3"
				+ "\n4. Ejercicio 4" + "\n5. Salir";
		boolean flag = true;
		double numero = 0.0;
		double numero2 = 0.0;
		double acumulado = 0;
		String palabra = "";

		int opcion;
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:

				do {
					do {
						numero = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));
					} while (numero < 0);

					String resultado = "";
					if (numero != 0) {
						for (int i = 1; i <= numero; i++) {
							resultado = resultado + (i + "/" + numero + " = " + (i / numero) + "\n");
						}

						JOptionPane.showMessageDialog(null, resultado);
					} else {
						JOptionPane.showMessageDialog(null, "Termino el programa");
					}
				} while (numero > 0);
				break;
			case 2:

				do {
					palabra = JOptionPane
							.showInputDialog("Digite una palabra para separar, si digita fin termina la opcion");
					String deletreada = "";
					if (!palabra.equalsIgnoreCase("fin")) {
						for (int i = 0; i < palabra.length(); i++) {
							deletreada = deletreada + palabra.charAt(i) + " ";
						}
						JOptionPane.showMessageDialog(null, deletreada);
					}
				} while (!palabra.equalsIgnoreCase("fin"));
				break;
			case 3:
				numero = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));
				numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite otro numero"));

				acumulado = acumulado + (numero + numero2);
				JOptionPane.showMessageDialog(null, numero + " + " + numero2 + " = " + (numero + numero2));
				acumulado = acumulado + (numero - numero2);
				JOptionPane.showMessageDialog(null, numero + " - " + numero2 + " = " + (numero - numero2));
				acumulado = acumulado + (numero * numero2);
				JOptionPane.showMessageDialog(null, numero + " * " + numero2 + " = " + (numero * numero2));
				acumulado = acumulado + (numero / numero2);
				JOptionPane.showMessageDialog(null, numero + " / " + numero2 + " = " + (numero / numero2));
				JOptionPane.showMessageDialog(null, "El acumulado es " + acumulado);

				break;

			case 4:
				String nombre = "";
				boolean continuar = true;
				do {
					nombre = JOptionPane.showInputDialog("Digite su nombre completo");

					JOptionPane.showMessageDialog(null, "Bienvenido, gracias por participar: " + nombre);
					continuar = Boolean.parseBoolean(JOptionPane.showInputDialog("Desea continuar True = SI False = no"));
				} while (continuar);
				break;
			case 5:

				flag = false;
				break;

			default:
				System.out.println("Digito una opcion incorrecta");
				break;
			}
		} while (flag);
	}
}
