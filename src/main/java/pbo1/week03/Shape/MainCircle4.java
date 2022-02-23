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
public class MainCircle4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\t\t>>Cirlce4<<\n");
        
        System.out.println("\t--Constructor 1--");
        
        Circle4 circle1=new Circle4();
        
        System.out.println("Atribut awal:\n"+circle1.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle1.getArea());
        System.out.println("Keliling\t: "+circle1.getCircumference());
        System.out.println("____________________________________");
        
        circle1.setRadius(50);
        circle1.moveHorizontal(40);
        circle1.moveVertical(35);
        circle1.setColor("white");
        
        System.out.println("Atribut akhir:\n"+circle1.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle1.getArea());
        System.out.println("Keliling\t: "+circle1.getCircumference());
        System.out.println("____________________________________");
        
        System.out.println(" \t--Constructor 2--");
        
        Circle4 circle2=new Circle4(15,250,250,"green");
        
        System.out.println("Atribut awal:\n"+circle2.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle2.getArea());
        System.out.println("Keliling\t: "+circle2.getCircumference());
        System.out.println("____________________________________");
        
        circle2.setRadius(60);
        circle2.moveHorizontal(300);
        circle2.moveVertical(750);
        circle2.setColor("white");
        
        System.out.println("Atribut akhir:\n"+circle2.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle2.getArea());
        System.out.println("Keliling\t: "+circle2.getCircumference());
        System.out.println("____________________________________");
    }

}
