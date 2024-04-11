/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Creature;

/**
 *
 * @author jeffe
 */
public class Attributes {
    private String name;
    private String species;
   
    private int sadness;
    public int laziness;
    public int pickiness;
    public int likesBeingPetted;
    
    public Attributes(String name, String species)
    {
        laziness = (int) (Math.random() * 10) + 1;
        pickiness = (int) (Math.random() * 10) + 1;
        likesBeingPetted = (int) (Math.random() * 10) + 1;
        
        sadness = 50;
        
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getSadness() {
        return sadness;
    }

    public int getLaziness() {
        return laziness;
    }

    public int getPickiness() {
        return pickiness;
    }

    public int getLikesBeingPetted() {
        return likesBeingPetted;
    }

    public void setSadness(int sadness) {
        this.sadness = sadness;
    }
    
    public void addSadness(int num) {
        this.sadness += num;
    } 
}
