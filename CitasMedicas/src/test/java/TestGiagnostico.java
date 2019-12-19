

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ec.edu.ups.controlador.ControladorPaciente;
import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.modelo.Paciente;
import ec.edu.ups.modelo.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Damián Sumba
 */
public class TestGiagnostico {

    public TestGiagnostico() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testPaciente() {
        Paciente p = new Paciente(1);
        Persona p1 = new Persona();
        p1.setCedula("46464564");
        p1.setDireccion("cuenca");

        //p1.setFechaNacimiento("12-12-01");
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
        String nombre ="Pepito";
        assertEquals(nombre, p.getPersona().getNombres());

    }
}
