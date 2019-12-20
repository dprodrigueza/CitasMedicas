
import ec.edu.ups.controlador.ControladorPaciente;
import ec.edu.ups.modelo.Paciente;
import ec.edu.ups.modelo.Persona;
import static org.junit.Assert.assertEquals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Damián Sumba
 */
public class Principal {

    public static void main(String arg[]) {
        Paciente p = new Paciente(1);
        Persona p1 = new Persona();
        p1.setCedula("46464564");
        p1.setDireccion("cuenca");
        p1.setNombres("andres");
        p1.setSexo("masculino");
        p1.setTelefono("43242");

        p.setPa_ocupacion("ingeniero");
        p.setPa_procedencia("ecuador");
        p.setPa_recidencia("cuenca");
        p.setPa_religion("catolico");
        p.setPersona(p1);
        ControladorPaciente cpas = new ControladorPaciente();
        cpas.crear(p);
        String nombre = "Pepito";
    }

}
