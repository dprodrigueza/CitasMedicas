/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.conexion.ConexionBD;
import ec.edu.ups.conexion.conexion;
import ec.edu.ups.modelo.Diagnostico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;

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

    
public void crear(Diagnostico diagnostico) {
		Connection con = null;
		String sql = "insert into diagnostico (diag_id, diag_enfermedadActual, diag_boca, diag_torax, diag_abdomen , diag_extremidades, "
                        + "diag_regionPerineal, diag_valoracionNeuronal, diag_ie10, diag_tratamiento, CITAMEDICA_cita_id, CITAMEDICA_PACIENTE_pa_id, HISTORIAL CLINICO_hist_id) "
				+ "   values (?,?,?,?,?,?,?,?,?,?,?,?,?);";

		try {
			con = ConexionBD.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, clientes.getCedula());
			ps.setString(2, clientes.getNombres());
			ps.setString(3, clientes.getApellidos());
			ps.setString(4, clientes.getEmail());
			ps.setString(5, clientes.getDireccion());
			ps.setString(6, clientes.getTelefono());

			ps.executeUpdate();

			System.out.println(ps);
			{

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConexionBD.close(con);
		}

	}

    public void modificarDiagnostico(Diagnostico diagnostico) {
        String sql = "UPDATE Diagnostico set enfermedadActual=?, boca=?, torax=?, abdomen=?, extremidades=?, regionPerineal=?, valoracionNeurologica=?, ice10=?, tratamientos=?  where cedula='" + diagnostico.getCodigoDiagnostico() + "';";
        
        try {
            conexion = new conexion();
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setString(1, diagnostico.getEnfermedadActual());
            ps.setString(2, diagnostico.getBoca());
            ps.setString(3, diagnostico.getTorax());
            ps.setString(4, diagnostico.getAbdomen());
            ps.setString(5, diagnostico.getExtremidades());
            ps.setString(6, diagnostico.getRegionPerineal());
            ps.setString(7, diagnostico.getValoracionNeurologica());
            ps.setString(8, diagnostico.getIce10());
            ps.setString(9, diagnostico.getTratamientos());

        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
            JOptionPane.showMessageDialog(null, "NO EXISTE");
        } finally {
            conexion.desconectar();
        }
    }

}
