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
public class MainCircle3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\t\t>>Cirlce3<<\n");
        
        System.out.println("\t--Constructor 1--");
        
        Circle3 circle1=new Circle3();
        
        System.out.println("Atribut awal:\n"+circle1.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle1.getArea());
        System.out.println("Keliling\t: "+circle1.getCircumference());
        System.out.println("____________________________________");
        
        circle1.setRadius(50);
        circle1.setXPosition(200);
        circle1.setYPosition(650);
        circle1.setColor("white");
        
        System.out.println("Atribut akhir:\n"+circle1.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle1.getArea());
        System.out.println("Keliling\t: "+circle1.getCircumference());
        System.out.println("____________________________________");
        
        System.out.println(" \t--Constructor 2--");
        
        Circle3 circle2=new Circle3(15,250,250,"green");
        
        System.out.println("Atribut awal:\n"+circle2.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle2.getArea());
        System.out.println("Keliling\t: "+circle2.getCircumference());
        System.out.println("____________________________________");
        
        circle2.setRadius(60);
        circle2.setXPosition(300);
        circle2.setYPosition(750);
        circle2.setColor("white");
        
        System.out.println("Atribut akhir:\n"+circle2.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle2.getArea());
        System.out.println("Keliling\t: "+circle2.getCircumference());
        System.out.println("____________________________________");
    }

}
