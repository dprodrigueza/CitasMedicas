/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GeovannyAbad
 */
public class PersonaTest {
    
    public PersonaTest() {
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

    /**
     * Test of getCedula method, of class Persona.
     */
    @Test
    public void testGetCedula() {
        System.out.println("getCedula");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getCedula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCedula method, of class Persona.
     */
    @Test
    public void testSetCedula() {
        System.out.println("setCedula");
        String cedula = "";
        Persona instance = new PersonaImpl();
        instance.setCedula(cedula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombres method, of class Persona.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombres method, of class Persona.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        Persona instance = new PersonaImpl();
        instance.setNombres(nombres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Persona.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class Persona.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Persona instance = new PersonaImpl();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Persona.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Persona.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Persona instance = new PersonaImpl();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Persona.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Persona.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Persona instance = new PersonaImpl();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaNacimiento method, of class Persona.
     */
    @Test
    public void testGetFechaNacimiento() {
        System.out.println("getFechaNacimiento");
        Persona instance = new PersonaImpl();
        Date expResult = null;
        Date result = instance.getFechaNacimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaNacimiento method, of class Persona.
     */
    @Test
    public void testSetFechaNacimiento() {
        System.out.println("setFechaNacimiento");
        Date fechaNacimiento = null;
        Persona instance = new PersonaImpl();
        instance.setFechaNacimiento(fechaNacimiento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexo method, of class Persona.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Persona.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Persona instance = new PersonaImpl();
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarInfo method, of class Persona.
     */
    @Test
    public void testMostrarInfo() {
        System.out.println("mostrarInfo");
        Persona instance = new PersonaImpl();
        String expResult = "";
        String result = instance.mostrarInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PersonaImpl extends Persona {
    }
    
}
