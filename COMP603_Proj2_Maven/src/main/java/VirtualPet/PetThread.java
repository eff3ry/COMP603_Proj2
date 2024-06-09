/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeffe
 */
public class PetThread extends Thread{
    
    PetPanel petPanel;
    
    public PetThread(PetPanel petPanel)
    {
        this.petPanel = petPanel;
    }
    
    @Override
    public void run()
    {
        petPanel.x = petPanel.getWidth()/2;
        petPanel.y = petPanel.getHeight()/2;
        while (true)
        {
            petPanel.x+=1;
            petPanel.y+=1;
            petPanel.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(PetThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
