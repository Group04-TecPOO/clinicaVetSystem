package ArrayClases;

import java.lang.reflect.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import clases.Cliente;
import connection.ConexionMysql;

public class ArrayCliente {
	public ArrayList<Cliente> listarCliente(){
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		try {
			CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call cl_Listar()}");
			ResultSet rs = csta.executeQuery();
			Cliente cl;
			while (rs.next()) {
				cl = new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				lista.add(cl);
			}
		} catch (Exception e) {}
		return lista;
	}
	
	public ArrayList<Cliente> consultarDNI(String dni){
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		try {
			CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call cl_ConsultarDNI(?)}");
			csta.setString(1, dni);
			ResultSet rs = csta.executeQuery();
			Cliente cl;
			while (rs.next()) {
				cl = new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				lista.add(cl);
			}
		} catch (Exception e) {}
		return lista;
	}
	
	public ArrayList<Cliente> consultarCliente(String nom){
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		try {
			java.sql.Statement sta = ConexionMysql.getConexion().createStatement();
			ResultSet rs = sta.executeQuery("Select * from Cliente where NomCompletoCliente like '%" + nom + "%'");
			Cliente cl;
			while (rs.next()) {
				cl = new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
				lista.add(cl);
			}
		} catch (Exception e) {}
		return lista;
	}
	
	public void Insertar(Cliente cl) {
		try {
			Connection cnx = ConexionMysql.getConexion();
			CallableStatement csta = cnx.prepareCall("{call cl_Insertar(?,?,?,?)}");
			csta.setString(1, cl.getDniCliente());
			csta.setString(2, cl.getNombreCompleto());
			csta.setString(3, cl.getDireccion());
			csta.setString(4, cl.getTelefono());
			csta.executeUpdate();
		} catch (Exception e) {
			System.out.println("ERROR" + e);
		}
	}
	
	public void Modificar(Cliente cl) {
		try {
	        Connection cnx = ConexionMysql.getConexion();
	        CallableStatement csta = cnx.prepareCall("{call cl_Modificar(?,?,?,?)}");
	        csta.setString(1, cl.getDniCliente());        
	        csta.setString(2, cl.getNombreCompleto());    
	        csta.setString(3, cl.getDireccion());
	        csta.setString(4, cl.getTelefono());
	        csta.executeUpdate();
	    } catch (Exception e) {
	        System.out.println("ERROR: " + e);
	    }
	}
	
	public void Eliminar(String dni) {
		try {
			Connection cnx = ConexionMysql.getConexion();
			CallableStatement csta = cnx.prepareCall("{call cl_Eliminar(?)}");
			csta.setString(1, dni);
			csta.executeUpdate();
		} catch (Exception e) {
			System.out.println("ERROR" + e);
		}
	}
}
