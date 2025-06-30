package model;

public class Persona {
	private String nombre;
	private int edad;
	private int identificacion;

	public Persona() {
		super();
	}

	public Persona(String nombre, int edad, int identificacion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	
	public String muestraPersona() {
		return this.getNombre() + " -\n " + this.getIdentificacion();
	}
	
	@Override
	public boolean equals(Object arg0) {
		Persona per = (Persona)arg0;
		return this.edad == per.getEdad() && this.nombre.equals(per.getNombre());
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + " -\n " + this.getIdentificacion() + "-\n" + getEdad();
	}
	
}
