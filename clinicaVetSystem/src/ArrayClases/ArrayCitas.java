package ArrayClases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import clases.Citas;
import clases.Cliente;
import connection.ConexionMysql;

public class ArrayCitas {

	public ArrayList<Citas> listarCitas(){
		ArrayList<Citas> lista = new ArrayList<Citas>();
		try {
			CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call cita_Listar()}");
			ResultSet rs = csta.executeQuery();
			Citas citas;
			while (rs.next()) {
				citas = new Citas(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
				lista.add(citas);
			}
		} catch (Exception e) {}
		return lista;
	}
	
	public ArrayList<Citas> consultarIDCita(int IDCita){
		ArrayList<Citas> lista = new ArrayList<Citas>();
		try {
			CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call cita_Consultar(?)}");
			csta.setInt(1, IDCita);
			ResultSet rs = csta.executeQuery();
			Citas citas;
			while (rs.next()) {
				citas = new Citas(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
				lista.add(citas);
			}
		} catch (Exception e) {}
		return lista;
	}
	
	public void Insertar(Citas citas) {
		try {
			Connection cnx = ConexionMysql.getConexion();
			CallableStatement csta = cnx.prepareCall("{call cita_Insertar(?,?,?,?,?,?,?,?,?)}");
			csta.setInt(1, citas.getIdCita());
			csta.setString(2, citas.getDia());
			csta.setString(3, citas.getMes());
			csta.setString(4, citas.getAño());
			csta.setString(5, citas.getHora());
			csta.setString(6, citas.getDniCliente());
			csta.setInt(7, citas.getIdMascota());
			csta.setString(8, citas.getDniEmpleado());
			csta.setString(9, citas.getIdServicio());
			csta.executeUpdate();
		} catch (Exception e) {
			System.out.println("ERROR" + e);
		}
	}
	
	public void Modificar(Citas citas) {
		try {
			Connection cnx = ConexionMysql.getConexion();
			CallableStatement csta = cnx.prepareCall("{call cita_Modificar(?,?,?,?,?,?,?;?,?}");
			csta.setInt(1, citas.getIdCita());
			csta.setString(2, citas.getDia());
			csta.setString(3, citas.getMes());
			csta.setString(4, citas.getAño());
			csta.setString(5, citas.getHora());
			csta.setString(6, citas.getDniCliente());
			csta.setInt(7, citas.getIdMascota());
			csta.setString(8, citas.getDniEmpleado());
			csta.setString(9, citas.getIdServicio());
			csta.executeUpdate();
		} catch (Exception e) {
			System.out.println("ERROR" + e);
		}
	}
	public void Eliminar(int IdCita) {
		try {
			Connection cnx = ConexionMysql.getConexion();
			CallableStatement csta = cnx.prepareCall("{call cita_Eliminar(?)}");
			csta.setInt(1, IdCita);
			csta.executeUpdate();
		} catch (Exception e) {
			System.out.println("ERROR" + e);
		}
	}
	
}
