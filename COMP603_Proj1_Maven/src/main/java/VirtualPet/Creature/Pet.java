/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Creature;

/**
 *
 * @author jeffe
 */
public abstract class Pet {
    
    Attributes attributes;
    Resources resources;
    Needs needs;
    
    public Pet(String name, String species){
        attributes = new Attributes();
        resources = new Resources();
        needs = new Needs();
        
        this.attributes.name = name;
        this.attributes.species = species;
        
        resources.initResources();
        needs.initNeeds();
    }
    
    //constuctor for loading from file;
    public Pet(Attributes attributes, Resources resources, Needs needs)
    {
        this.attributes = attributes;
        this.resources = resources;
        this.needs = needs;
    }
    
        
    abstract public void feed();
    abstract protected void eat();
    
    abstract public void water();
    abstract protected void drink();
    
    public abstract void walk();
    public abstract void useToilet();
    public abstract void play();
        
    public abstract void behaviour();
    
    public void updateSadness() {
        int highestNeed = Math.max(needs.hunger, Math.max(needs.exercise, needs.bladder));
        if (highestNeed >= 100) {
            attributes.sadness += 10;
        }
    }
    
    public boolean isHappy() {
        return attributes.sadness < 100;
    }
    
    public void displayStats() {
        System.out.println("Name: " + attributes.name);
        System.out.println("Species: " + attributes.species);
        System.out.println("Needs ↴");
        printPetMeter(needs.thirst, "Thirst", false);
        printPetMeter(needs.hunger, "Hunger", false);
        printPetMeter(needs.exercise, "Exercise", false);
        printPetMeter(needs.bladder, "Bladder", false);
        printPetMeter(attributes.sadness, "Sandness", false);
        //System.out.println("Thirst: " + thirst);
        //System.out.println("Hunger: " + hunger);
        //System.out.println("Exercise: " + exercise);
        //System.out.println("Bladder: " + bladder);
        //System.out.println("Sadness: "  + sadness);
        System.out.println("Resources ↴");
        printPetMeter(resources.food, "Food", true);
        printPetMeter(resources.water, "Water", true);
    }
    
    //Method by jeffery
    private static void printPetMeter(int value, String attribute, boolean negative) {
        String RESET = "\u001B[0m";
        String GREY = "\033[2;30m";

        int meterFillAmount = value / 10;

        System.out.print(attribute + ": " + value + "/100 [");

        for (int i = 0; i < meterFillAmount; i++) {
            System.out.print(getMeterColor(i, negative));
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
    private static String getMeterColor(int meterFillAmount, boolean negative) {
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        meterFillAmount = negative? 10 - meterFillAmount : meterFillAmount;
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
