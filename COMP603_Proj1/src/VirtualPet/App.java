package VirtualPet;

import java.util.Scanner;



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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Digital Pet Paradise!");
        System.out.println("Please select an option:");
        
        //TODO - some shit to do with species selection :skull:
        //System.out.println("1. " + );
        //System.out.println("2. " + option2);
        //System.out.println("3. " + option3);
        //System.out.println("4. " + option4);

        int choice;
        String userInput;

        do {
          System.out.print("Enter your choice (1-4): ");
          choice = scanner.nextInt();
        } while (choice < 1 || choice > 4); 

        System.out.print("Enter a string: ");
        userInput = scanner.nextLine();
        scanner.nextLine(); 

       // return userInput;
        
        
        
        
        //Pet pet = new Pet("test Pet", "cat");    
        //pet.needs.hunger = 80;
        //printPetMeter(pet.needs.hunger, "Hunger");
        //pet.needs.thirst = 30;
        //printPetMeter(pet.needs.thirst, "Thirst");
       // pet.needs.sadness = 10;
        //printPetMeter(pet.needs.sadness, "Sadness");
    }
   
    
    static void printPetMeter(int value, String attribute)
    {
        String RESET = "\u001B[0m";
        String GREY = "\033[2;30m";
        
        int meterFillAmount = value/10;
        
        
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
