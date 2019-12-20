/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author GeovannyAbad
 */
public class MedicoNGTest {
    
    public MedicoNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getMed_id method, of class Medico.
     */
    @Test
    public void testGetMed_id() {
        System.out.println("getMed_id");
        Medico instance = new Medico();
        int expResult = 0;
        int result = instance.getMed_id();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMed_id method, of class Medico.
     */
    @Test
    public void testSetMed_id() {
        System.out.println("setMed_id");
        int med_id = 0;
        Medico instance = new Medico();
        instance.setMed_id(med_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMed_numeroConsultorio method, of class Medico.
     */
    @Test
    public void testGetMed_numeroConsultorio() {
        System.out.println("getMed_numeroConsultorio");
        Medico instance = new Medico();
        int expResult = 0;
        int result = instance.getMed_numeroConsultorio();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMed_numeroConsultorio method, of class Medico.
     */
    @Test
    public void testSetMed_numeroConsultorio() {
        System.out.println("setMed_numeroConsultorio");
        int med_numeroConsultorio = 0;
        Medico instance = new Medico();
        instance.setMed_numeroConsultorio(med_numeroConsultorio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMed_usuario method, of class Medico.
     */
    @Test
    public void testGetMed_usuario() {
        System.out.println("getMed_usuario");
        Medico instance = new Medico();
        String expResult = "";
        String result = instance.getMed_usuario();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMed_usuario method, of class Medico.
     */
    @Test
    public void testSetMed_usuario() {
        System.out.println("setMed_usuario");
        String med_usuario = "";
        Medico instance = new Medico();
        instance.setMed_usuario(med_usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMed_password method, of class Medico.
     */
    @Test
    public void testGetMed_password() {
        System.out.println("getMed_password");
        Medico instance = new Medico();
        String expResult = "";
        String result = instance.getMed_password();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMed_password method, of class Medico.
     */
    @Test
    public void testSetMed_password() {
        System.out.println("setMed_password");
        String med_password = "";
        Medico instance = new Medico();
        instance.setMed_password(med_password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMed_persona_id method, of class Medico.
     */
    @Test
    public void testGetMed_persona_id() {
        System.out.println("getMed_persona_id");
        Medico instance = new Medico();
        int expResult = 0;
        int result = instance.getMed_persona_id();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMed_persona_id method, of class Medico.
     */
    @Test
    public void testSetMed_persona_id() {
        System.out.println("setMed_persona_id");
        int med_persona_id = 0;
        Medico instance = new Medico();
        instance.setMed_persona_id(med_persona_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarInfoMedico method, of class Medico.
     */
    @Test
    public void testMostrarInfoMedico() {
        System.out.println("mostrarInfoMedico");
        Medico instance = new Medico();
        String expResult = "";
        String result = instance.mostrarInfoMedico();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
