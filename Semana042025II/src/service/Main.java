package service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		try {
			SimpleDateFormat convertidor = new SimpleDateFormat("dd/MM/yyyy");

			String fechaStr = JOptionPane.showInputDialog("Ingrese la fecha con el formato dd/MM/yyyy");

			Date fecha = convertidor.parse(fechaStr);
			
			JOptionPane.showMessageDialog(null, fecha);
			
			Date hoy = new Date();
			
			String hoyStr = convertidor.format(hoy);
			
			JOptionPane.showMessageDialog(null, hoyStr);

			LocalDate localDate = hoy.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
			
			JOptionPane.showMessageDialog(null, localDate);
			
			localDate = localDate.plusDays(5);
			
			JOptionPane.showMessageDialog(null, localDate);

			Date fechaPosterior = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
			
			JOptionPane.showMessageDialog(null, fechaPosterior);
			JOptionPane.showMessageDialog(null, convertidor.format(fechaPosterior));
			
			BigDecimal salario = new BigDecimal(1225225.12);
			BigDecimal deduccion = new BigDecimal("10000");
			
			BigDecimal total = salario.subtract(deduccion, MathContext.DECIMAL32);
			JOptionPane.showMessageDialog(null, total);
			
			String menu = "**************************\n"
					+ "Menu del profesor \n"
					+ "1. Ejercicio 1\n"
					+ "2. Ejercicio 2\n"
					+ "3. Ejercicio 3\n"
					+ "4. Ejercicio 4\n"
					+ "Digite una opcion: ";
			int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opcion) {
			case 1:
				
				break;

			case 2:
				break;
			default:
				break;
			}

		} catch (ParseException pe) {
			JOptionPane.showMessageDialog(null, "Error al convertir el String a Date", "Error de parseo",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
