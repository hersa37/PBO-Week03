/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week03.Shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;


/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Circle5 {
    
    private final int RADIUS;
    private final int XPOSITION;
    private final int YPOSITION;
    private String COLOR;
    
    private int radius;
    private int xPosition;
    private int yPosition;
    private String color;
    
    public Circle5() {
        RADIUS=20;
        XPOSITION=100;
        YPOSITION=100;
        COLOR="black";
        
        radius=RADIUS;
        xPosition=XPOSITION;
        yPosition=YPOSITION;
        color=COLOR;
    }
    
    public Circle5(int radius, int xPosition, int yPosition, String color){
        RADIUS=radius;
        XPOSITION=xPosition;
        YPOSITION=yPosition;
        COLOR=color;
        
        this.radius=RADIUS;
        this.xPosition=XPOSITION;
        this.yPosition=YPOSITION;
        this.color=COLOR;
    }
    
    public void setRadius(int radius){
        this.radius=radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setXPosition(int xPosition){
        this.xPosition=xPosition;
    }
    
    public double getXPosition(){
        return xPosition;
    }
    
    public void setYPosition(int yPosition){
        this.yPosition=yPosition;
    }
    
    public double getYPosition(){
        return yPosition;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public String getColor(){
        return color;
    }
    
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    
    public double moveHorizontal(int distance){
        xPosition+=distance;
        return xPosition;
    }
    
    public double moveVertical(int distance){
        yPosition+=distance;
        return yPosition;
    }
    
    public double getArea(){
        double area=Math.PI*radius*radius;
        return area;
    } 
    
    public String toString(){
        return "Radius\t\t "+radius
                +"\nColor\t\t: "+color
                +"\nx position\t: "+xPosition
                +"\ny position\t: "+yPosition;
    }
    
    public void draw(Graphics g){
        Graphics2D g2d=(Graphics2D) g;
        switch (color){
            case "white": 
                g.setColor(Color.WHITE);
                break;
            case "black":
                g.setColor(Color.BLACK);
                break;
            case "red":
                g.setColor(Color.red);
                break;
            
            
        }
        
        g2d.fillArc(xPosition, yPosition, radius, radius, 0, 360);
    }
}
