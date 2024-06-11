/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package VirtualPet.Creature;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeffe
 */
public class AttributesTest {
    
    public AttributesTest() {
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
     * Test of getName method, of class Attributes.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Attributes instance = new Attributes("name", "species");
        String expResult = "name";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSpecies method, of class Attributes.
     */
    @Test
    public void testGetSpecies() {
        System.out.println("getSpecies");
        Attributes instance = new Attributes("name", "species");
        String expResult = "species";
        String result = instance.getSpecies();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSadness method, of class Attributes.
     */
    @Test
    public void testGetSadness() {
        System.out.println("getSadness");
        Attributes instance = new Attributes("Name", "species");
        int expResult = 50;
        int result = instance.getSadness();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSadness method, of class Attributes.
     */
    @Test
    public void testSetSadness() {
        System.out.println("setSadness");
        int sadness = 70;
        Attributes instance = new Attributes("Name", "species");;
        instance.setSadness(sadness);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.getSadness(), sadness);
    }

    /**
     * Test of addSadness method, of class Attributes.
     */
    @Test
    public void testAddSadness() {
        System.out.println("addSadness");
        int num = 30;
        Attributes instance = new Attributes("Name", "species");;
        instance.addSadness(num);
        assertEquals(instance.getSadness(), num+50);

    }
    
}
