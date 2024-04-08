/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Creature;

/**
 *
 * @author jeffe
 */
public abstract class Pet {
    Attributes attributes = new Attributes();
    Needs needs = new Needs();
    Resources resources = new Resources();
    
    abstract public void feed();
    abstract protected void eat();
    
    abstract public void water();
    abstract protected void drink();
    
    public abstract void walk();
    public abstract void useToilet();
    public abstract void play();
        
    public abstract void behaviour();
    
}
