package model;

public class Servidor {
	private static Servidor servidor;
	private static String ip;
	private static String conexion;
	
	private Servidor() {
		
	}
	
	public static Servidor getServidor() {
		if(Servidor.servidor == null) {
			servidor = new Servidor();
			servidor.ip = "localhost";
			servidor.conexion = "localhost:/database";
		}
		return Servidor.servidor;
	}

	public static String getIp() {
		return ip;
	}

	public static String getConexion() {
		return conexion;
	}
	
	
}
