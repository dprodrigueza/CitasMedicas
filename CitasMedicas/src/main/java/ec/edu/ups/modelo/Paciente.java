/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.modelo.Persona;
import java.util.Date;

/**
 *
 * @author VIVIANA
 */
public class Paciente {
    
    
  public String pa_id;
  public String pa_religion;
  public String  pa_recidencia;
  public String pa_procedencia;
  public String pa_ocupacion;
 public int persona;

  
  
  
  

       public Paciente(String pa_id, String pa_religion, String pa_recidencia, String pa_procedencia, String pa_ocupacion , int persona) {
        this.pa_id = pa_id;
        this.pa_religion = pa_religion;
        this.pa_recidencia = pa_recidencia;
        this.pa_procedencia = pa_procedencia;
        this.pa_ocupacion = pa_ocupacion;
        this.persona=persona;
       
    }

    public Paciente() {
    }

       
   
    public String getPa_id() {
        return pa_id;
    }

    public void setPa_id(String pa_id) {
        this.pa_id = pa_id;
    }

    public String getPa_religion() {
        return pa_religion;
    }

    public void setPa_religion(String pa_religion) {
        this.pa_religion = pa_religion;
    }

    public String getPa_recidencia() {
        return pa_recidencia;
    }

    public void setPa_recidencia(String pa_recidencia) {
        this.pa_recidencia = pa_recidencia;
    }

    public String getPa_procedencia() {
        return pa_procedencia;
    }

    public void setPa_procedencia(String pa_procedencia) {
        this.pa_procedencia = pa_procedencia;
    }

    public String getPa_ocupacion() {
        return pa_ocupacion;
    }

    public void setPa_ocupacion(String pa_ocupacion) {
        this.pa_ocupacion = pa_ocupacion;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Paciente{" + "pa_id=" + pa_id + ", pa_religion=" + pa_religion + ", pa_recidencia=" + pa_recidencia + ", pa_procedencia=" + pa_procedencia + ", pa_ocupacion=" + pa_ocupacion + ", persona=" + persona + '}';
    }
  
  
          
}
