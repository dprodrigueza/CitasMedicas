/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Medico;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class ControladorMedicoTest {
    Medico m = null;
    Medico m2 = null;
    ControladorMedico cM= null;
    
  
    public ControladorMedicoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws ParseException {
        
        cM = new ControladorMedico();
        
        DateFormat format = new SimpleDateFormat("dd/mm/yyyy"); // Creamos un formato de fecha
        Date fecha = format.parse("17/01/1999");
        
        m = new  Medico(1, 2, "drodri", "cuenca", "0106630999", "diego", "rodriguez", "2864219", "Culebrillas", fecha, "Masculino");
        m2 = new  Medico(2, 2, "grodri", "cuenca", "0301844122", "guido", "rodriguez", "0995038610", "Culebrillas", fecha, "Masculino");
     
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crear method, of class ControladorMedico.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
       
        boolean expResult = true;
        boolean result = cM.crear(m);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
