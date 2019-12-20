/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.CitaMedica;
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
public class ControladorCitaMedicaTest {
    
    public ControladorCitaMedicaTest() {
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
     * Test of conectar method, of class ControladorCitaMedica.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        ControladorCitaMedica instance = new ControladorCitaMedica();
        instance.conectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectar method, of class ControladorCitaMedica.
     */
    @Test
    public void testDesconectar() {
        System.out.println("desconectar");
        ControladorCitaMedica instance = new ControladorCitaMedica();
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear method, of class ControladorCitaMedica.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        CitaMedica cm = null;
        ControladorCitaMedica instance = new ControladorCitaMedica();
        instance.crear(cm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ControladorCitaMedica.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        int id = 0;
        ControladorCitaMedica instance = new ControladorCitaMedica();
        instance.eliminar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class ControladorCitaMedica.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        int id = 0;
        ControladorCitaMedica instance = new ControladorCitaMedica();
        CitaMedica expResult = null;
        CitaMedica result = instance.buscar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ControladorCitaMedica.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        CitaMedica cm = null;
        int id = 0;
        ControladorCitaMedica instance = new ControladorCitaMedica();
        instance.actualizar(cm, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
