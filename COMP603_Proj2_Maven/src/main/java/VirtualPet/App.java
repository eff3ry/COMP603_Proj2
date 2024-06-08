package VirtualPet;

import java.util.Scanner;
import VirtualPet.Creature.*;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Jeffery & Josh
 */
public class App {

    static Pet pet;

    public static void main(String[] args) {

        printIntoAscii();

        loadOrNew();

        pet.displayStats();
        chooseAction();
    }

    static void loadOrNew() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to load a pet or create a new one?\n1. Load\n2. Create new pet\nType 'x' to exit.");

        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("x")) {
            System.exit(0);
        }

        if (!isInt(choice)) {
            System.out.println("Sorry that is not a valid choice.\nPlease input '1', '2' or 'x'");
            loadOrNew();
            return;
        } else {
            int i = Integer.parseInt(choice);
            switch (i) {
                case 1:
                    choosePetToLoad();
                    break;

                case 2:
                    choosePetToCreate();
                    break;

                default:
                    System.out.println("Sorry that is not a valid choice.\nPlease input '1', '2' or 'x'");
                    loadOrNew();
                    return;
            }
        }
    }

    static void choosePetToLoad() {
        HashMap<String, Pet> petMap = SaverLoader.loadAll();
        String[] keys = new String[0];
        keys = petMap.keySet().toArray(keys);

        choosePetToLoad(petMap, keys);
    }

    static void choosePetToLoad(HashMap<String, Pet> petMap, String[] keys) {
        System.out.println("Please choose a pet to load.\nType 'x' to exit.");

        for (int i = 0; i < keys.length; i++) {
            String name = petMap.get(keys[i]).attributes.getName();
            System.out.println(i + ". " + name);
        }

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("x")) {
            System.exit(0);
        }

        if (!isInt(choice)) {
            System.out.println("Sorry that is not a valid choice.\nPlease input one of the numbers below or type 'x'");
            choosePetToLoad(petMap, keys);
            return;
        } else {
            int i = Integer.parseInt(choice);
            if (i < keys.length) {

                //choose pet
                pet = petMap.get(keys[i]);
                System.out.println("You have chosen " + pet.attributes.getName());

            } else {
                System.out.println("Sorry that is not a valid choice.\nPlease input one of the numbers below or type 'x'");
                choosePetToLoad(petMap, keys);
                return;
            }
        }
    }

    private static boolean isInt(String str) {
        int num;
        try {
            num = Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void printIntoAscii() {
        System.out.println(" _    ___      __              __   ____       __ \n"
                + "| |  / (_)____/ /___  ______ _/ /  / __ \\___  / /_\n"
                + "| | / / / ___/ __/ / / / __ `/ /  / /_/ / _ \\/ __/\n"
                + "| |/ / / /  / /_/ /_/ / /_/ / /  / ____/  __/ /_  \n"
                + "|___/_/_/   \\__/\\__,_/\\__,_/_/  /_/    \\___/\\__/  \n"
                + "                                                  \n"
                + "");
    }

    public static void choosePetToCreate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your pet species (x to exit):");
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
                choosePetToCreate();
                return;
        }
    }

    public static void chooseAction() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an action (x to exit):");
        System.out.println("1. Feed " + pet.attributes.getName());
        System.out.println("2. Give water to " + pet.attributes.getName());
        System.out.println("3. Take " + pet.attributes.getName() + " on a walk");
        System.out.println("4. Take " + pet.attributes.getName() + " to the toilet");
        System.out.println("5. Play with " + pet.attributes.getName());
        
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                pet.feed();
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                
                pet.increaseRandomStat();
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                
                pet.displayStats();
                chooseAction();
                break;
            case "2":
                pet.water();
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                
                pet.increaseRandomStat();
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                
                pet.displayStats();
                chooseAction();
                break;
            case "3":
                pet.walk();
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                
                pet.increaseRandomStat();
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                
                pet.displayStats();
                chooseAction();
                break;
            case "4":
                pet.useToilet();
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                
                pet.increaseRandomStat();
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                
                pet.displayStats();
                chooseAction();
                break;
            case "5":
                pet.play();
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                
                pet.increaseRandomStat();
                System.out.println("Press enter to continue...");
                scanner.nextLine();
                
                pet.displayStats();
                chooseAction();
                break;

            case "x":
                System.out.println("Bye bye!");
                SaverLoader.save(pet);
                System.exit(0);
                break;

            default:
                System.out.println("please enter a valid choice");
                chooseAction();
        }
    }

    public static void checkForExit(String str) {
        if (str.equalsIgnoreCase("x")) {
            //exit
            System.exit(0);
        }
    }

    public static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pet name: ");
        String name = scanner.nextLine();
        return name;
    }
}
