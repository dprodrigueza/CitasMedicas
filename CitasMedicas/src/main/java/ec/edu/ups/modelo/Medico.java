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
  
  
  
    
}
