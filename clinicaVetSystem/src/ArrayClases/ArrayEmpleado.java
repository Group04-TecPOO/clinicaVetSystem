package ArrayClases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import clases.Citas;
import clases.Empleado;
import connection.ConexionMysql;

public class ArrayEmpleado {
	
	public ArrayList<Empleado> listaremplEmpleados(){
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		try {
			CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call bol_Listar()}");
			ResultSet rs = csta.executeQuery();
			Empleado emple;
			while (rs.next()) {
				emple = new Empleado(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5));
				lista.add(emple);
			}
		} catch (Exception e) {}
		return lista;
	}
	public void Insertar(Empleado emple) {
		try {
			Connection cnx = ConexionMysql.getConexion();
			CallableStatement csta = cnx.prepareCall("{call bol_Insertar(?,?,?,?,?)}");
			csta.setString(1, emple.getDniEmpleado());
			csta.setString(2, emple.getNombreCompleto());
			csta.setString(3, emple.getTelefono());
			csta.setString(4, emple.getDireccion());
			csta.setBoolean(5, emple.getDisponibilidad());
			csta.executeUpdate();
		} catch (Exception e) {
			System.out.println("ERROR" + e);
		}
	}
	
	
	

}
