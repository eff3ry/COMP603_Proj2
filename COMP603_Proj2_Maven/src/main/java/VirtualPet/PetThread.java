/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeffe
 */
public class PetThread extends Thread{
    
    PetPanel petPanel;
    
    Random rand;
    int xDir; 
    int yDir;
    
    int counter =0;
    
    public PetThread(PetPanel petPanel)
    {
        this.petPanel = petPanel;
        rand = new Random();
    }
    
    @Override
    public void run()
    {
        petPanel.x = petPanel.getWidth()/2;
        petPanel.y = petPanel.getHeight()/2;
        
        setWander();
        while (true)
        {
            if (counter >= 100)
            {
                counter = 0;
                setWander();
            }
            
            bounceAround();
            counter+=1;
            
            
        }
        
    }
    
    public void wander()
    {
        
        
    }
    
    public void setWander()
    {
        xDir = rand.nextInt(2) == 1 ? 1 : -1;
        yDir = rand.nextInt(2) == 1 ? 1 : -1;
    }
    

    public void bounceAround() {
        
        if (petPanel.x > petPanel.getWidth() || petPanel.x < 0)
          xDir *= -1; 
        if (petPanel.y > petPanel.getHeight() || petPanel.y < 0)
          yDir *= -1; 

        petPanel.x +=  xDir;
        petPanel.y +=  yDir;
        petPanel.repaint();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(PetThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
