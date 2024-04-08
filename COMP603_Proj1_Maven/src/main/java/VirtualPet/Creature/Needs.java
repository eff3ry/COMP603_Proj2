/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Creature;

/**
 *
 * @author jeffe
 */
public class Needs {
    //Hunger Attributes 0-100, these are 'negative' attributes so the lower the better
    //could display a low value as green, mid value as orange and high value as red
    int thirst;
    int hunger;
    
    int bladder;
    int exercise;
    
    public void initNeeds()
    {
        thirst = 10;
        hunger = 10;
        
        bladder = 0;
        exercise = 0;
    }
}
