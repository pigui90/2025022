package service;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		try {
			int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
			int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
			int aux;
			// intercambiar valores
			if (numero2 < numero1) {
				aux = numero1;
				numero1 = numero2;
				numero2 = aux;
			}
			String cadena = "Los numeros impares son ";
			for (int i = numero1 + 1; i < numero2; i++) {
				if(i % 2 != 0) {
					cadena = cadena.concat(i+"").concat(" ");
//					cadena = cadena + i + " ";
				}
			}
			
			JOptionPane.showMessageDialog(null, cadena);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Formato incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo fallo y ya no se que fue", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
