/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Creature;

/**
 *
 * @author jeffe
 */
public class Resources {
    
    //Resources 0-100 these are variables with higher variables being better
    public int food;
    public int water;
    
    
    public Resources()
    {
        food = 50;
        water = 50;
    }

    public int getFood() {
        return food;
    }

    public int getWater() {
        return water;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void setWater(int water) {
        this.water = water;
    }
    
    public void addFood(int food) {
        this.food += food;
    }

    public void addWater(int water) {
        this.water += water;
    }
}
