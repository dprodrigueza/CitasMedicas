/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.conexion.conexion;
import ec.edu.ups.modelo.CitaMedica;
import ec.edu.ups.modelo.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author VIVIANA
 */
public class ControladorCitaMedica {
    
    private Connection con;
    private List<CitaMedica> listacitaMedica;
    private Statement statement;
    private ResultSet r;
    private conexion conexion;
    private PreparedStatement ps;
    
    
    public ControladorCitaMedica(){
        listacitaMedica =  new ArrayList<CitaMedica>();
       
    }
   
    public void crearCitaMedica(CitaMedica citaMedica) {
        ControladorMedico controladorMedico =  new ControladorMedico();
        ControladorPaciente controladorPaciente = new ControladorPaciente();
        String sql = "INSERT INTO citasMedicas (codigoCita, fechaCita, horaCita, paciente, medico, motivoCita " + ")" + " values (?,?,?,?,?,?);";
        try {
            conexion = new conexion();
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, citaMedica.getCita_id());
            ps.setDate(2, (Date) citaMedica.getCita_fecha());
            ps.setTime(3, citaMedica.getCita_hora());
            ps.setInt(4, citaMedica.getPaciente().getPa_id());
            ps.setInt(5, citaMedica.getMedico().getMedico_id());
            ps.setString(6, citaMedica.getCita_motivo());
           
        } catch (Exception e) {
            System.out.println("error " + e);
            JOptionPane.showMessageDialog(null, "Los Datos no han sido Guardados");
        } finally {
        conexion.desconectar();
        }
    }
    
    
    public void eliminarCitaMedica(CitaMedica citaMedica, int id) {
        try {
            statement =  conexion.getConexion().createStatement(r.TYPE_SCROLL_SENSITIVE, r.CONCUR_UPDATABLE);
            statement.executeUpdate("DELETE FROM citasMedicas WHERE id =" + id + ";");
            JOptionPane.showMessageDialog(null, "cita medica eliminada ");
        } catch (Exception e) {
            System.out.println("problema al conectarse a la BD" + e );
            JOptionPane.showMessageDialog(null, "cita medica no eliminada");
        }
     
    }
     public void modificarCitaMedica(CitaMedica citaMedica, int id) {
         
         try {
             statement =  conexion.getConexion().createStatement(r.TYPE_SCROLL_SENSITIVE, r.CONCUR_UPDATABLE);
             statement.executeUpdate("UPDATE citasMedicas set cita_id  = '" + citaMedica.getCita_id()
            + "', cita_fecha = '" + citaMedica.getCita_fecha()
            + "', cita_hora = '" + citaMedica.getCita_hora()
            + "', cita_motivo = '"+ citaMedica.getCita_motivo()
            + "', cita_medico = '" + citaMedica.getMedico()
            + "', cita_paciente = '" + citaMedica.getPaciente()
            + "WHERE cita_id = '" + id + "';");
             JOptionPane.showMessageDialog(null, "Citas Medicas Actualizados con Exito");
                     
         } catch (Exception e) {
             System.out.println("error" + e);
             JOptionPane.showMessageDialog(null, "Datos no actualizados");
         }
         
         
    String sql = "UPDATE cita_medica  SET   cita_id  = '" + cm.getCita_id()
            + "', cita_fecha = '" + cm.getCita_fecha()
            + "', cita_hora = '" + cm.getCita_hora()
            + "', cita_motivo = '"+ cm.getCita_motivo()
            + "', cita_medico = '" + cm.getMedico()
            + "', cita_paciente = '" + cm.getPaciente()
          
                + " WHERE cita_id ='" + id + "';";
//        System.out.println(sql);
//        try {
//            conectar();
//            Statement sta = con.createStatement();
//            sta.executeUpdate(sql);
//            desconectar();
//        } catch (SQLException ex) {
//            System.out.println("Error  " + ex.getMessage());
//        }
  }
  
}
