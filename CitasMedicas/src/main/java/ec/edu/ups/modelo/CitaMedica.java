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
  public int cita_motivo;
  public Medico medica;
  public Paciente paciente;

    public CitaMedica(int cita_id, Date cita_fecha, Time cita_hora, int cita_motivo, Medico medica, Paciente paciente) {
        this.cita_id = cita_id;
        this.cita_fecha = cita_fecha;
        this.cita_hora = cita_hora;
        this.cita_motivo = cita_motivo;
        this.medica = medica;
        this.paciente = paciente;
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

    public int getCita_motivo() {
        return cita_motivo;
    }

    public void setCita_motivo(int cita_motivo) {
        this.cita_motivo = cita_motivo;
    }

    public Medico getMedica() {
        return medica;
    }

    public void setMedica(Medico medica) {
        this.medica = medica;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "CitaMedica{" + "cita_id=" + cita_id + ", cita_fecha=" + cita_fecha + ", cita_hora=" + cita_hora + ", cita_motivo=" + cita_motivo + ", medica=" + medica + ", paciente=" + paciente + '}';
    }
  
    
}
