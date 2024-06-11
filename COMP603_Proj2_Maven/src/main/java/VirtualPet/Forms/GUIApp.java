/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Forms;

import VirtualPet.Creature.Pet;
import VirtualPet.Database.PetManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
            
    static PetManager petManager;
        
    public static void main(String[] args) {
        
        petManager = new PetManager();
        
        startFrame = new StartFrame();
        assignCloseListener(startFrame);
        startFrame.setVisible(true);
        
        currentFrame = startFrame;
        
    }
    
    public static void openCreateForm()
    {
        createForm = new CreateForm();
        assignCloseListener(createForm);
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
        assignCloseListener(startFrame);
        if (currentFrame != null)
        {
            currentFrame.setVisible(false);
        }

        startFrame.setVisible(true);
        currentFrame = startFrame;
    }
    
    private static void assignCloseListener(JFrame frame)
    {
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                // call terminate
                closeApp();
            }
        });
    }
    
    private static void closeApp()
    {
        System.out.println("Close app called...");
        petManager.closeDB();
    }
    
}
