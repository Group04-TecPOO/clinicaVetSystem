package ArrayClases;

import java.sql.CallableStatement;
import java.sql.ResultSet;

import clases.Empleado;
import clases.Usuario;
import connection.ConexionMysql;

public class ArrayLogin {
	static public Usuario VerificarLogin(String usuario, String contra) {
		Usuario usuariologeado = null;
		
		try {
			CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call VerificarLogin(?, ?)}");
			csta.setString(1, usuario);
			csta.setString(2, contra);
			ResultSet rs = csta.executeQuery();
			if(rs.next()) {
				String tipo = rs.getString("Tipo");
				Empleado emple;
				usuariologeado = new Usuario(usuario, contra, tipo, emple);
			}
			rs.close();
			csta.close();
		} catch (Exception e) {
	        e.printStackTrace();
		}
		return usuariologeado;
	}
}
