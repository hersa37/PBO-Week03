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
public class Circle4 {
    //Constant
    private final int RADIUS=20;
    private final int XPOSITION=100;
    private final int YPOSITION=100;
    private final  String COLOR="black";
    //Attribute
    private int radius;
    private int xPosition;
    private int yPosition;
    private String color;
    
    public Circle4() {               
        radius=RADIUS;
        xPosition=XPOSITION;
        yPosition=YPOSITION;
        color=COLOR;
    }
    
    public Circle4(int radius, int xPosition, int yPosition, String color){       
        this.radius=RADIUS;
        this.xPosition=XPOSITION;
        this.yPosition=YPOSITION;
        this.color=COLOR;
    }
    
   public void setRadius(int radius){
        this.radius=radius;
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
    
    
    public String toString(){
        return "Radius\t\t: "+radius
                +"\nColor\t\t: "+color
                +"\nx position\t: "+xPosition
                +"\ny position\t: "+yPosition;
    }
}
