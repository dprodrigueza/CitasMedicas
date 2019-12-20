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

    public void registrarDiagnostico(Diagnostico diagnostico) {
//        String sql = "INSERT INTO Diagnostico VALUES ( " + p.getPa_id() + "'" + p.getPa_religion() + "', '" + p.getPa_recidencia() + "' , '"
//                + p.getPa_procedencia() + "', '" + p.getPa_ocupacion() + "', '" + p.getPersona() + "' ,'" + ");";
//
//        System.out.println("" + sql);
        
        String sql = "INSERT INTO Diagnostico VALUES ( " + diagnostico.getCodigoDiagnostico()+ "'" + diagnostico.getEnfermedadActual() + "', '" + diagnostico.getBoca() + "' , '"
                + diagnostico.getTorax() + "', '" + diagnostico.getAbdomen() + "', '" + diagnostico.getExtremidades() + "' ,'" +  diagnostico.getRegionPerineal() + "','" + ");";

        System.out.println("" + sql);
    }

}
