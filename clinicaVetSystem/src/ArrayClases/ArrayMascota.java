package ArrayClases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import clases.Cliente;
import clases.Mascota;
import connection.ConexionMysql;

public class ArrayMascota {
	public ArrayList<Mascota> ListarMascota(){
		ArrayList<Mascota> lista = new ArrayList<Mascota>();
		try {
			CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call cl_ListarMascota()}");
			ResultSet rs = csta.executeQuery();
			Mascota mas;
			while (rs.next()) {
				mas = new Mascota(rs.getInt(1),rs.getString(2) ,rs.getInt(3),rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
				lista.add(mas);
			}
		} catch (Exception e) {}
		return lista;
	}
	
	public void InsertarMascota(Mascota mas) {
	    try {
	        Connection cnx = ConexionMysql.getConexion();
	        CallableStatement csta = cnx.prepareCall("{call cl_InsertarMascota(?,?,?,?,?,?,?)}");
	        csta.setString(1, mas.getNomMascota());
	        csta.setInt(2, mas.getEdad());
	        csta.setDouble(3, mas.getPeso());
	        csta.setString(4, mas.getRaza());
	        csta.setString(5, mas.getEspecie());
	        csta.setString(6, mas.getSexo());
	        csta.setString(7, mas.getEsterilizacion());
	        csta.executeUpdate();
	    } catch (Exception e) {
	        System.out.println("ERROR: " + e.getMessage());
	    }
	}
	public ArrayList<Mascota> consultarID(int IdMascota){
		ArrayList<Mascota> lista = new ArrayList<Mascota>();
		try {
			CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call cl_ConsultarMascota(?)}");
			csta.setInt(1, IdMascota);
			ResultSet rs = csta.executeQuery();
			Mascota mas;
			while (rs.next()) {
				mas = new Mascota(rs.getInt(1),rs.getString(2) ,rs.getInt(3),rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
				lista.add(mas);
			}
		} catch (Exception e) {}
		return lista;
	}
}


