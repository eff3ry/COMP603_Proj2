/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet;

import java.util.Random;



/**
 *
 * @author jeffe
 */


public class Pet {
    String name;
    
    int health;
    
    //Hunger Attributes 0-100, these are 'negative' attributes so the lower the better
    //could display a low value as green, mid value as orange and high value as red
    int thirst;
    int hunger;
    
    int age;
    int weight;
    int strength;
    
    int happiness; //angry, sad, happy etc
    int friendliness; //rename to sociability??
    
    int exercise;
    
    int pickiness; //how picky it is with food
    int laziness; // how lazy/active
    int likesBeingPetted;
            
    //Resources 0-100
    int foodInBowl;
    int waterInBowl;
   
    static Random rand = new Random();   
    
    //Pet Creation
    public Pet(String name)
    {
        this.name = name;
        initResources();
        initNeeds();
    }
    
    private void initResources()
    {
        foodInBowl = 50;
        waterInBowl = 50;
    }
    
    private void initNeeds()
    {
        hunger = 50;
        thirst = 50;
    }
    
    
    public void tickTime()
    {
        //Increase thirst
        thirst += rand.nextInt(0, 10);
        thirst = thirst > 100 ? 100 : thirst; //cap at 100
        //Increase hunger
        hunger += rand.nextInt(0, 10);
        hunger = hunger > 100 ? 100 : hunger; //cap at 100
    }
    
    private boolean canEat()
    {
        return hunger > 0 && foodInBowl > 0;
    }
    
    private boolean canDrink()
    {
        return thirst > 0 && waterInBowl > 0;
    }
        
    
    private void eatAction()
    {
        int eatAmmount = Math.min(hunger, foodInBowl); // clamp eat ammount to needs/foodinbowl
        eatAmmount = Math.min(rand.nextInt(10, 20), eatAmmount); // now apply random ammount clamped
         
        hunger -= eatAmmount;
        foodInBowl -= eatAmmount; 
    }
    
    
    /**
     * @param amount the amount to fill the bowl by
     * @return amount past max value (100)
     */
    private int fillFoodBowl(int amount)
    {
        if (foodInBowl + amount > 100)
        {   
            int oldVal = foodInBowl;
            foodInBowl = 100;
            return oldVal + amount - 100;
        } else {
            foodInBowl += amount;
            return 0;
        }
    }
}
