/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Forms;

import VirtualPet.Creature.Pet;
import javax.swing.JFrame;

/**
 *
 * @author jeffe
 */
public class GUIApp {
    
    static Pet pet;
    
    static JFrame currentFrame;
    
    static StartFrame startFrame;
    static CreateForm createForm;
            
            
        
    public static void main(String[] args) {
        
        startFrame = new StartFrame();
        startFrame.setVisible(true);
        
        currentFrame = startFrame;
        
    }
    
    public static void openCreateForm()
    {
        createForm = new CreateForm();
        if (currentFrame != null)
        {
            currentFrame.setVisible(false);
        }

        createForm.setVisible(true);
        currentFrame = createForm;
    }
    
    public static void openStartForm()
    {
        startFrame = new StartFrame();
        if (currentFrame != null)
        {
            currentFrame.setVisible(false);
        }

        startFrame.setVisible(true);
        currentFrame = startFrame;
    }
    
}
