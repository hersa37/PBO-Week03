/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week03.Shape;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Circle2 {
    //Constant
    private final int RADIUS;
    private final int XPOSITION;
    private final int YPOSITION;
    private final String COLOR;
    //Attribute
    private int radius;
    private int xPosition;
    private int yPosition;
    private String color;
    
    public Circle2() {
        RADIUS=20;
        XPOSITION=100;
        YPOSITION=100;
        COLOR="black";
        
        radius=RADIUS;
        xPosition=XPOSITION;
        yPosition=YPOSITION;
        color=COLOR;
    }
    
    public void setRadius(int newRadius){
        radius=newRadius;
    }
    
    public int getRadius(){
        return radius;
    }
    
    public void setXPosition(int newXPosition){
        xPosition=newXPosition;
    }
    
    public int getXPosition(){
        return xPosition;
    }
    
    public void setYPosition(int newYPosition){
        yPosition=newYPosition;
    }
    
    public int getYPosition(){
        return yPosition;
    }
    
    public void setColor(String newColor){
        color=newColor;
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
    
    public String toString(){
        return "Radius\t\t: "+radius
                +"\nColor\t\t: "+color
                +"\nx position\t: "+xPosition
                +"\ny position\t: "+yPosition;
    }
    
    
}
