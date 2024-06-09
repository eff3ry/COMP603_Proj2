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
        g.setColor(Color.red);
        g.fillOval(x, y, 10, 10);
    }
}
