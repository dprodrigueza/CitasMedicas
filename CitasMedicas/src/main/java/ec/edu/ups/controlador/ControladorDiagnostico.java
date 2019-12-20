/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.conexion.conexion;
import ec.edu.ups.modelo.Diagnostico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Damián Sumba
 */
public class ControladorDiagnostico {
    
    private Statement statement;
    private ResultSet r;
    private conexion conexion;
    private PreparedStatement ps;

    Diagnostico diagnostico = new Diagnostico();

    private List<Diagnostico> listaDiagnstico;

    public ControladorDiagnostico() {
        
        listaDiagnstico =  new ArrayList<>();
    }
    
    

    public void registrarDiagnostico(Diagnostico diagnostico) {
//String sql = "INSERT INTO cliente (cedula, nombre, apellido, direccion, telefono, celular, correo " + ") " + " values (?,?,?,?,?,?,?);";
//        try {
//            conexion = new conexion();
//            ps = conexion.getConexion().prepareStatement(sql);
//            ps.setString(1, c.getCedula());
//            ps.setString(2, c.getNombre());
//            ps.setString(3, c.getApellido());
//            ps.setString(4, c.getDireccion());
//            ps.setString(5, c.getTelefono());
//            ps.setString(6, c.getCelular());
//            ps.setString(7, c.getCorreo());
//            ps.execute();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            conexion.desconectar();
//        }
//public int codigoDiagnostico;
//    public String enfermedadActual;
//    public String boca;
//    public String torax;
//    public String abdomen;
//    public String extremidades;
//    public String regionPerineal;
//    public String valoracionNeurologica;
//    public String ice10;
//    public String tratamientos;

       String sql =  "INSERT INTO Diagnostico (codigoDiagnostico, enfermedadActual, boca, torax, abdomen, "
               + "extremidades, regionPerineal, valoracionNeurologica, ice10, tratamientos "+ ")" + " values (?,?,?,?,?,?,?,?,?,?);";
    }

}
