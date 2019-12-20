/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Medico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;




/**
 *
 * @author GeovannyAbad
 */
public class ControladorMedico {
    
    
     private Connection con;
    private List<Medico> medica;

    public void conectar() {
        con = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/citasMedicas", "root", "cuenca");
           


        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + " Error de Conexion");
        }
        if (con != null) {
            System.out.println("Conexión Exitosa");
        }
    }
    
      public void desconectar() {
        if (con != null) {
            try {
                con.close();
                System.out.println("Conexion Cerrada");
            } catch (SQLException ex) {
                System.out.println("Error Al Desconectar " + ex.getMessage());
            }
        }
    }
    
    
    
    public void crear(Medico m) {
        String sql = "INSERT INTO medico VALUES ( " + m.getMed_id()+"'" + m.getMed_numeroConsultorio()+"', '" + m.getMed_usuario()+ "' , '"
                + m.getMed_password()+ "', '" + m.getMed_persona_id()+ "' ,'"+");";
        
        System.out.println(""+sql);
        
        try {
            conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
            System.out.println(sql);
        }
    }
    
    
    public void eliminar(int med_id) {
         String sql = "DELETE FROM medico WHERE  cita_id  =" + med_id + ";";
        try {
            conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar" + ex.getMessage());
        }
    }
    
    
    
   // Metodo Buscar

	public Medico BuscarMedico(int med_id) {
		String sql = "SELECT med_id, med_numeroConsultorio,  med_usuario, med_password,  med_persona_id" + " FROM medico";
		Medico m = new Medico();

		Connection con = null;
		try {
                    conectar();
		
			PreparedStatement ps = con.prepareStatement(sql);
			// resultset es todas las filas de la tabla
			ResultSet rs = ps.executeQuery();
			// el bucle para que recorrra todas las filas hasta terminar todas
			// las filas
			while (rs.next()) {
				// devulve el nombre de la fila correspondiente

				if (rs.getString("cli_id").trim().equals(med_id)) {

					m.setMed_id(rs.getInt("med_id".trim()));
					m.setMed_numeroConsultorio(rs.getInt("med_numeroConsultorio".trim()));
					m.setMed_usuario(rs.getString(" med_usuario".trim()));
					m.setMed_password(rs.getString("med_password".trim()));
					m.setMed_persona_id(rs.getInt("med_persona_id".trim()));
					
					

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			 desconectar();
		}
		return m;
	}
     
    
    
    
    
    
    
    
    
    
    
}
