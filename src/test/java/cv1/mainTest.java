/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cv1;

import java.util.logging.Level;
import java.util.logging.Logger;

import cv1.Exceptions.FaktorialException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.Main.Main.*;

public class mainTest {
    
    public mainTest() {
    }
    /*
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
    }*/
  final static CalcFaktorial calcf = new CalcFaktorial();
    @Test
    public void testCalc1() {
        System.out.println("calc1");        
        int expResult = 720;
        int result = calcf.calc1(6);
        assertEquals(expResult, result);
    }    
    @Test
    public void testCalc2() throws FaktorialException {
        System.out.println("calc2");        
        int expResult = 720;
        int result = calcf.calc2(6);
        assertEquals(expResult, result);    
    }  

    /**
     * Test of main method, of class main.
     * @throws Exception
     */
    @Test
    public void testFactorialRandom() throws Exception {
        System.out.println("test");
        final int factorialOf = 1 + (int) (10 * Math.random());
        try {
            assertEquals(calcf.calc1(factorialOf), calcf.calc2(factorialOf));
            //assertEquals(main.CalcFaktorial.calc1(-6),main.CalcFaktorial.calc2(-6));
            
        } catch (FaktorialException ex) {
            Logger.getLogger(mainTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void testNegativeInput() {
        Exception exception;
        exception = assertThrows(FaktorialException.class, () -> {     
            calcf.calc2(-1);
        });

        String expectedMessage = "Chybné vstupní číslo";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
            
    @Test public void testCompare() {
        assertEquals(1, ToolCisla.compare_int(3, 2));
    }   
    
    @Test public void testCompare2() {
        assertEquals(0, ToolCisla.compare_int(2, 2));
    }
    
    @Test public void testCompare3() {
        assertEquals(-1, ToolCisla.compare_int(1, 2));
    }    

}
