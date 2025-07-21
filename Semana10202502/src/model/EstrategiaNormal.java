package model;

import javax.swing.JOptionPane;

public class EstrategiaNormal implements Estrategia {

	@Override
	public void calcularImpuestos() {
		JOptionPane.showMessageDialog(null, "El impuesto se va a calcular con un 20%");

	}

	@Override
	public boolean tieneDescuento() {
		return true;
	}
	
	@Override
	public int costoPlanos(int cantidad) {
		return cantidad * 1000;
	}

}
