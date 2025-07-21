package model;

public interface Estrategia {

	public void calcularImpuestos();
	
	public boolean tieneDescuento();
	
	public int costoPlanos(int cantidad);
	
}
