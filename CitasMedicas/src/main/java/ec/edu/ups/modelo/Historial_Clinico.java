/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Damián Sumba
 */
public class Historial_Clinico {

    private int codigoHistorial;
    private String descripcion;
    private String tipo;
    private Date fecha;
    // private listaDiagnostico list<>;

    public Historial_Clinico() {
    }

    public int getCodigoHistorial() {
        return codigoHistorial;
    }

    public void setCodigoHistorial(int codigoHistorial) {
        this.codigoHistorial = codigoHistorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Historial_Clinico{" + "codigoHistorial=" + codigoHistorial + ", descripcion=" + descripcion + ", tipo=" + tipo + ", fecha=" + fecha + '}';
    }
    
}
