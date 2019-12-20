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
import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author GeovannyAbad
 */
public class ControladorMedico {
    
    
    private List<Medico> medica;

    public ControladorMedico() {
        medica = new ArrayList<Medico>();
    }
    
    

   /* public void conectar() {
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
    }/*
    
    
    
    /*public boolean crear(Medico m) {
        String sql = "INSERT INTO medico VALUES ( " + m.getMedico_id()+"'" + m.getMedico_numeroConsultorio()+"', '" + m.getMedico_usuario()+ "' , '"
                + m.getMedico_password()+ "', '" + m.getMedico_persona_id()+ "' ,'"+");";
        
        System.out.println(""+sql);
        
        try {
            conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
            System.out.println(sql);
            return false;
        }
        return true;
    }*/
    
    public boolean crear(Medico m){
        
        medica.add(m);
        
        return true;
        
    }
    
    
    /*public void eliminar(int medico_id) {
         String sql = "DELETE FROM medico WHERE  cita_id  =" + medico_id + ";";
        try {
            conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar" + ex.getMessage());
        }
    }
    
    
      public void actualizar(Medico m, int medico_id) {
         
         
    String sql = "UPDATE medico  SET   med_id  = '" + m.getMedico_id()
            + "', med_numeroConsultorio = '" + m.getMedico_numeroConsultorio()
            + "', med_usuario = '" + m.getMedico_usuario()
            + "', med_password = '"+ m.getMedico_password()
            + "', med_persona_id = '" + m.getMedico_persona_id()
            
          
                + " WHERE med_id ='" + medico_id + "';";
        System.out.println("Actualizado con exito");
        try {
            conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error  " + ex.getMessage());
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

					m.setMedico_id(rs.getInt("med_id".trim()));
					m.setMedico_numeroConsultorio(rs.getInt("med_numeroConsultorio".trim()));
					m.setMedico_usuario(rs.getString(" med_usuario".trim()));
					m.setMedico_password(rs.getString("med_password".trim()));
					m.setMedico_persona_id(rs.getInt("med_persona_id".trim()));
					
					

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			 desconectar();
		}
		return m;
	}
     */
    
    
    
    
  
    
}