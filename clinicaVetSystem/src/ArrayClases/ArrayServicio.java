package ArrayClases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import clases.Servicio;
import connection.ConexionMysql;

public class ArrayServicio {
	public ArrayList<Servicio> listarServicio() {
        ArrayList<Servicio> lista = new ArrayList<>();
        try {
            CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call ListarServicios()}");
            ResultSet rs = csta.executeQuery();
            Servicio s;
            while (rs.next()) {
                s = new Servicio(
                        rs.getString(1), // IdServicio
                        rs.getString(2), // NombreServicio
                        rs.getDouble(3) // PrecioServicio
                );
                lista.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
	}
	
	public ArrayList<Servicio> consultarId(String idServicio) {
        ArrayList<Servicio> lista = new ArrayList<>();
        try {
            CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call ConsultarServicio(?)}");
            csta.setString(1, idServicio);
            ResultSet rs = csta.executeQuery();
            Servicio s;
            while (rs.next()) {
                s = new Servicio(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3)
                );
                lista.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
	
	public void insertar(Servicio s) {
        try {
            Connection cnx = ConexionMysql.getConexion();
            CallableStatement csta = cnx.prepareCall("{call InsertarServicio(?, ?, ?)}");
            csta.setString(1, s.getIdServicio());
            csta.setString(2, s.getNombreServicio());
            csta.setDouble(3, s.getPrecioServicio());
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR en insertar: " + e);
        }
    }
	
	
	public void modificar(Servicio s) {
        try {
            Connection cnx = ConexionMysql.getConexion();
            CallableStatement csta = cnx.prepareCall("{call ModificarServicio(?, ?, ?)}");
            csta.setString(1, s.getIdServicio());
            csta.setString(2, s.getNombreServicio());
            csta.setDouble(3, s.getPrecioServicio());
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR en modificar: " + e);
        }
    }
	
	public void eliminar(String idServicio) {
        try {
            Connection cnx = ConexionMysql.getConexion();
            CallableStatement csta = cnx.prepareCall("{call EliminarServicio(?)}");
            csta.setString(1, idServicio);
            csta.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR en eliminar: " + e);
        }
    }
	
	
}
