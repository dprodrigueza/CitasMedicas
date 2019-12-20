/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.sql.Time;
import java.util.Date;
import static org.testng.Assert.*;

/**
 *
 * @author Damián Sumba
 */
public class CitaMedicaNGTest {
    
    public CitaMedicaNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getCita_id method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testGetCita_id() {
        System.out.println("getCita_id");
        CitaMedica instance = null;
        int expResult = 0;
        int result = instance.getCita_id();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCita_id method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testSetCita_id() {
        System.out.println("setCita_id");
        int cita_id = 0;
        CitaMedica instance = null;
        instance.setCita_id(cita_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCita_fecha method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testGetCita_fecha() {
        System.out.println("getCita_fecha");
        CitaMedica instance = null;
        Date expResult = null;
        Date result = instance.getCita_fecha();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCita_fecha method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testSetCita_fecha() {
        System.out.println("setCita_fecha");
        Date cita_fecha = null;
        CitaMedica instance = null;
        instance.setCita_fecha(cita_fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCita_hora method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testGetCita_hora() {
        System.out.println("getCita_hora");
        CitaMedica instance = null;
        Time expResult = null;
        Time result = instance.getCita_hora();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCita_hora method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testSetCita_hora() {
        System.out.println("setCita_hora");
        Time cita_hora = null;
        CitaMedica instance = null;
        instance.setCita_hora(cita_hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCita_motivo method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testGetCita_motivo() {
        System.out.println("getCita_motivo");
        CitaMedica instance = null;
        String expResult = "";
        String result = instance.getCita_motivo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCita_motivo method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testSetCita_motivo() {
        System.out.println("setCita_motivo");
        String cita_motivo = "";
        CitaMedica instance = null;
        instance.setCita_motivo(cita_motivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedico method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testGetMedico() {
        System.out.println("getMedico");
        CitaMedica instance = null;
        Medico expResult = null;
        Medico result = instance.getMedico();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedico method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testSetMedico() {
        System.out.println("setMedico");
        Medico medico = null;
        CitaMedica instance = null;
        instance.setMedico(medico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaciente method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testGetPaciente() {
        System.out.println("getPaciente");
        CitaMedica instance = null;
        Paciente expResult = null;
        Paciente result = instance.getPaciente();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaciente method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testSetPaciente() {
        System.out.println("setPaciente");
        Paciente paciente = null;
        CitaMedica instance = null;
        instance.setPaciente(paciente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CitaMedica.
     */
    @org.testng.annotations.Test
    public void testToString() {
        System.out.println("toString");
        CitaMedica instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
