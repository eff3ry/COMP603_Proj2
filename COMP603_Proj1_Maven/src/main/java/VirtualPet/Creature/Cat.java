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

    public Cat(){
        attributes.species = "Cat";
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
