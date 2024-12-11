/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.gruppo21.progettorubrica.model.gestionerubrica;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author grant
 */
public class ControlliValiditàTest {
    
    public ControlliValiditàTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of controlloNumero method, of class ControlliValidità.
     */
    @org.junit.jupiter.api.Test
    public void testControlloNumero() {
        System.out.println("controlloNumero");
        String numero = "";
        boolean expResult = false;
        boolean result = ControlliValidità.controlloNumero(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of controlloRiempimento method, of class ControlliValidità.
     */
    @org.junit.jupiter.api.Test
    public void testControlloRiempimento() {
        System.out.println("controlloRiempimento");
        String a = "";
        String b = "";
        boolean expResult = false;
        boolean result = ControlliValidità.controlloRiempimento(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
