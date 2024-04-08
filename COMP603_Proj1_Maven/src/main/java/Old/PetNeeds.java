/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Old;

/**
 *
 * @author jeffe
 */
public class PetNeeds {
    
    //Hunger Attributes 0-100, these are 'negative' attributes so the lower the better
    //could display a low value as green, mid value as orange and high value as red
    public int thirst;
    public int hunger;
    int sadness; //angry, sad, happy etc
    public int exercise;
    
    public int bladder;
    
    public void initNeeds()
    {
        hunger = 50;
        thirst = 50;
        sadness = 50;
    }
}
