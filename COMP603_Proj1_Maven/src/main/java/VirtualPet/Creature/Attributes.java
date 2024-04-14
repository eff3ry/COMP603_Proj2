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
    
    public Attributes(String name, String species)
    {
        
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
    
    public void setSadness(int sadness) {
        this.sadness = sadness;
    }
    
    public void addSadness(int num) {
        this.sadness += num;
    } 
}
