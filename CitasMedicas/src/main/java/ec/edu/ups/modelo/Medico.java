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
    
    
    
    public int med_id;
    public int med_numeroConsultorio;
    public String med_usuario;
    public String med_password;
  public int med_persona_id;
  
  
  public Medico(int med_id, int med_numeroConsultorio, String med_usuario, String med_password, int med_persona_id) {
        this.med_id = med_id;
       this.med_numeroConsultorio = med_numeroConsultorio;
       this.med_usuario = med_usuario;
       this.med_password =  med_password;
       this.med_persona_id = med_persona_id;
    }

    public Medico() {
      
    }


 

    public int getMed_id() {
        return med_id;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public int getMed_numeroConsultorio() {
        return med_numeroConsultorio;
    }

    public void setMed_numeroConsultorio(int med_numeroConsultorio) {
        this.med_numeroConsultorio = med_numeroConsultorio;
    }

    public String getMed_usuario() {
        return med_usuario;
    }

    public void setMed_usuario(String med_usuario) {
        this.med_usuario = med_usuario;
    }

    public String getMed_password() {
        return med_password;
    }

    public void setMed_password(String med_password) {
        this.med_password = med_password;
    }

    public int getMed_persona_id() {
        return med_persona_id;
    }

    public void setMed_persona_id(int med_persona_id) {
        this.med_persona_id = med_persona_id;
    }
  
  
   public String mostrarInfoMedico() {
        return "Medico{" + "med_id=" + med_id + ", med_numeroConsultorio=" + med_numeroConsultorio + ", med_usuario=" + med_usuario + ", med_password=" + med_password + ", med_persona_id=" + med_persona_id +  '}';
    }
    
}
