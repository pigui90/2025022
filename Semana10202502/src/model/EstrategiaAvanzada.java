package model;

import javax.swing.JOptionPane;

public class EstrategiaAvanzada implements Estrategia {

	@Override
	public void calcularImpuestos() {
		JOptionPane.showMessageDialog(null, "El impuesto se va a calcular con un 10%\nEl impuesto se va a descuento por hijos 2%\nEl impuesto se va a descuento por matrimonio 1%");



		
	}

	@Override
	public boolean tieneDescuento() {
		return true;
	}
	
	
	@Override
	public int costoPlanos(int cantidad) {
		return cantidad * 500;
	}
}
