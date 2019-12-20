/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Medico;
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
public class ControladorMedicoTest {
    
    public ControladorMedicoTest() {
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
     * Test of conectar method, of class ControladorMedico.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        ControladorMedico instance = new ControladorMedico();
        instance.conectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectar method, of class ControladorMedico.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");
        ControladorMedico instance = new ControladorMedico();
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear method, of class ControladorMedico.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Medico m = null;
        ControladorMedico instance = new ControladorMedico();
        instance.crear(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ControladorMedico.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int medico_id = 0;
        ControladorMedico instance = new ControladorMedico();
        instance.eliminar(medico_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ControladorMedico.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Medico m = null;
        int medico_id = 0;
        ControladorMedico instance = new ControladorMedico();
        instance.actualizar(m, medico_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BuscarMedico method, of class ControladorMedico.
     */
    @Test
    public void testBuscarMedico() {
        System.out.println("BuscarMedico");
        int med_id = 0;
        ControladorMedico instance = new ControladorMedico();
        Medico expResult = null;
        Medico result = instance.BuscarMedico(med_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
