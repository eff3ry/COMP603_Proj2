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
        
        resources.food += 10;
    }

    @Override
    protected void eat() {
        needs.hunger -= 10;
        resources.food -= 10;
    }

    @Override
    public void water() {
        resources.water += 10;
    }

    @Override
    protected void drink() {
        needs.thirst -= 10;
        resources.water -= 10;
    }

    @Override
    public void walk() {
        System.out.println("Your cat doesnt like going on walks..\nExercise unchanged.");
    }

    @Override
    public void useToilet() {
        needs.bladder -= 10;
    }

    @Override
    public void play() {
        needs.exercise -= 10;
    }

    @Override
    public void behaviour() {
        int mostUrgentNeed = Math.max(needs.hunger, Math.max(needs.thirst, needs.bladder));
        
        if (mostUrgentNeed == needs.hunger)
        {
            eat();
            System.out.println(attributes.name + " was hungry and ate.");
        } else if (mostUrgentNeed == needs.thirst)
        {
            drink();
            System.out.println(attributes.name + " was thirsty and drank.");
        } else if (mostUrgentNeed == needs.bladder)
        {
            System.out.println(attributes.name + " really needs to pee and can't do anything untill you take them to the litterbox");
        }
    } 
}
