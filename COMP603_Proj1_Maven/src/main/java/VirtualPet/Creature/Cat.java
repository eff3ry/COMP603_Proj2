/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Creature;


/**
 *
 * @author jeffe
 */
public class Cat extends Pet{

    public Cat(String name){
        super(name, "Cat");
    }
    
    //Constructor for loading from file
    public Cat(Attributes attributes, Resources resources, Needs needs)
    {
        super(attributes, resources, needs);
    }
    
    
    @Override
    public void feed() {
        if(resources.getFood() == 0) {
            System.out.println("You have no food! Try playing with your pet to earn food!");
        }
        if(needs.getHunger() == 0) {
            System.out.println(attributes.getName() + " is not hungry!");
        }
        else {
            System.out.println(attributes.getName() + " ate food! -10 hunger, -10 food");
            needs.modifyHunger( - (10 + (10 - attributes.pickiness)));
            resources.addFood((-10 - (10 - attributes.pickiness)));
            if (needs.getHunger() < 0) {
                needs.setHunger(0);
            }
        }

    }
    

//    @Override
//    protected void eat() {
//        needs.hunger -= (10 + (10 - attributes.pickiness));
//        resources.addFood((-10 - (10 - attributes.pickiness)));
//    }

    @Override
    public void water() {
        if(resources.getWater() == 0) {
            System.out.println("You have no water! Try playing with your pet to earn water!");
        }
        if(needs.getThirst() == 0) {
            System.out.println(attributes.getName() + " is not thirsty!");
        }
        else {
            System.out.println(attributes.getName() + " drank water! -10 thirst, -10 water");
            needs.modifyThirst(-10);
            resources.addWater(-10);
            needs.modifyBladder(10);
            if (needs.getThirst() < 0) {
                needs.setThirst(0);
            }
        }

    }

//    @Override
//    protected void drink() {
//        
//    }

    @Override
    public void walk() {
        System.out.println(attributes.getName() + " doesnt like going on walks..\nExercise unchanged.");
        
    }

    @Override
    public void useToilet() {
        
        if(needs.getBladder() > 0) {
            System.out.println(attributes.getName() + " went to the toilet!");
            needs.setBladder(0);
        }
        
        else {
            System.out.println(attributes.getName() + "has an empty bladder!\nBladder unchanged");
        }
        
    }

    @Override
    public void play() {
        if(needs.getExercise() == 0) {
            System.out.println(attributes.getName()+" does not want to play!");
        }
        else {
            System.out.println("You played with " + attributes.getName());
            int rand1 = (int) (Math.random() * 10);
            if (rand1 == 0) {
                System.out.println(attributes.getName() + " found 10 food!");
                resources.addFood(10);
            }
            if (rand1 == 1) {
                System.out.println(attributes.getName() + " found 10 water!");
                resources.addWater(10);
            }

            needs.modifyExercise(-(10 + (10 - attributes.likesBeingPetted)));
            if (needs.getExercise() < 0) {
                needs.setExercise(0);
            }
        }
    }

//    @Override
//    public void behaviour() {
//        int mostUrgentNeed = Math.max(needs.hunger, Math.max(needs.thirst, needs.bladder));
//        
//        if (mostUrgentNeed == needs.hunger)
//        {
//            eat();
//            System.out.println(attributes.getName() + " was hungry and ate.");
//        } else if (mostUrgentNeed == needs.thirst)
//        {
//            drink();
//            System.out.println(attributes.getName() + " was thirsty and drank.");
//        } else if (mostUrgentNeed == needs.bladder)
//        {
//            System.out.println(attributes.getName() + " really needs to pee and can't do anything until you take them to the litterbox");
//        }
//    } 
}
