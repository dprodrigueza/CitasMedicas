/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author diego
 */
public abstract class Persona {

    public String cedula;
    public String nombres;
    public String apellidos;
    public String telefono;
    public String direccion;
    public Date fechaNacimiento;
    public String sexo;

    public Persona(String cedula, String nombres, String apellidos, String telefono, String direccion, Date fechaNacimiento, String sexo) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public Persona() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    public String mostrarInfo() {
        return "Persona{" + "cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + '}';
    }
    
    
    
}
