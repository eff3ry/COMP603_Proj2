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
    String species;
    
    int age;
    int weight;
    int strength;
    
    int happiness; //angry, sad, happy etc
    
    
    int pickiness; //how picky it is with food
    int laziness; // how lazy/active
    int likesBeingPetted;
            
    static Random rand = new Random();   
    
    PetNeeds needs = new PetNeeds();
    PetResources resources = new PetResources();
    
    //Pet Creation
    public Pet(String name, String species)
    {
        this.name = name;
        resources.initResources();
        needs.initNeeds();
    }
    
    
    
    public void statGen() {
        pickiness = rand.nextInt(11);
        laziness = rand.nextInt(11);
        likesBeingPetted = rand.nextInt(11);
        
    }
    public void tickTime()
    {
        //Increase thirst
        needs.thirst += rand.nextInt(0, 10);
        needs.thirst = needs.thirst > 100 ? 100 : needs.thirst; //cap at 100
        //Increase hunger
        needs.hunger += rand.nextInt(0, 10);
        needs.hunger = needs.hunger > 100 ? 100 : needs.hunger; //cap at 100
    }
    
    private boolean canEat()
    {
        return needs.hunger > 0 && resources.foodInBowl > 0;
    }
    
    private boolean canDrink()
    {
        return needs.thirst > 0 && resources.waterInBowl > 0;
    }
        
    
    private void eatAction()
    {
        int eatAmmount = Math.min(needs.hunger, resources.foodInBowl); // clamp eat ammount to needs/foodinbowl
        eatAmmount = Math.min(rand.nextInt(10, 20), eatAmmount); // now apply random ammount clamped
         
        needs.hunger -= eatAmmount;
        resources.foodInBowl -= eatAmmount; 
    }
    
    private void deathAction() {
        if(needs.hunger == 100 || needs.thirst == 100) {
            
        }
        
    }
    /**
     * @param amount the amount to fill the bowl by
     * @return amount past max value (100)
     */
    private int fillFoodBowl(int amount)
    {
        if (resources.foodInBowl + amount > 100)
        {   
            int oldVal = resources.foodInBowl;
            resources.foodInBowl = 100;
            return oldVal + amount - 100;
        } else {
            resources.foodInBowl += amount;
            return 0;
        }
    }
}
