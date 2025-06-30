package model;

public class Funcionario extends Persona {

	private String gradoAcademico;
	private String lugarTrabajo;

	public Funcionario() {
		super();
	}

	public Funcionario(String gradoAcademico, String lugarTrabajo) {
		super();
		this.gradoAcademico = gradoAcademico;
		this.lugarTrabajo = lugarTrabajo;
	}

	public Funcionario(String nombre, int edad, int identificacion, String gradoAcademico, String lugarTrabajo) {
		super(nombre, edad, identificacion);
		this.gradoAcademico = gradoAcademico;
		this.lugarTrabajo = lugarTrabajo;
	}

	public String getGradoAcademico() {
		return gradoAcademico;
	}

	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
	}

	public String getLugarTrabajo() {
		return lugarTrabajo;
	}

	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}

	@Override
	public String muestraPersona() {
//		return getGradoAcademico() + "\n" +  super.muestraPersona();
		return "No voy a enseñar informacion delicada";
//		return getGradoAcademico() + "\n" + getLugarTrabajo();
	}
	
	@Override
	public boolean equals(Object obj) {
		Funcionario fun = (Funcionario) obj;
		if( this.gradoAcademico.equals(fun.getLugarTrabajo())) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" + getGradoAcademico() + "\n" + getLugarTrabajo();
	}

}
