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
    public String name;
    public String species;
   
    protected int sadness;
    protected int laziness;
    protected int pickiness;
    protected int likesBeingPetted;
    
    public Attributes()
    {
        laziness = (int) (Math.random() * 10) + 1;
        pickiness = (int) (Math.random() * 10) + 1;
        likesBeingPetted = (int) (Math.random() * 10) + 1;
        
        sadness = 0;
    }
}
