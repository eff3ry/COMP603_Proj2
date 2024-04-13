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
        
        printIntoAscii();
        
        choosePet();
        pet.displayStats();
        chooseAction();
        
        Pet pet1 = new Cat(new Attributes("skibidi", "alpha"), new Resources(), new Needs());
        SaverLoader.save(pet1);
        
    }
    
    public static void printIntoAscii()
    {
        System.out.println(" _    ___      __              __   ____       __ \n" +
        "| |  / (_)____/ /___  ______ _/ /  / __ \\___  / /_\n" +
        "| | / / / ___/ __/ / / / __ `/ /  / /_/ / _ \\/ __/\n" +
        "| |/ / / /  / /_/ /_/ / /_/ / /  / ____/  __/ /_  \n" +
        "|___/_/_/   \\__/\\__,_/\\__,_/_/  /_/    \\___/\\__/  \n" +
        "                                                  \n" +
        "");
    }

    public static void choosePet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your pet (x to exit):");
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
        System.out.println("Select an action (x to exit):");
        System.out.println("1. Feed " + pet.attributes.getName());
        System.out.println("2. Give water to " + pet.attributes.getName());
        System.out.println("3. Take " + pet.attributes.getName() +" on a walk");
        System.out.println("4. Take "+pet.attributes.getName()+" to the toilet");
        System.out.println("5. Play with "+pet.attributes.getName());
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                pet.feed();
                pet.displayStats();
                chooseAction();
                break;
            case "2":
                pet.water();
                pet.displayStats();
                chooseAction();
                break;
            case "3":
                pet.walk();
                pet.displayStats();
                chooseAction();
                break;
            case "4":
                pet.useToilet();
                pet.displayStats();
                chooseAction();
                break;
            case "5":
                pet.play();
                pet.displayStats();
                chooseAction();
                break;
                
                
            case "x":
                System.out.println("Bye bye!");
                //SaverLoader.save(pet);
                System.exit(0);
                break;
            
            default:
                System.out.println("please enter a valid choice");
                chooseAction();
        }
    }
    
    public static void checkForExit() {
        
    }
    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pet name: ");
        String name = scanner.nextLine();
        return name;
    }
}
