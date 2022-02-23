/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week03.Draw;

import java.awt.Graphics;
import javax.swing.JPanel;
import pbo1.week03.Shape.Circle5;
/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class DrawJPanel extends JPanel {
    
    private Circle5 circle;
    
    public DrawJPanel(){
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(circle!=null){
            circle.draw(g);
        }    
    }
    
    public void redraw(){
        this.repaint();
    }
    
    public void addDraw(Circle5 referenceObject){
        circle=referenceObject;        
        redraw();
    }
    
    public void removeDraw(){
        circle=null;
        redraw();
    }
}
