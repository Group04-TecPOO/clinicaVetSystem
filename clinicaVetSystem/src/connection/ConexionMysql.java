package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMysql {
	
	public static Connection getConexion() {
		Connection cnx= null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.print("Driver Correcto");
			cnx= DriverManager.getConnection("jdbc:mysql://localhost:3306/VeterinariaFinal", "root", "mysql");
			System.out.println("\nConexión establecida");
		} catch (Exception e) {
			System.out.println("Error: "+ e);
		}
		return cnx;
	}
	
	public static void main(String[] args) {
		getConexion();
	}

}
