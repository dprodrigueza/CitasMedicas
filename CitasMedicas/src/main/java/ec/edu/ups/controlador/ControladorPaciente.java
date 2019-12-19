/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author VIVIANA
 */
public class ControladorPaciente {
    
    private Connection con;
    private List<Paciente> pacientes;

    public void conectar() {
        con = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/citasMedicas", "root", "123kelly");
           


        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + " Error de Conexion sadjsjd");
        }
        if (con != null) {
            System.out.println("Conexión Exitosa");
        }
    }
    
      public void desconectar() {
        if (con != null) {
            try {
                con.close();
                System.out.println("Desconexión Exitosa");
            } catch (SQLException ex) {
                System.out.println("Error Al Desconectar " + ex.getMessage());
            }
        }
    }
    
    public void crear(Paciente p) {
        String sql = "INSERT INTO pacientes VALUES ( " + p.getPa_id()+"'" + p.getPa_religion()+"', '" + p.getPa_recidencia()+ "' , '"
                + p.getPa_procedencia()+ "', '" + p.getPa_ocupacion()+ "' ,'"+");";
        
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
    
    
    public void eliminar(int id) {
         String sql = "DELETE FROM pacientes WHERE  pa_id  =" + id + ";";
        try {
            conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }

     public Paciente buscar(int id) {

        String sql = "SELECT * FROM pacientes WHERE  pa_id  ='"  + id + "';";
         
        try {
            conectar();
            Statement sta = con.createStatement();
            ResultSet reset = sta.executeQuery(sql);
            while (reset.next()) {
                Paciente p = new Paciente(id);
                //c.setIdCliente(reset.getInt(1));
                p.setPa_religion(reset.getString(1));
                p.setPa_recidencia(reset.getString(2));
                p.setPa_procedencia(reset.getString(3));
                p.setPa_ocupacion(reset.getString(4));

                return p;
                
            }
            System.out.println("paciente no existe");
           
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        return null;
    }
     
    
     public void actualizar(Paciente p, int id) {
         
         
    String sql = "UPDATE pacientes  SET   pa_id  = '" + p.getPa_id()
            + "', pa_religion = '" + p.getPa_religion()
            + "', pa_recidencia = '" + p.getPa_recidencia()
            + "', pa_procedencia = '"+ p.getPa_procedencia()
            + "', pa_ocupacion = '" + p.getPa_ocupacion()
          
                + " WHERE pa_id ='" + id + "';";
        System.out.println(sql);
        try {
            conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error  " + ex.getMessage());
        }
    }
    
}
