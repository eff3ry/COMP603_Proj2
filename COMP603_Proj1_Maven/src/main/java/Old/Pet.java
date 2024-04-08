/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Old;

import java.util.Random;



/**
 *
 * @author jeffe
 */

//josh made this epic freaking class :sunglasses:
//OVERVIEW
//The pet
public abstract class Pet {
    protected String name;
    protected String species;
    protected int thirst;
    protected int hunger;
    protected int exercise;
    protected int bladder;
    protected int sadness;
    protected int laziness;
    protected int pickiness;
    protected int likesBeingPetted;
    
    

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
        thirst = 50;
        hunger = 50;
        exercise = 50;
        bladder = 50;
        sadness = 50;
        laziness = (int) (Math.random() * 10) + 1;
        pickiness = (int) (Math.random() * 10) + 1;
        likesBeingPetted = (int) (Math.random() * 10) + 1;
    }

    public abstract void feed();

    public abstract void water();

    public abstract void walk();

    public abstract void useToilet();

    public abstract void play();

    public void updateSadness() {
        if (thirst >= 100 || hunger >= 100 || exercise >= 100 || bladder >= 100) {
            sadness += 10;
        }
    }

    public boolean isHappy() {
        return sadness < 100;
    }

    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Needs:");
        printPetMeter(thirst, "Thirst");
        printPetMeter(hunger, "Hunger");
        printPetMeter(exercise, "Exercise");
        printPetMeter(bladder, "Bladder");
        printPetMeter(sadness, "Sandness");
        //System.out.println("Thirst: " + thirst);
        //System.out.println("Hunger: " + hunger);
        //System.out.println("Exercise: " + exercise);
        //System.out.println("Bladder: " + bladder);
        //System.out.println("Sadness: "  + sadness);
        System.out.println("Resources:");
        
    }
    
    //Method by jeffery
    private static void printPetMeter(int value, String attribute) {
        String RESET = "\u001B[0m";
        String GREY = "\033[2;30m";

        int meterFillAmount = value / 10;

        System.out.print(attribute + ": " + value + "/100 [");

        for (int i = 0; i < meterFillAmount; i++) {
            System.out.print(getMeterColor(i));
            System.out.print("=");
        }
        //System.out.print("|");
        System.out.print(GREY);
        for (int i = 0; i < 10 - meterFillAmount; i++) {
            System.out.print("=");
        }
        System.out.println(RESET + "]");

    }

    //Method by jeffery
    private static String getMeterColor(int meterFillAmount) {
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        // Concise color mapping using a switch statement
        return switch (meterFillAmount) {
            case 0, 1, 2, 3 ->
                GREEN;
            case 4, 5, 6 ->
                YELLOW;
            default ->
                RED;
        };
    }
}

//public class Pet {
//    
//    public String name;
//    public String species;
//    
//    int health;
//    int age;
//    int weight;
//    int strength;
//    
//    
//    
//    
//    int pickiness; //how picky it is with food
//    int laziness; // how lazy/active
//    int likesBeingPetted;
//            
//    static Random rand = new Random();   
//    
//    PetNeeds needs = new PetNeeds();
//    PetResources resources = new PetResources();
//    
//    //Pet Creation
//    public Pet(String name, String species)
//    {
//        this.name = name;
//        this.species = species;
//        resources.initResources();
//        needs.initNeeds();
//    }
//    
//    
//    
//    public void statGen() {
//        pickiness = rand.nextInt(11);
//        laziness = rand.nextInt(11);
//        likesBeingPetted = rand.nextInt(11);
//        
//    }
//    public void tickTime()
//    {
//        //Increase thirst
//        needs.thirst += rand.nextInt(0, 10);
//        needs.thirst = needs.thirst > 100 ? 100 : needs.thirst; //cap at 100
//        //Increase hunger
//        needs.hunger += rand.nextInt(0, 10);
//        needs.hunger = needs.hunger > 100 ? 100 : needs.hunger; //cap at 100
//    }
//   
//    private boolean canEat()
//    {
//        return needs.hunger > 0 && resources.foodInBowl > 0;
//    }
//   
//   private boolean canDrink()
//    {
//        return needs.thirst > 0 && resources.waterInBowl > 0;
//    }
//       
//    
//    private void eatAction()
//    {
//       int eatAmmount = Math.min(needs.hunger, resources.foodInBowl); // clamp eat ammount to needs/foodinbowl
//        eatAmmount = Math.min(rand.nextInt(10, 20), eatAmmount); // now apply random ammount clamped
//         
//        needs.hunger -= eatAmmount;
//       resources.foodInBowl -= eatAmmount; 
//    }
//   
//    private void deathAction() {
//        if(needs.hunger == 100 || needs.thirst == 100) {
//            
//        }
//        
//    }
//    /**
//     * @param amount the amount to fill the bowl by
//     * @return amount past max value (100)
//     */
//    private int fillFoodBowl(int amount)
//    {
//        if (resources.foodInBowl + amount > 100)
//        {   
//            int oldVal = resources.foodInBowl;
//            resources.foodInBowl = 100;
//            return oldVal + amount - 100;
//        } else {
//            resources.foodInBowl += amount;
//            return 0;
//        }
//    }
//}