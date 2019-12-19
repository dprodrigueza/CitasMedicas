/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Paciente;
import java.sql.Connection;
import java.sql.DriverManager;
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

    
}
