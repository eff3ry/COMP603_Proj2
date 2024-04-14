/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Creature;

import java.util.Random;

/**
 *
 * @author jeffe
 */
public abstract class Pet {
    
    public Attributes attributes;
    public Resources resources;
    public Needs needs;
    
    public String saveLoadID; //folder name??
    
    public Pet(String name, String species){
        attributes = new Attributes(name, species);
        resources = new Resources();
        needs = new Needs();   
    }
    
    //constuctor for loading from file;
    public Pet(Attributes attributes, Resources resources, Needs needs)
    {
        this.attributes = attributes;
        this.resources = resources;
        this.needs = needs;
    }
    
        
    abstract public void feed();
    //abstract protected void eat();
    
    abstract public void water();
    //abstract protected void drink();
    
    public abstract void walk();
    public abstract void useToilet();
    public abstract void play();
    
    //public abstract void behaviour();
    
    public void updateSadness() {
        int highestNeed = Math.max(needs.getHunger(), Math.max(needs.getExercise(), needs.getBladder()));
        if (highestNeed == 100) {
            attributes.addSadness(10);
        }
    }
    public void updateStats() {
        Random r = new Random();

        int i = r.nextInt(3);
        if (i == 0) {
            needs.modifyHunger(10);
            System.out.println("Hunger increased by 10");
        }
        if(i == 1) {
            needs.modifyThirst(10);
            System.out.println("Thirst increased by 10");
        }
        if(i == 2) {
            needs.modifyExercise(10);
            System.out.println("Exercise increased by 10");
        }
    }
    public boolean isHappy() {
        return attributes.getSadness() < 100;
    }
    
    public void displayStats() {
        if(isHappy() == false) {
            System.out.println(attributes.getName() +" ran away because it was too sad! Be a better owner next time!");
            System.exit(1);
        }
        updateSadness();
        updateStats();
        System.out.println("Name: " + attributes.getName());
        System.out.println("Species: " + attributes.getSpecies());
        System.out.println("Needs ->");
        printPetMeter(needs.getThirst(), "Thirst", false);
        printPetMeter(needs.getHunger(), "Hunger", false);
        printPetMeter(needs.getExercise(), "Exercise", false);
        printPetMeter(needs.getBladder(), "Bladder", false);
        printPetMeter(attributes.getSadness(), "Sadness", false);
        System.out.println("Resources ->");
        printPetMeter(resources.getFood(), "Food", true);
        printPetMeter(resources.getWater(), "Water", true);
    }
    
    //Method by jeffery
    private static void printPetMeter(int value, String attribute, boolean flipColours) {
        String RESET = "\u001B[0m";
        String GREY = "\033[2;30m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        String[] needsColours = new String[]{GREEN,GREEN,GREEN,YELLOW,YELLOW,YELLOW,YELLOW,RED,RED,RED}; 
        String[] resourcesColours = new String[]{RED,RED,YELLOW,YELLOW,GREEN,GREEN,GREEN,GREEN,GREEN,GREEN}; 
        
        String[] colours = flipColours? resourcesColours : needsColours;
        
        int meterFillAmount = value / 10;

        System.out.print(attribute + ": " + value + "/100 [");

        for (int i = 0; i < meterFillAmount; i++) {
            System.out.print(colours[i]);
            System.out.print("=");
        }
        //System.out.print("|");
        System.out.print(GREY);
        for (int i = 0; i < 10 - meterFillAmount; i++) {
            System.out.print("=");
        }
        System.out.println(RESET + "]");
    }
}
