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
public class Historial_ClinicoTest {
    
    public Historial_ClinicoTest() {
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
     * Test of getCodigoHistorial method, of class Historial_Clinico.
     */
    @Test
    public void testGetCodigoHistorial() {
        System.out.println("getCodigoHistorial");
        Historial_Clinico instance = new Historial_Clinico();
        int expResult = 0;
        int result = instance.getCodigoHistorial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoHistorial method, of class Historial_Clinico.
     */
    @Test
    public void testSetCodigoHistorial() {
        System.out.println("setCodigoHistorial");
        int codigoHistorial = 0;
        Historial_Clinico instance = new Historial_Clinico();
        instance.setCodigoHistorial(codigoHistorial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Historial_Clinico.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Historial_Clinico instance = new Historial_Clinico();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Historial_Clinico.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Historial_Clinico instance = new Historial_Clinico();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Historial_Clinico.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Historial_Clinico instance = new Historial_Clinico();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Historial_Clinico.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Historial_Clinico instance = new Historial_Clinico();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Historial_Clinico.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Historial_Clinico instance = new Historial_Clinico();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Historial_Clinico.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Historial_Clinico instance = new Historial_Clinico();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Historial_Clinico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Historial_Clinico instance = new Historial_Clinico();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
