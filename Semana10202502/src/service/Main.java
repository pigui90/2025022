package service;

import javax.swing.JOptionPane;

import model.Contexto;
import model.EstrategiaAvanzada;
import model.EstrategiaNormal;
import model.Servidor;

public class Main {

	public static void main(String[] args) {

//		Servidor servidor = Servidor.getServidor();
//		JOptionPane.showMessageDialog(null, servidor.getIp() + " --- " + servidor.getConexion());
//		
//		Servidor servidorSecundario = Servidor.getServidor();
//		JOptionPane.showMessageDialog(null, servidorSecundario.getIp() + " --- " + servidorSecundario.getConexion());
		
		EstrategiaNormal estrategiaNormal = new EstrategiaNormal();
		Contexto contexto1 = new Contexto(estrategiaNormal); 
		
		contexto1.calcularImpuestos();
		
		
		Contexto contexto2 = new Contexto(new EstrategiaAvanzada());
		contexto2.calcularImpuestos();
		
		Contexto contexto3 = new Contexto(new EstrategiaAvanzada());

		contexto3.calcularImpuestos();
		
		contexto3 = new Contexto(estrategiaNormal);
		
		contexto3.calcularImpuestos();
		JOptionPane.showMessageDialog(null, contexto3.calcularCostosPlanosPorCantidad());

	}

}
