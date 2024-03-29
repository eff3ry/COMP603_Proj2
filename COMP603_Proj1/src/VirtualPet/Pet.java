/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet;

/**
 *
 * @author jeffe
 */


public class Pet {
    String name;
    
    int health;
    
    //Hunger Attributes 0-100
    int water;
    int food;
    
    int age;
    int weight;
    int strength;
    
    int happiness; //angry, sad, happy etc
    int friendliness; //rename to sociability??
    
    int exercise;
    
    int pickiness; //how picky it is with food
    int laziness; // how lazy/active
    int likesBeingPetted;
            
   
    
    
    public Pet(String name)
    {
        this.name = name;
    }
    
   
}
