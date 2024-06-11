/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Forms;

import VirtualPet.Creature.Pet;
import VirtualPet.Database.PetManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    static LoadForm loadForm;
    static PetAppForm petAppForm;
            
    static PetManager petManager;
    
    static HashMap<String, Pet> petMap = null;
    
    static Pet loadedPet = null;
        
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
    
    public static void openLoadForm()
    {
        loadForm = new LoadForm();
        assignCloseListener(loadForm);
        if (currentFrame != null)
        {
            currentFrame.setVisible(false);
        }

        loadForm.setVisible(true);
        currentFrame = loadForm;
        
        try {
            petMap = petManager.queryPetHashMap();
        } catch (SQLException ex) {
            Logger.getLogger(GUIApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (petMap != null)
        {
            loadForm.loadPetsIntoList(petMap);
        }
        
    }
    
    public static void openPetAppForm()
    {
        petAppForm = new PetAppForm(loadedPet);
        assignCloseListener(petAppForm);
        if (currentFrame != null)
        {
            currentFrame.setVisible(false);
        }

        petAppForm.setVisible(true);
        currentFrame = petAppForm;
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
