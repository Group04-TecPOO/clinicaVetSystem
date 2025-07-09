package ArrayClases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import clases.Citas;
import clases.Cliente;
import connection.ConexionMysql;

public class ArrayCitas {

	    public ArrayList<Citas> listarCitas() {
	        ArrayList<Citas> lista = new ArrayList<>();
	        try {
	            CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call cita_Listar()}");
	            ResultSet rs = csta.executeQuery();
	            while (rs.next()) {
	                Citas citas = new Citas(
	                    rs.getString(1),    // IdCita
	                    rs.getString(2), // Día
	                    rs.getString(3), // Mes
	                    rs.getString(4), // Año
	                    rs.getString(5), // Hora
	                    rs.getString(6), // DniCliente
	                    rs.getString(7),    // IdMascota
	                    rs.getString(8), // DniEmpleado
	                    rs.getString(9)  // IdServicio
	                );
	                lista.add(citas);
	            }
	        } catch (Exception e) {
	            System.out.println("ERROR listarCitas(): " + e);
	        }
	        return lista;
	    }

	    public ArrayList<Citas> consultarIDCita(String idCita) {
	        ArrayList<Citas> lista = new ArrayList<>();
	        try {
	            CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call cita_Consultar(?)}");
	            csta.setString(1, idCita);
	            ResultSet rs = csta.executeQuery();
	            while (rs.next()) {
	                Citas citas = new Citas(
	                    rs.getString(1),
	                    rs.getString(2),
	                    rs.getString(3),
	                    rs.getString(4),
	                    rs.getString(5),
	                    rs.getString(6),
	                    rs.getString(7),
	                    rs.getString(8),
	                    rs.getString(9)
	                );
	                lista.add(citas);
	            }
	        } catch (Exception e) {
	            System.out.println("ERROR consultarIDCita(): " + e);
	        }
	        return lista;
	    }
	    
	    
	    public ArrayList<Citas> consultarDniEmpleado(String dniEmpleado) {
	        ArrayList<Citas> lista = new ArrayList<>();
	        try {
	            CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call cita_ConsultarPorDniEmpleado(?)}");
	            csta.setString(1, dniEmpleado);
	            ResultSet rs = csta.executeQuery();

	            while (rs.next()) {
	                Citas c = new Citas(
	                    rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
	                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)
	                );
	                lista.add(c);
	            }
	        } catch (Exception e) {
	            System.out.println("ERROR consultarDniEmpleado(): " + e.getMessage());
	        }
	        return lista;
	    }

	    
	    public void Insertar(Citas citas) {
	        try {
	            Connection cnx = ConexionMysql.getConexion();
	            CallableStatement csta = cnx.prepareCall("{call cita_Insertar(?,?,?,?,?,?,?,?,?)}");
	            csta.setString(1, citas.getIdCita());
	            csta.setString(2, citas.getDia());
	            csta.setString(3, citas.getMes());
	            csta.setString(4, citas.getAño());
	            csta.setString(5, citas.getHora());
	            csta.setString(6, citas.getDniCliente());
	            csta.setString(7, citas.getIdMascota());
	            csta.setString(8, citas.getDniEmpleado());
	            csta.setString(9, citas.getIdServicio());
	            csta.executeUpdate();
	        } catch (Exception e) {
	            System.out.println("ERROR Insertar(): " + e);
	        }
	    }

	    public void Modificar(Citas citas) {
	        try {
	            Connection cnx = ConexionMysql.getConexion();
	            CallableStatement csta = cnx.prepareCall("{call cita_Modificar(?,?,?,?,?,?,?,?,?)}");
	            csta.setString(1, citas.getIdCita());
	            csta.setString(2, citas.getDia());
	            csta.setString(3, citas.getMes());
	            csta.setString(4, citas.getAño());
	            csta.setString(5, citas.getHora());
	            csta.setString(6, citas.getDniCliente());
	            csta.setString(7, citas.getIdMascota());
	            csta.setString(8, citas.getDniEmpleado());
	            csta.setString(9, citas.getIdServicio());
	            csta.executeUpdate();
	        } catch (Exception e) {
	            System.out.println("ERROR Modificar(): " + e);
	        }
	    }

	    public void Eliminar(String idCita) {
	        try {
	            Connection cnx = ConexionMysql.getConexion();
	            CallableStatement csta = cnx.prepareCall("{call cita_Eliminar(?)}");
	            csta.setString(1, idCita);
	            csta.executeUpdate();
	        } catch (Exception e) {
	            System.out.println("ERROR Eliminar(): " + e);
	        }
	    }

}

