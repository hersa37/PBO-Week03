/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week03.Shape;

import java.awt.Color;
import java.awt.Graphics;


/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Circle5 {
    private int radius;
    private int xPosition;
    private int yPosition;
    private String color;
    
    public Circle5() {       
        this(20, 100, 100, "black");
    }
    
    public Circle5(int radius, int xPosition, int yPosition, String color){       
        this.radius=radius;
        this.xPosition=xPosition;
        this.yPosition=yPosition;
        this.color=color;
    }   
    
    public void setRadius(int radius){
        if(radius>=0){
            this.radius=radius;
        } else this.radius=0;
        
    }
    
    public int getRadius(){
        return radius;
    }
    
    public void setXPosition(int xPosition){
        this.xPosition=xPosition;
    }
    
    public int getXPosition(){
        return xPosition;
    }
    
    public void setYPosition(int yPosition){
        this.yPosition=yPosition;
    }
    
    public int getYPosition(){
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
    
    public double getArea(){
        return Math.PI*radius*radius;
    } 
    
    public void moveHorizontal(int distance){
        xPosition+=distance;
    }
    
    public void moveVertical(int distance){
        yPosition+=distance;
    }    
    
    public void draw(Graphics g){
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
            case "pink": 
                g.setColor(Color.pink);
                break;
            case "orange":
                g.setColor(Color.orange);
                break;
            case "yellow":
                g.setColor(Color.yellow);
                break;
            case "green":
                g.setColor(Color.green);
                break;
            case "blue":
                g.setColor(Color.blue);
                break;
            default:
                g.setColor(Color.BLACK);         
        }        
        g.fillArc(xPosition, yPosition, 2*radius, 2*radius, 0, 360);
    }

    @Override
    public String toString(){
        return "{Radius: "+radius
                +"; Color: "+color
                +"; x position: "+xPosition
                +"; y position: "+yPosition+"}\n";
    }
}
