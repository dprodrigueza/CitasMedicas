/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author GeovannyAbad
 */
public class Medico {
    
    
    
    public int medico_id;
    public int medico_numeroConsultorio;
    public String medico_usuario;
    public String medico_password;
  public int medico_persona_id;
  
  
  public Medico(int medico_id, int medico_numeroConsultorio, String medico_usuario, String medico_password, int medico_persona_id) {
        this.medico_id = medico_id;
       this.medico_numeroConsultorio = medico_numeroConsultorio;
       this.medico_usuario = medico_usuario;
       this.medico_password =  medico_password;
       this.medico_persona_id = medico_persona_id;
    }

    public Medico() {
      
    }

    public int getMedico_id() {
        return medico_id;
    }

    public void setMedico_id(int medico_id) {
        this.medico_id = medico_id;
    }

    public int getMedico_numeroConsultorio() {
        return medico_numeroConsultorio;
    }

    public void setMedico_numeroConsultorio(int medico_numeroConsultorio) {
        this.medico_numeroConsultorio = medico_numeroConsultorio;
    }

    public String getMedico_usuario() {
        return medico_usuario;
    }

    public void setMedico_usuario(String medico_usuario) {
        this.medico_usuario = medico_usuario;
    }

    public String getMedico_password() {
        return medico_password;
    }

    public void setMedico_password(String medico_password) {
        this.medico_password = medico_password;
    }

    public int getMedico_persona_id() {
        return medico_persona_id;
    }

    public void setMedico_persona_id(int medico_persona_id) {
        this.medico_persona_id = medico_persona_id;
    }


 

   
  
  
   public String mostrarInfoMedico() {
        return "Medico{" + "medico_id=" + medico_id + ", medico_numeroConsultorio=" + medico_numeroConsultorio + ", medico_usuario=" + medico_usuario + ", medico_password=" + medico_password + ", medico_persona_id=" + medico_persona_id +  '}';
    }
    
}
