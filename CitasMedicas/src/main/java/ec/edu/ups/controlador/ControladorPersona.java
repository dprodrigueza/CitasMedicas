/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author diego
 */
public class ControladorPersona {

    private Connection con;
    private List<Persona> personaList;

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

    public void crear(Persona p) {
        String sql = "INSERT INTO persona VALUES ('" + p.getCedula() + "', '" + p.getNombres() + "', '" + p.getApellidos() + "' , '"
                + p.getFechaNacimiento() + "', '" + p.getDireccion() + "', '" + p.getTelefono() + "' ,'" + p.getSexo() + "');";

        System.out.println("" + sql);

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

    public void eliminar(String cedula) {
        String sql = "DELETE FROM persona WHERE  per_id  ='" + cedula + "';";
        try {
            conectar();
            Statement sta = con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
    }

    public Persona buscar(String cedula) {

        String sql = "SELECT * FROM persona WHERE  per_id  ='" + cedula + "';";

        try {
            conectar();
            Statement sta = con.createStatement();
            ResultSet resultado = sta.executeQuery(sql);
            while (resultado.next()) {
                Persona p = null;

                p.setCedula(resultado.getString(1));
                p.setNombres(resultado.getString(2));
                p.setApellidos(resultado.getString(3));
                p.setFechaNacimiento(resultado.getDate(4));
                p.setDireccion(resultado.getString(5));
                p.setTelefono(resultado.getString(6));
                p.setSexo(resultado.getString(7));

                return p;

            }
            System.out.println("Persona no registrada");

            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error " + ex.getMessage());
        }
        return null;
    }

    public void actualizar(Persona p, String cedula) {

        String sql = "UPDATE persona  SET   per_id  = '" + p.getCedula()
                + "', per_nombres = '" + p.getNombres()
                + "', per_apellidos = '" + p.getApellidos()
                + "', per_fecNacimiento = '" + p.getFechaNacimiento()
                + "', per_direccion = '" + p.getDireccion()
                + "', per_telefono = '" + p.getTelefono()
                + "', per_sexo = '" + p.getSexo()
                + " WHERE per_cedula ='" + cedula + "';";
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
