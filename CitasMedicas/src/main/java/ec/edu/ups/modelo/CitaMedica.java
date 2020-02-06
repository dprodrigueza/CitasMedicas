/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author VIVIANA
 */
public class CitaMedica {
    
  public int cita_id;
  public Date cita_fecha;
  public Time cita_hora;
  public String cita_motivo;
  public Medico medico;
  public Paciente paciente;

    public CitaMedica(int cita_id) {
        this.cita_id = cita_id;
        this.cita_fecha = cita_fecha;
        this.cita_hora = cita_hora;
        this.cita_motivo = cita_motivo;
        this.medico = medico;
        this.paciente = paciente;
    }

    public CitaMedica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCita_id() {
        return cita_id;
    }

    public void setCita_id(int cita_id) {
        this.cita_id = cita_id;
    }

    public Date getCita_fecha() {
        return cita_fecha;
    }

    public void setCita_fecha(Date cita_fecha) {
        this.cita_fecha = cita_fecha;
    }

    public Time getCita_hora() {
        return cita_hora;
    }

    public void setCita_hora(Time cita_hora) {
        this.cita_hora = cita_hora;
    }

    public String getCita_motivo() {
        return cita_motivo;
    }

    public void setCita_motivo(String cita_motivo) {
        this.cita_motivo = cita_motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "cita_id=" + cita_id + ", cita_fecha=" + cita_fecha + ", cita_hora=" + cita_hora + ", cita_motivo=" + cita_motivo + ", medica=" + medico + ", paciente=" + paciente + '}';
    }
  
    
}
