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
public class ResourcesTest {
    
    public ResourcesTest() {
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
     * Test of getFood method, of class Resources.
     */
    @Test
    public void testGetFood() {
        System.out.println("getFood");
        Resources instance = new Resources();
        int expResult = 50;
        int result = instance.getFood();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWater method, of class Resources.
     */
    @Test
    public void testGetWater() {
        System.out.println("getWater");
        Resources instance = new Resources();
        int expResult = 50;
        int result = instance.getWater();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFood method, of class Resources.
     */
    @Test
    public void testSetFood() {
        System.out.println("setFood");
        int food = 30;
        Resources instance = new Resources();
        instance.setFood(food);
        int expResult = food;
        int result = instance.getFood();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWater method, of class Resources.
     */
    @Test
    public void testSetWater() {
        System.out.println("setWater");
        int water = 60;
        Resources instance = new Resources();
        instance.setWater(water);
        int expResult = water;
        int result = instance.getWater();
        assertEquals(expResult, result);
    }

    /**
     * Test of addFood method, of class Resources.
     */
    @Test
    public void testAddFood() {
        System.out.println("addFood");
        int food = 40;
        Resources instance = new Resources();
        instance.addFood(food);
        int expResult = 50 + food;
        int result = instance.getFood();
        assertEquals(expResult, result);
    }

    /**
     * Test of addWater method, of class Resources.
     */
    @Test
    public void testAddWater() {
        System.out.println("addWater");
        int water = 30;
        Resources instance = new Resources();
        instance.addWater(water);
        int expResult = 50 + water;
        int result = instance.getWater();
        assertEquals(expResult, result);
    }
    
}
