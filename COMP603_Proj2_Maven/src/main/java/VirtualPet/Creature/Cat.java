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
            needs.modifyHunger(-10);
            resources.addFood(-10);
            if (needs.getHunger() < 0) {
                needs.setHunger(0);
            }
            if (resources.getFood() < 0) {
                resources.setFood(0);
            }
        }

    }
    


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
            if (resources.getWater() < 0) {
                resources.setWater(0);
            }
        }

    }



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
            System.out.println("You played with " + attributes.getName() + " exersise went down by 10");
            Random r = new Random();

            int i = r.nextInt(5);
            if (i == 0 && needs.getHunger() <=90) {
                System.out.println(attributes.getName() + " found 10 food!");
                
                resources.addFood(10);
            }
            if (i == 1 && needs.getThirst() <=90) {
                System.out.println(attributes.getName() + " found 10 water!");
                resources.addWater(10);
            }

            needs.modifyExercise(-10);
            if (needs.getExercise() < 0) {
                needs.setExercise(0);
            }
        }
    }
}
