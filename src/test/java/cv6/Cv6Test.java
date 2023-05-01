package cv6;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;



import static org.junit.Assert.fail;

public class Cv6Test {
    
    public Cv6Test() {
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
     * Test of main method, of class Ukol6.
     */
    static Path createTempPath(String fileName, String extension) throws IOException {
        Path tempPath = Files.createTempFile(fileName, extension);
        tempPath.toFile().deleteOnExit();
        
        return tempPath;
    }


    @Test
    public void testMain() throws IOException  {
        System.out.println("main");
        CodeCleaner c = new CodeCleaner();        
        c.clean("Trojuhelnik.java","Trojuhelnik - final.java");
        
        
        Path expected = Path.of("Trojuhelnik - expected.java");
        Path toTest = Path.of("Trojuhelnik - final.java");
        
        long mismatch = Files.mismatch(toTest, expected);
        if (mismatch !=-1){
            fail("Soubory nejsou stejne");
        }
    }
    
}
