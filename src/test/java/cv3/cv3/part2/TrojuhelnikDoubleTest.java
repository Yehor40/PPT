/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cv3.cv3.part2;

import cv3.part2.Trojuhelnik;
import cv3.part2.TrojuhelnikDouble;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Niteo
 */
public class TrojuhelnikDoubleTest {
    
    public TrojuhelnikDoubleTest() {
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

    /**
     * Test of minObvod method, of class TrojuhelnikDouble.
     */
    @Test
    public void testMinObvod() {
        System.out.println("minObvod");
        Trojuhelnik tr1 = new Trojuhelnik(3.0, 4.0, 5.0);
        Trojuhelnik tr2 = new Trojuhelnik(2.5, 4.6, 6.4);        
        TrojuhelnikDouble instance = new TrojuhelnikDouble(tr1, tr2);
        Trojuhelnik expResult = tr1;
        Trojuhelnik result = instance.minObvod();
        assertEquals(expResult, result);
    }

    /**
     * Test of are_equals method, of class TrojuhelnikDouble.
     */
    @Test
    public void testAre_equals() {
        System.out.println("are_equals");        
        Trojuhelnik tr1 = new Trojuhelnik(3.0, 4.0, 5.0);
        Trojuhelnik tr2 = new Trojuhelnik(2.5, 4.6, 6.4);        
        TrojuhelnikDouble instance = new TrojuhelnikDouble(tr1, tr2);
        boolean expResult = true;
        boolean result;
        result = instance.are_equals();
        assertEquals(expResult, result);
    }

    /**
     * Test of finalize method, of class TrojuhelnikDouble.
     */
    @Test
    public void testFinalize() throws Exception, Throwable {
        System.out.println("finalize");
        Trojuhelnik tr1 = new Trojuhelnik(3.0, 4.0, 5.0);
        Trojuhelnik tr2 = new Trojuhelnik(2.5, 4.6, 6.4);        
        TrojuhelnikDouble instance = new TrojuhelnikDouble(tr1, tr2);
        instance.finalize();
    }

    /**
     * Test of toString method, of class TrojuhelnikDouble.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Trojuhelnik tr1 = new Trojuhelnik(3.0, 4.0, 5.0);
        Trojuhelnik tr2 = new Trojuhelnik(2.5, 4.6, 6.4);        
        TrojuhelnikDouble instance = new TrojuhelnikDouble(tr1, tr2);
        String expResult = "Tr1:a:3.0;b:4.0;c:5.0;Tr2:a:2.5;b:4.6;c:6.4";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
