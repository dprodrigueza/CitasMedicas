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

        listaDiagnstico = new ArrayList<Diagnostico>();
        
    }

    public void registrarDiagnostico(Diagnostico diagnostico) {

        String sql = "INSERT INTO Diagnostico (codigoDiagnostico, enfermedadActual, boca, torax, abdomen, "
                + "extremidades, regionPerineal, valoracionNeurologica, ice10, tratamientos " + ")" + " values (?,?,?,?,?,?,?,?,?,?);";

        try {
            conexion = new conexion();
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, diagnostico.getCodigoDiagnostico());
            ps.setString(2, diagnostico.getEnfermedadActual());
            ps.setString(3, diagnostico.getBoca());
            ps.setString(4, diagnostico.getTorax());
            ps.setString(5, diagnostico.getAbdomen());
            ps.setString(6, diagnostico.getExtremidades());
            ps.setString(7, diagnostico.getRegionPerineal());
            ps.setString(8, diagnostico.getValoracionNeurologica());
            ps.setString(9, diagnostico.getIce10());
            ps.setString(10, diagnostico.getTratamientos());

        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        } finally {
            conexion.desconectar();
        }

    }

}
