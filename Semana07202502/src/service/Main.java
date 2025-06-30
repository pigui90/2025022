package service;

import javax.swing.JOptionPane;

import model.Funcionario;
import model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario funcionario = new Funcionario();
		funcionario.setEdad(25);
		funcionario.setGradoAcademico("Bachiller");
		funcionario.setIdentificacion(1231234);
		funcionario.setLugarTrabajo("Aqui");
		funcionario.setNombre("Pedrito Palotes");
		JOptionPane.showMessageDialog(null, funcionario.toString());

//		JOptionPane.showMessageDialog(null, funcionario.muestraPersona());
		
		Persona persona = new Persona("Juliana Malotes", 26, 152656552);
//		JOptionPane.showMessageDialog(null, persona.muestraPersona());
		Persona persona2 = new Persona("Juliana Malotes", 26, 152656552);

		JOptionPane.showMessageDialog(null, persona2.toString());
		
		String nombre = "Sergio";
		
		if(nombre.equals("Fabian")) {
			
		}
		
		if(persona.equals(persona2)) {
			JOptionPane.showMessageDialog(null, "Son iguales");
		}else {
			JOptionPane.showMessageDialog(null, "Son diferentes");
		}

	}

}
