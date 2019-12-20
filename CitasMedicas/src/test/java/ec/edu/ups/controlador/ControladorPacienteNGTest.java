/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Paciente;
import static org.testng.Assert.*;

/**
 *
 * @author GeovannyAbad
 */
public class ControladorPacienteNGTest {
    
    public ControladorPacienteNGTest() {
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
     * Test of conectar method, of class ControladorPaciente.
     */
    @org.testng.annotations.Test
    public void testConectar() {
        System.out.println("conectar");
        ControladorPaciente instance = new ControladorPaciente();
        instance.conectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectar method, of class ControladorPaciente.
     */
    @org.testng.annotations.Test
    public void testDesconectar() {
        System.out.println("desconectar");
        ControladorPaciente instance = new ControladorPaciente();
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear method, of class ControladorPaciente.
     */
    @org.testng.annotations.Test
    public void testCrear() {
        System.out.println("crear");
        Paciente p = null;
        ControladorPaciente instance = new ControladorPaciente();
        instance.crear(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ControladorPaciente.
     */
    @org.testng.annotations.Test
    public void testEliminar() {
        System.out.println("eliminar");
        int id = 0;
        ControladorPaciente instance = new ControladorPaciente();
        instance.eliminar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class ControladorPaciente.
     */
    @org.testng.annotations.Test
    public void testBuscar() {
        System.out.println("buscar");
        int id = 0;
        ControladorPaciente instance = new ControladorPaciente();
        Paciente expResult = null;
        Paciente result = instance.buscar(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ControladorPaciente.
     */
    @org.testng.annotations.Test
    public void testActualizar() {
        System.out.println("actualizar");
        Paciente p = null;
        int id = 0;
        ControladorPaciente instance = new ControladorPaciente();
        instance.actualizar(p, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
