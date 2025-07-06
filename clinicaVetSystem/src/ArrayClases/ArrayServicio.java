package ArrayClases;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import clases.Servicio;
import connection.ConexionMysql;

public class ArrayServicio {
		
	public ArrayList<Servicio> listarServicios(){
		ArrayList<Servicio> listarS= new ArrayList<Servicio>();
		try {
			CallableStatement csta= ConexionMysql.getConexion().prepareCall("{call ser_Listar()}");
			ResultSet rs= csta.executeQuery();
			Servicio ser;
				while(rs.next()) {
					ser= new Servicio(rs.getString(0), rs.getString(1), rs.getDouble(2));
					listarS.add(ser);
				}
		} catch (Exception e) {}
		return listarS;
	}
	
}
