package ArrayClases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import clases.Empleado;
import clases.Usuario;
import connection.ConexionMysql;

public class ArrayLogin {
	
	static public Usuario VerificarCredenciales(String usuario, String contraseña){
		Usuario uLogeado = null;
	
		try {
	        CallableStatement csta = ConexionMysql.getConexion()
	            .prepareCall("{call VerificarLogin(?, ?)}");

	        csta.setString(1, usuario);
	        csta.setString(2, contraseña);

	        ResultSet rs = csta.executeQuery();

	        if (rs.next()) {
	            String tipo = rs.getString("Tipo");

	            uLogeado = new Usuario(usuario, contraseña, tipo);
	        }

	        rs.close();
	        csta.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    
		return uLogeado;
	}
}
