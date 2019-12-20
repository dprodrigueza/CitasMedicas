/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

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
public class EspecialidadTest {
    
    public EspecialidadTest() {
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
     * Test of getEspe_id method, of class Especialidad.
     */
    @Test
    public void testGetEspe_id() {
        System.out.println("getEspe_id");
        Especialidad instance = null;
        int expResult = 0;
        int result = instance.getEspe_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEspe_id method, of class Especialidad.
     */
    @Test
    public void testSetEspe_id() {
        System.out.println("setEspe_id");
        int espe_id = 0;
        Especialidad instance = null;
        instance.setEspe_id(espe_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEspe_especialidad method, of class Especialidad.
     */
    @Test
    public void testGetEspe_especialidad() {
        System.out.println("getEspe_especialidad");
        Especialidad instance = null;
        String expResult = "";
        String result = instance.getEspe_especialidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEspe_especialidad method, of class Especialidad.
     */
    @Test
    public void testSetEspe_especialidad() {
        System.out.println("setEspe_especialidad");
        String espe_especialidad = "";
        Especialidad instance = null;
        instance.setEspe_especialidad(espe_especialidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Especialidad.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Especialidad instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
