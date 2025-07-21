package model;

import javax.swing.JOptionPane;

public class Contexto {
	private Estrategia estrategia;
	
	public Contexto(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public void calcularImpuestos() {
		this.estrategia.calcularImpuestos();
	}
	
	public boolean descuentosTiene() {
		return this.estrategia.tieneDescuento();
	}
	
	
	public int calcularCostosPlanosPorCantidad() {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de planos"));
		int costoTotal =  this.estrategia.costoPlanos(cantidad);
		return costoTotal;
	}
}
