/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

/**
 *
 * @author VIVIANA
 */
public class Cliente {
    
    //private int idCliente;
    public String cedula;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private int telefono;
    
    public Cliente()
    {
        // Inicialización
       // idCliente = 1;
        cedula = "";
        nombre = "";
        apellido = "";
        email = "";
          direccion ="";
        telefono =  0;
        
    }

    public Cliente( String cedula, String nombre, String apellido, String email,String direccion, int telefono) {
       // this.idCliente = idCliente;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion= direccion;
        this.telefono = telefono;
    }

   

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
      public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

   

    
    


   @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono + '}';
    }


    
}
