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
public class NeedsTest {
    
    public NeedsTest() {
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
     * Test of getThirst method, of class Needs.
     */
    @Test
    public void testGetThirst() {
        System.out.println("getThirst");
        Needs instance = new Needs();
        int expResult = 10;
        int result = instance.getThirst();
        assertEquals(expResult, result);

    }

    /**
     * Test of setThirst method, of class Needs.
     */
    @Test
    public void testSetThirst() {
        System.out.println("setThirst");
        int thirst = 50;
        Needs instance = new Needs();
        instance.setThirst(thirst);
        assertEquals(50, instance.getThirst());
    }

    /**
     * Test of modifyThirst method, of class Needs.
     */
    @Test
    public void testModifyThirst() {
        System.out.println("modifyThirst");
        int amount = 20;
        Needs instance = new Needs();
        instance.modifyThirst(amount);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(30, instance.getThirst());
    }

    /**
     * Test of getHunger method, of class Needs.
     */
    @Test
    public void testGetHunger() {
        System.out.println("getHunger");
        Needs instance = new Needs();
        int expResult = 10;
        int result = instance.getHunger();
        assertEquals(expResult, result);

    }

    /**
     * Test of setHunger method, of class Needs.
     */
    @Test
    public void testSetHunger() {
        System.out.println("setHunger");
        int hunger = 80;
        Needs instance = new Needs();
        instance.setHunger(hunger);
        assertEquals(80, instance.getHunger());
    }

    /**
     * Test of modifyHunger method, of class Needs.
     */
    @Test
    public void testModifyHunger() {
        System.out.println("modifyHunger");
        int amount = 30;
        Needs instance = new Needs();
        instance.modifyHunger(amount);
        assertEquals(40, instance.getHunger());
    }

    /**
     * Test of getBladder method, of class Needs.
     */
    @Test
    public void testGetBladder() {
        System.out.println("getBladder");
        Needs instance = new Needs();
        int expResult = 0;
        int result = instance.getBladder();
        assertEquals(expResult, result);

    }

    /**
     * Test of setBladder method, of class Needs.
     */
    @Test
    public void testSetBladder() {
        System.out.println("setBladder");
        int bladder = 70;
        Needs instance = new Needs();
        instance.setBladder(bladder);
        assertEquals(bladder, instance.getBladder());
    }

    /**
     * Test of modifyBladder method, of class Needs.
     */
    @Test
    public void testModifyBladder() {
        System.out.println("modifyBladder");
        int amount = 40;
        Needs instance = new Needs();
        instance.modifyBladder(amount);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(40, instance.getBladder());
    }

    /**
     * Test of getExercise method, of class Needs.
     */
    @Test
    public void testGetExercise() {
        System.out.println("getExercise");
        Needs instance = new Needs();
        int expResult = 0;
        int result = instance.getExercise();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setExercise method, of class Needs.
     */
    @Test
    public void testSetExercise() {
        System.out.println("setExercise");
        int exercise = 50;
        Needs instance = new Needs();
        instance.setExercise(exercise);
        assertEquals(50, instance.getExercise());
    }

    /**
     * Test of modifyExercise method, of class Needs.
     */
    @Test
    public void testModifyExercise() {
        System.out.println("modifyExercise");
        int amount = 40;
        Needs instance = new Needs();
        instance.modifyExercise(amount);
        assertEquals(40, instance.getExercise());
    }
    
}
