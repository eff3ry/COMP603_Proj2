/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VirtualPet.Forms;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author jeffe
 */
public class ImagePanel extends JPanel implements ComponentListener{
    
    Image img;
    int width;
    int height;
    
    int x;
    int y;
    
    FillType fillType;

    

    
    
    public enum FillType{
        STRETCH,
        FIT
    }
    
    public ImagePanel()
    {
        setFillType(FillType.FIT);
    }
    
    public ImagePanel(Image image)
    {
        setImage(image);
        setFillType(FillType.FIT);
    }
    
    public void setFillType(FillType fillType)
    {
        this.fillType = fillType;
        switch (fillType)
        {
            case STRETCH:
                width = this.getWidth();
                height = this.getHeight();
                break;
            default:
                break;
        }
        
        repaint();
    }
    
    public void setImage(Image image)
    {
        img = image;
        repaint();
    }
    
    public void setImage(String path)
    {
        try {
            File pathToFile = new File(path);
            Image image = ImageIO.read(pathToFile);
            this.setImage(image);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //Custom paint code
        if (fillType == FillType.STRETCH)
        {
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
        } else if (fillType == FillType.FIT)
        {
            //height = img.getHeight(this);
            //width = img.getWidth(this);
            if (this.getWidth() > this.getHeight())
            {
                height = this.getHeight();
                width = Math.round(height * 1f/img.getHeight(this) * 1f * img.getWidth(this));
                x = this.getWidth()/2 - width/2;
                y = 0;
            } else {
                width = this.getWidth();
                height = Math.round(width * 1f/img.getWidth(this) * 1f * img.getHeight(this));
                x = 0;
                y = this.getHeight()/2 - height/2;
            }
            
            g.drawImage(img, x, y, width, height, this);
        }
        
    }
    
    
    @Override
    public void componentResized(ComponentEvent e) {
        repaint();
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        repaint();
    }

    @Override
    public void componentShown(ComponentEvent e) {
        repaint();
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        return;
    }
    
}
