/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author umar
 */
public class CalculatorIT {
    
    public CalculatorIT() {
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
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
     int a = 6;
     int b = 8;
     
     //create an object of calculator class
     Calculator test = new Calculator();
     int result = test.add(a, b);
     assertEquals(14, result);
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @Test
    public void testSubtract() {
        int a = 6;
        int b = 8;
        Calculator scan = new Calculator();
        int result1 = scan.subtract(a, b);
        assertEquals(-2, result1);
    }
    @Test
    public void testAddString(){
            Calculator myString = new Calculator();
            String res = myString.addString("umar", "munddu");
            assertEquals("umarmunddu", res);
        }
}
