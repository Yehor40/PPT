/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cv7;

import java.io.IOException;
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
public class Vypocet_HistogramTest {

    public Vypocet_HistogramTest() {
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
     * Test of hist method, of class Vypocet_Histogram.
     */
    @Test
    public void testHistogram() {
        int[] exceptedAbsoluteArray = new int['Z'-'A'+1];
        Vypocet_Histogram instance = new Vypocet_Histogram();
        instance.hist("AABCCCCD");
        exceptedAbsoluteArray[0]=2;
        exceptedAbsoluteArray[1]=1;
        exceptedAbsoluteArray[2]=4;
        exceptedAbsoluteArray[3]=1;
        assertArrayEquals(instance.getHistogram(), exceptedAbsoluteArray);
    }   
    
    @Test
    public void testHistogramfromFile() throws IOException {
        int[] exceptedAbsoluteArray = new int['Z'-'A'+1];
        Vypocet_Histogram instance = new Vypocet_Histogram();
        String file ="src/main/resources/text.txt";
        instance.hist2(file);
        exceptedAbsoluteArray[0]=2;
        exceptedAbsoluteArray[1]=0;
        exceptedAbsoluteArray[2]=3;
        exceptedAbsoluteArray[3]=0;
        exceptedAbsoluteArray[4]=2;
        exceptedAbsoluteArray[5]=0;
        exceptedAbsoluteArray[6]=1;
        exceptedAbsoluteArray[7]=1;
        exceptedAbsoluteArray[8]=3;
        exceptedAbsoluteArray[9]=0;
        exceptedAbsoluteArray[10]=2;
        exceptedAbsoluteArray[11]=1;
        exceptedAbsoluteArray[12]=1;
        exceptedAbsoluteArray[13]=1;
        exceptedAbsoluteArray[14]=4;
        exceptedAbsoluteArray[15]=2;
        exceptedAbsoluteArray[16]=0;
        exceptedAbsoluteArray[17]=3;
        exceptedAbsoluteArray[18]=0;
        exceptedAbsoluteArray[19]=1;
        exceptedAbsoluteArray[20]=0;
        exceptedAbsoluteArray[21]=1;
        exceptedAbsoluteArray[22]=0;
        exceptedAbsoluteArray[23]=0;
        exceptedAbsoluteArray[24]=1;
        exceptedAbsoluteArray[25]=0;
        assertArrayEquals(instance.getHistogram(), exceptedAbsoluteArray);
    }    
}
