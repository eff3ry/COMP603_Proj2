/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author jeffe
 */
public class PetPanel extends JPanel{
    
    int x;
    int y;
    
    
    
    public PetPanel()
    {
        x = this.getWidth()/2;
        y = this.getHeight()/2;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Your custom painting code here
        
        // Example: g.drawString("Hello, Pet!", 10, 20);
        
        int size = 34;
        g.setColor(new Color(60,63,65));
        g.fillOval(x - size/2, y - size/2, size, size);
        size = 30;
        g.setColor(new Color(76,135,200));
        g.fillOval(x - size/2, y - size/2, size, size);
    }
}
