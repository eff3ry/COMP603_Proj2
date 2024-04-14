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
    private int thirst;
    private int hunger;
    
    private int bladder;
    private int exercise;
    
    public Needs()
    {
        thirst = 10;
        hunger = 10;
        
        bladder = 0;
        exercise = 0;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
    
    public void modifyThirst(int amount)
    {
        this.thirst += amount;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    
    public void modifyHunger(int amount)
    {
        this.hunger += amount;
    }

    public int getBladder() {
        return bladder;
    }

    public void setBladder(int bladder) {
        this.bladder = bladder;
    }
    
    public void modifyBladder(int amount)
    {
        this.bladder += amount;
    }

    public int getExercise() {
        return exercise;
    }

    public void setExercise(int exercise) {
        this.exercise = exercise;
    }
    
    public void modifyExercise(int amount)
    {
        this.exercise += amount;
    }
    
    
    
    
}
