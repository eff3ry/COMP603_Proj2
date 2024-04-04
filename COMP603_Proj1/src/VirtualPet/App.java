package VirtualPet;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jeffery & Josh
 */
public class App {
    public static void main(String[] args) {
        Pet pet = new Pet("test Pet", "cat");    
        pet.needs.hunger = 80;
        printPetMeter(pet.needs.hunger, "Hunger");
    }
   
    
    static void printPetMeter(int value, String attribute)
    {
        String RESET = "\u001B[0m";
        String GREY = "\033[2;30m";
        
        int meterFillAmount = value/10;
        String meterColour;
        
        System.out.print(attribute + ": "+value +"/100 [");
              
        
        for (int i = 0; i < meterFillAmount; i++)
        {
            System.out.print(getMeterColor(i));
            System.out.print("=");
        }
        //System.out.print("|");
        System.out.print(GREY);
        for (int i = 0; i < 10 - meterFillAmount; i++)
        {
            System.out.print("=");
        }
        System.out.println(RESET + "]");
        
    }
    
    private static String getMeterColor(int meterFillAmount) {
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        // Concise color mapping using a switch statement
        return switch (meterFillAmount) {
            case 0, 1, 2, 3 -> GREEN;
            case 4, 5, 6 -> YELLOW;
            default -> RED;
        };
    }
}
