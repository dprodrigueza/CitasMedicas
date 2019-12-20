/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Diagnostico;
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
public class ControladorDiagnosticoTest {
    
    public ControladorDiagnosticoTest() {
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
     * Test of registrarDiagnostico method, of class ControladorDiagnostico.
     */
    @Test
    public void testRegistrarDiagnostico() {
        System.out.println("registrarDiagnostico");
        Diagnostico diagnostico = null;
        ControladorDiagnostico instance = new ControladorDiagnostico();
        instance.registrarDiagnostico(diagnostico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
