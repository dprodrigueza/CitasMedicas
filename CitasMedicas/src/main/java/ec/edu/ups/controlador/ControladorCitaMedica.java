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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author VIVIANA
 */
public class ControladorCitaMedica {

    private Connection con;
    private List<CitaMedica> citaMedica;
    private Statement statement;
    private ResultSet r;
    private conexion conexion;
    private PreparedStatement ps;

    public void crear(CitaMedica cm) {
        String sql = "INSERT INTO cita_medica VALUES ( " + cm.getCita_id() + "'" + cm.getCita_fecha() + "', '" + cm.getCita_hora() + "' , '"
                + cm.getCita_motivo() + "', '" + cm.getMedico() + "', '" + cm.getPaciente() + "' ,'" + ");";

        System.out.println("" + sql);

        try {
<<<<<<< Updated upstream
            //    conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            // desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
            System.out.println(sql);
=======
            conexion = new conexion();
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, citaMedica.getCita_id());
            ps.setString(3, citaMedica.getCita_fecha());
            ps.setTime(3, citaMedica.getCita_hora());
            ps.setString(4, citaMedica.getPaciente().getPac_cedula());
            ps.setString(5, citaMedica.getMedico().getMed_id());
            ps.setString(6, citaMedica.getCita_motivo());

        } catch (Exception e) {
            System.out.println("error " + e);
            JOptionPane.showMessageDialog(null, "Los Datos no han sido Guardados");
        } finally {
            conexion.desconectar();
>>>>>>> Stashed changes
        }
    }

    public void eliminar(int id) {
        String sql = "DELETE FROM cita_medica WHERE  cita_id  =" + id + ";";
        try {
            // conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            //desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }

    public CitaMedica buscar(int id) {

        String sql = "SELECT * FROM cita_medica WHERE  cita_id  ='" + id + "';";

        //System.out.println(sql);
        try {
            // conectar();
            Statement sta = con.createStatement();
            ResultSet reset = sta.executeQuery(sql);
            while (reset.next()) {
                CitaMedica c = new CitaMedica(id);
                //c.setIdCliente(reset.getInt(1));
                c.setCita_fecha(reset.getDate(1));
                c.setCita_hora(reset.getTime(2));
                c.setCita_motivo(reset.getString(3));

                //System.out.println("cedula sy existe");
                return c;

            }
            System.out.println("la cita no existe");

            //  desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        return null;
    }

    public void actualizar(CitaMedica cm, int id) {

        String sql = "UPDATE cita_medica  SET   cita_id  = '" + cm.getCita_id()
                + "', cita_fecha = '" + cm.getCita_fecha()
                + "', cita_hora = '" + cm.getCita_hora()
                + "', cita_motivo = '" + cm.getCita_motivo()
                + "', cita_medico = '" + cm.getMedico()
                + "', cita_paciente = '" + cm.getPaciente()
                + " WHERE cita_id ='" + id + "';";
        System.out.println(sql);
        try {
            //  conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            // desconectar();
        } catch (SQLException ex) {
            System.out.println("Error  " + ex.getMessage());
        }
    }

}
