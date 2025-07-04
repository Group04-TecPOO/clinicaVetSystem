package ArrayClases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import clases.Mascota;
import connection.ConexionMysql;

public class ArrayMascota {
    public void insertarMascota(Mascota m) {
        try {
            Connection cnx = ConexionMysql.getConexion();
            CallableStatement csta = cnx.prepareCall("{call ma_Insertar(?,?,?,?,?,?,?,?,?)}");
            csta.setString(1, m.getNomMascota());
            csta.setInt(2, m.getEdad());
            csta.setDouble(3, m.getPeso());
            csta.setString(4, m.getRaza());
            csta.setString(5, m.getEspecie());
            csta.setString(6, m.getSexo());
            csta.setBoolean(7, m.isEsterilizado());
            csta.setString(8, m.getDniCliente());
            csta.registerOutParameter(9, java.sql.Types.INTEGER); 
        } catch (Exception e) {
            System.out.println("ERROR al insertar mascota: " + e);
        }
    }

    public ArrayList<Mascota> listarMascotas() {
        ArrayList<Mascota> lista = new ArrayList<Mascota>();
        try {
            CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call ma_Listar()}");
            ResultSet rs = csta.executeQuery();
            Mascota m;
            while (rs.next()) {
                m = new Mascota(
                    rs.getInt(1),           // IdMascota
                    rs.getString(2),        // NomMascota
                    rs.getInt(3),           // Edad
                    rs.getDouble(4),        // Peso
                    rs.getString(5),        // Raza
                    rs.getString(6),        // Especie
                    rs.getString(7),        // Sexo
                    rs.getBoolean(8),       // Esterilizacion
                    rs.getString(9)         // DniCliente
                );
                lista.add(m);
            }
        } catch (Exception e) {
            System.out.println("ERROR al listar mascotas: " + e);
        }
        return lista;
    }

  
    public ArrayList<Mascota> consultarID(String dni) {
        ArrayList<Mascota> lista = new ArrayList<>();
        try {
            CallableStatement csta = ConexionMysql.getConexion().prepareCall("{call ma_ConsultarID(?)}");
            csta.setString(1, dni);
            ResultSet rs = csta.executeQuery();
            while (rs.next()) {
                Mascota m = new Mascota(
                    rs.getInt("IdMascota"),
                    rs.getString("NomMascota"),
                    rs.getInt("Edad"),
                    rs.getDouble("Peso"),
                    rs.getString("Raza"),
                    rs.getString("Especie"),
                    rs.getString("Sexo"),
                    rs.getBoolean("Esterilizacion"),
                    rs.getString("DniCliente")
                );
                lista.add(m);
            }
        } catch (Exception e) {
            System.out.println("ERROR al consultar por ID: " + e);
        }
        return lista;
    }

    
}



