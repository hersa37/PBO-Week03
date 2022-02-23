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
public class Circle3 {
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
    
    public Circle3() {
        RADIUS=20;
        XPOSITION=100;
        YPOSITION=100;
        COLOR="black";
        
        radius=RADIUS;
        xPosition=XPOSITION;
        yPosition=YPOSITION;
        color=COLOR;
    }

    public Circle3(int radius, int xPosition, int yPosition, String color){
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
    
    public double getArea(){
        double area=Math.PI*radius*radius;
        return area;
    } 
    
    public String toString(){
        return "Radius\t\t: "+radius
                +"\nColor\t\t: "+color
                +"\nx position\t: "+xPosition
                +"\ny position\t: "+yPosition;
    }
}
