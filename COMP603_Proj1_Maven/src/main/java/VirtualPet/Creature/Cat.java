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
        
        resources.addFood(10);
    }
    

    @Override
    protected void eat() {
        needs.hunger -= (10 + (10 - attributes.pickiness));
        resources.addFood((-10 - (10 - attributes.pickiness)));
    }

    @Override
    public void water() {
        resources.addWater(10);
    }

    @Override
    protected void drink() {
        needs.thirst -= 10;
        resources.addWater(-10);
    }

    @Override
    public void walk() {
        System.out.println(attributes.getName() + " doesnt like going on walks..\nExercise unchanged.");
        
    }

    @Override
    public void useToilet() {
        if(needs.bladder >= 10) {
            needs.bladder -= 10;
        }
        if (needs.bladder > 0 && needs.bladder < 10) {
            
        }
        else {
            System.out.println(attributes.getName() + "has an empty bladder!\nBladder unchanged");
        }
        
    }

    @Override
    public void play() {
        if(needs.exercise == 0) {
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

            needs.exercise -= (10 + (10 - attributes.laziness));
            if (needs.exercise < 0) {
                needs.exercise = 0;
            }
        }
    }

    @Override
    public void behaviour() {
        int mostUrgentNeed = Math.max(needs.hunger, Math.max(needs.thirst, needs.bladder));
        
        if (mostUrgentNeed == needs.hunger)
        {
            eat();
            System.out.println(attributes.getName() + " was hungry and ate.");
        } else if (mostUrgentNeed == needs.thirst)
        {
            drink();
            System.out.println(attributes.getName() + " was thirsty and drank.");
        } else if (mostUrgentNeed == needs.bladder)
        {
            System.out.println(attributes.getName() + " really needs to pee and can't do anything untill you take them to the litterbox");
        }
    } 
}
