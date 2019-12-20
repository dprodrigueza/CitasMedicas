/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
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
public class ControladorPersonaTest {
    
    public ControladorPersonaTest() {
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
     * Test of conectar method, of class ControladorPersona.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        ControladorPersona instance = new ControladorPersona();
        instance.conectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectar method, of class ControladorPersona.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");
        ControladorPersona instance = new ControladorPersona();
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear method, of class ControladorPersona.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Persona p = null;
        ControladorPersona instance = new ControladorPersona();
        instance.crear(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ControladorPersona.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        String cedula = "";
        ControladorPersona instance = new ControladorPersona();
        instance.eliminar(cedula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class ControladorPersona.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        String cedula = "";
        ControladorPersona instance = new ControladorPersona();
        Persona expResult = null;
        Persona result = instance.buscar(cedula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ControladorPersona.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Persona p = null;
        String cedula = "";
        ControladorPersona instance = new ControladorPersona();
        instance.actualizar(p, cedula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
