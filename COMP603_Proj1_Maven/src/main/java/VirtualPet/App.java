package VirtualPet;

import java.util.Scanner;
import VirtualPet.Creature.*;
/**
 *
 * @author Jeffery & Josh
 */
public class App {

    static Pet pet;
    
    public static void main(String[] args) {
        
        choosePet();
        pet.displayStats();
        chooseAction();
        
        //Pet pet1 = new Cat(new Attributes(), new Resources(), new Needs());
        
    }
 

    public static void choosePet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your pet:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Hamster");
        System.out.println("4. Rabbit");
        String choice = scanner.nextLine();

        
        switch (choice) {
            case "1":
                pet = new Dog(getName());
                break;
            case "2":
                pet = new Cat(getName());
                break;
            case "3":
                pet = new Hamster(getName());
                break;
            case "4":
                pet = new Rabbit(getName());
                break;
            default:
                System.out.println("please enter a valid choice");
                choosePet();
        }
    }
    
    
    public static void chooseAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an action:");
        System.out.println("1. Feed " + pet.attributes.getName());
        System.out.println("2. Give water to " + pet.attributes.getName());
        System.out.println("3. Take " + pet.attributes.getName() +" on a walk");
        System.out.println("4. Take "+pet.attributes.getName()+"to the toilet");
        System.out.println("5. Play with "+pet.attributes.getName());
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                pet.feed();
            case "2":
                pet.water();
            case "3":
                pet.walk();
            case "4":
                pet.useToilet();
            case "5":
                pet.play();
            default:
                System.out.println("please enter a valid choice");
                chooseAction();
        }
    }
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pet name: ");
        String name = scanner.nextLine();
        return name;
    }

    //test();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to the Digital Pet Paradise!");
//        System.out.println("Please select an option:");
//        
//        //TODO - some shit to do with species selection :skull:
//        System.out.println("1. Dog");
//        System.out.println("2. Cat");
//        System.out.println("3. Hamster");
//        System.out.println("4. Rabbit");
//
//        String choice;
//        String userInput;
//
//        
//        System.out.print("Enter your choice (1-4): ");
//        switch(choice) {
//            case "Dog","dog":
//              choice = "Dog";
//              break;
//            case "Cat", "cat":
//              choice = "Cat";
//              break;
//            case "Hamster", "hamster":
//              choice = "Hamster";
//              break;
//            case "Rabbit", "rabbit":
//              choice = "Rabbit";
//              break;
//            default:
//              System.out.print("Please enter a valid Species.");
//          }
    //System.out.print("Enter a name: ");
    //userInput = scanner.nextLine();
    //scanner.nextLine();
    //Pet pet = new Pet(choice, userInput);   
//        Pet pet = new Pet("test Pet", "cat");    
//        pet.needs.hunger = 80;
//        printPetMeter(pet.needs.hunger, "Hunger");
//        pet.needs.thirst = 30;
//        printPetMeter(pet.needs.thirst, "Thirst");
//        pet.needs.sadness = 10;
//        printPetMeter(pet.needs.sadness, "Sadness");
    
    
    

//    private static void test() {
//        Pet pet = new Pet("heheha", "Cat");
//        Pet[] pets = new Pet[1];
//        pets[0] = pet;
//        
//        SaverLoader.save(pets);
//    }
}
