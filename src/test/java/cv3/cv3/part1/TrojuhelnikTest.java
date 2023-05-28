/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cv3.cv3.part1;

import cv3.part1.Trojuhelnik;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrojuhelnikTest {
    public TrojuhelnikTest() {
    }
    /**
     * Test of equals method, of class Trojuhelnik.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = new Trojuhelnik(3.0, 4.0, 5.0);
        Trojuhelnik instance = new Trojuhelnik(3.0, 4.0, 5.0);
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    /**
     * Test of toString method, of class Trojuhelnik.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Trojuhelnik instance = new Trojuhelnik(3.0, 4.0, 5.0);
        String expResult = "a:3.0;b:4.0;c:5.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    /**
     * Test of calc_obvod_a_obsah method, of class Trojuhelnik.
     */
    @Test
    public void testCalc_obvod_a_obsah() {
        System.out.println("calc_obvod_a_obsah");
        Trojuhelnik instance = new Trojuhelnik(3.0, 4.0, 5.0);
        Trojuhelnik instance2 = new Trojuhelnik(3.0, 4.0, 5.0);
        instance.calc_obvod_a_obsah();
        instance2.calc_obvod_a_obsah_new();
        
        assertEquals(instance.get_obvod(),instance2.get_obvod(),0.0);
    }
    @Test
    public void testCalc_obvod_a_obsah_EQUALS() {
        System.out.println("calc_obvod_a_obsah");
        Trojuhelnik instance = new Trojuhelnik(3.0, 4.0, 5.0);
        Trojuhelnik instance2 = new Trojuhelnik(3.0, 4.0, 5.0);
        assertEquals(instance.get_obsah(), instance2.get_obsah(),0.0);
        assertEquals(instance.get_obvod(), instance2.get_obvod(),0.0);
    }
    /**
     * Test of calc_obvod method, of class Trojuhelnik.
     */
    @Test
    public void testCalc_obvod() {
        System.out.println("calc_obvod");
        Trojuhelnik instance = new Trojuhelnik(3.0, 4.0, 5.0);
        double expResult = 12.0;
        double result = instance.calc_obvod();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calc_obsah method, of class Trojuhelnik.
     */
    @Test
    public void testCalc_obsah() {
        System.out.println("calc_obsah");
        double obvod = 12.0;
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        Trojuhelnik instance = new Trojuhelnik(a, b, c);
        double expResult = 6.0;
        double result = instance.calc_obsah(obvod/2, a, b, c);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of get_obvod method, of class Trojuhelnik.
     */
    @Test
    public void testGet_obvod() {
        System.out.println("get_obvod");
        Trojuhelnik instance = new Trojuhelnik(3.0, 4.0, 5.0);
        instance.calc_obvod_a_obsah();
        double expResult = 12.0;
        double result = instance.get_obvod();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of get_obsah method, of class Trojuhelnik.
     */
    @Test
    public void testGet_obsah() {
        System.out.println("get_obsah");
        Trojuhelnik instance = new Trojuhelnik(3.0, 4.0, 5.0);
        instance.calc_obvod_a_obsah();
        double expResult = 6.0;
        double result = instance.get_obsah();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of is_valid method, of class Trojuhelnik.
     */
    @Test
    public void testIs_valid() {
        System.out.println("is_valid");
        Trojuhelnik instance = new Trojuhelnik(3.0, 4.0, 5.0);
        boolean expResult = true;
        boolean result = instance.is_valid();
        assertEquals(expResult, result);
    }

    /**
     * Test of get_a method, of class Trojuhelnik.
     */
    @Test
    public void testGet_a() {
        System.out.println("get_a");
        Trojuhelnik instance = new Trojuhelnik(3.0, 4.0, 5.0);
        double expResult = 3.0;
        double result = instance.get_a();
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of get_b method, of class Trojuhelnik.
     */
    @Test
    public void testGet_b() {
        System.out.println("get_b");
        Trojuhelnik instance = new Trojuhelnik(3.0, 4.0, 5.0);
        double expResult = 4.0;
        double result = instance.get_b();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of get_c method, of class Trojuhelnik.
     */
    @Test
    public void testGet_c() {
        System.out.println("get_c");
        Trojuhelnik instance = new Trojuhelnik(3.0, 4.0, 5.0);
        double expResult = 5.0;
        double result = instance.get_c();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of finalize method, of class Trojuhelnik.
     * @throws Exception
     */
    @Test
    public void testFinalize() throws Exception, Throwable {
        System.out.println("finalize");
        Trojuhelnik instance = new Trojuhelnik(3.0, 4.0, 5.0);
        instance.finalize();

    }
    
}
