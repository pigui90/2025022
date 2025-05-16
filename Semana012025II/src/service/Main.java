package service;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String menu = "Menu del profesor \n1. Operaciones" + "\n2. Salir";
		boolean flag = true;
		int opcion;
		do {
			System.out.println(menu);
			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				int numero1;
				int numero2;

				System.out.println("Digite el valor para el numero 1");
				numero1 = scan.nextInt();
				System.out.println("Digite el valor para el numero 2");
				numero2 = scan.nextInt();
				int resultado = operacion(numero1, numero2);
				System.out.println("El resultado final es " + resultado);
				break;
			case 2:
				flag = false;
				break;

			default:
				System.out.println("Digito una opcion incorrecta");
				break;
			}
		} while (flag);

		scan.close();
	}

	public static int operacion(int numero1, int numero2) {
		return (numero1 * 5) + (numero2 + 10);

	}

}
