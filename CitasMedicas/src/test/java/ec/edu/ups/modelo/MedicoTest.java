/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class MedicoTest {
    
    Medico m = null;
    
    public MedicoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ParseException {
        
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("17/01/1999");
        
        m = new  Medico(1, 2, "drodri", "cuenca", "0106630999", "diego", "rodriguez", "2864219", "Culebrillas", fecha, "Masculino");
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMedico_id method, of class Medico.
     */
    @Test
    public void testGetMedico_id() {
        System.out.println("getMedico_id");
        Medico instance = new Medico();
        int expResult = 0;
        int result = instance.getMedico_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedico_id method, of class Medico.
     */
    @Test
    public void testSetMedico_id() {
        System.out.println("setMedico_id");
        int medico_id = 0;
        Medico instance = new Medico();
        instance.setMedico_id(medico_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedico_numeroConsultorio method, of class Medico.
     */
    @Test
    public void testGetMedico_numeroConsultorio() {
        System.out.println("getMedico_numeroConsultorio");
        Medico instance = new Medico();
        int expResult = 0;
        int result = instance.getMedico_numeroConsultorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedico_numeroConsultorio method, of class Medico.
     */
    @Test
    public void testSetMedico_numeroConsultorio() {
        System.out.println("setMedico_numeroConsultorio");
        int medico_numeroConsultorio = 0;
        Medico instance = new Medico();
        instance.setMedico_numeroConsultorio(medico_numeroConsultorio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedico_usuario method, of class Medico.
     */
    @Test
    public void testGetMedico_usuario() {
        System.out.println("getMedico_usuario");
        Medico instance = new Medico();
        String expResult = "";
        String result = instance.getMedico_usuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedico_usuario method, of class Medico.
     */
    @Test
    public void testSetMedico_usuario() {
        System.out.println("setMedico_usuario");
        String medico_usuario = "";
        Medico instance = new Medico();
        instance.setMedico_usuario(medico_usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedico_password method, of class Medico.
     */
    @Test
    public void testGetMedico_password() {
        System.out.println("getMedico_password");
        Medico instance = new Medico();
        String expResult = "";
        String result = instance.getMedico_password();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedico_password method, of class Medico.
     */
    @Test
    public void testSetMedico_password() {
        System.out.println("setMedico_password");
        String medico_password = "";
        Medico instance = new Medico();
        instance.setMedico_password(medico_password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
