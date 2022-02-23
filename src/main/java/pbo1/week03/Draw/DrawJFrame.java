/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week03.Draw;

import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import pbo1.week03.Shape.Circle5;
/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class DrawJFrame {
 
    private JFrame frame;
    
    public static void main(String[] args) throws InterruptedException{
        JFrame frame=new JFrame("Draw Circle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        DrawJPanel panelCircle=new DrawJPanel();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(panelCircle);
        
        
        Circle5 circle=new Circle5();
        panelCircle.addDraw(circle);
        
        TimeUnit.SECONDS.sleep(1);
        circle.moveHorizontal(50);
        panelCircle.addDraw(circle);
        
        TimeUnit.SECONDS.sleep(1);
        circle.setColor("red");
       
        panelCircle.addDraw(circle);
        
                
    }
}
