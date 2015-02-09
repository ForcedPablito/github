/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comounpiano;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vesprada
 */
public class ComoUnPianoTest {
    
    public ComoUnPianoTest() {
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
     * Test of inicializa method, of class ComoUnPiano.
     */
    /*@Test
    
    public void testInicializa() {
        System.out.println("inicializa");
        int[] a = {5,5,5,5,5};
        ComoUnPiano instance = new ComoUnPiano();
        instance.inicializa(a);
        // TODO review the generated test code and remove the default call to fail.
        
    }
*/
    /**
     * Test of ordenar method, of class ComoUnPiano.
     */
    @Test
    public void testOrdenar() {
        System.out.println("ordenar");
        int[] a = {5,5,5,5,5};
        ComoUnPiano instance = new ComoUnPiano();
        int[] expResult = {5,5,5,5,5};
        int[] result = instance.ordenar(a);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of maximo method, of class ComoUnPiano.
     */
    @Test
    public void testMaximo() {
        System.out.println("maximo");
        int[] a = {5,5,5,5,5};
        ComoUnPiano instance = new ComoUnPiano();
        int expResult = 5;
        int result = instance.maximo(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of minimo method, of class ComoUnPiano.
     */
    @Test
    public void testMinimo() {
        System.out.println("minimo");
        int[] a = {5,5,5,5,5};
        ComoUnPiano instance = new ComoUnPiano();
        int expResult = 5;
        int result = instance.minimo(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of media method, of class ComoUnPiano.
     */
    @Test
    public void testMedia() {
        System.out.println("media");
        int[] a = {5,5,5,5,5};
        ComoUnPiano instance = new ComoUnPiano();
        double expResult = 5.0;
        double result = instance.media(a);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of igual method, of class ComoUnPiano.
     */
    @Test
    public void testIgual() {
        System.out.println("igual");
        int[] a = {5,5,5,5,5};
        int[] b = {5,5,5,5,5};
        ComoUnPiano instance = new ComoUnPiano();
        boolean expResult = false;
        boolean result = instance.igual(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of palidrom method, of class ComoUnPiano.
     */
    @Test
    public void testPalidrom() {
        System.out.println("palidrom");
        int[] a = {5,5,5,5,5};
        ComoUnPiano instance = new ComoUnPiano();
        boolean expResult = true;
        boolean result = instance.palidrom(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class ComoUnPiano.
     */
    /**
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ComoUnPiano.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    */
}
