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
public class CatTest {
    

    
    public CatTest() {
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
     * Test of feed method, of class Cat.
     */
    @Test
    public void testFeed() {
        System.out.println("feed");
        Cat instance = new Cat("Meow");  
        int hungerBefore = instance.needs.getHunger();
        int foodBefore = instance.resources.getFood();
        instance.feed();
        int hungerAfter = instance.needs.getHunger();
        int foodAfter = instance.resources.getFood();

        assertEquals(hungerBefore-10, hungerAfter);
        assertEquals(foodBefore-10, foodAfter);
    }

    /**
     * Test of water method, of class Cat.
     */
    @Test
    public void testWater() {
        System.out.println("water");
        Cat instance = new Cat("Meow");  
        int thirstBefore = instance.needs.getThirst();
        int waterBefore = instance.resources.getWater();
        instance.water();
        int thirstAfter = instance.needs.getThirst();
        int waterAfter = instance.resources.getWater();

        assertEquals(thirstBefore-10, thirstAfter);
        assertEquals(waterBefore-10, waterAfter);
    }

    /**
     * Test of walk method, of class Cat.
     */
    @Test
    public void testWalk() {
        System.out.println("walk");
        Cat instance = new Cat("Meow");  
        int exerciseBefore = instance.needs.getExercise();
        instance.walk();
        int exerciseAfter = instance.needs.getExercise();
        assertEquals(exerciseBefore, exerciseAfter);
    }

    /**
     * Test of useToilet method, of class Cat.
     */
    @Test
    public void testUseToilet() {
        System.out.println("useToilet");
        Cat instance = new Cat("Meow");  
        assertEquals(0, instance.needs.getBladder());
        //bladder starts at 0
        instance.water();
        assertEquals(10, instance.needs.getBladder());
        
        
        int bladderBefore = instance.needs.getBladder();

        instance.useToilet();
        int bladderAfter = instance.needs.getBladder();

        assertEquals(bladderBefore-10, bladderAfter);

    }

    /**
     * Test of play method, of class Cat.
     */
    @Test
    public void testPlay() {
        System.out.println("walk");
        Cat instance = new Cat("Meow"); 
        instance.needs.setExercise(30);
        
        
        int exerciseBefore = instance.needs.getExercise();
        instance.play();
        int exerciseAfter = instance.needs.getExercise();
        assertEquals(exerciseBefore-10, exerciseAfter);
    }
    
}
