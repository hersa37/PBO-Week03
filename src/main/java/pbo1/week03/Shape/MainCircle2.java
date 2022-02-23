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
public class MainCircle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\t\t>>Circle2<<\n");
        
        Circle2 circle=new Circle2();
        
        System.out.println("Atribut awal:\n"+circle.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle.getArea());
        System.out.println("Keliling\t: "+circle.getCircumference());
        System.out.println("____________________________________");
        
        circle.setRadius(50);
        circle.setXPosition(200);
        circle.setYPosition(650);
        circle.setColor("white");
        
        System.out.println("Atribut akhir:\n"+circle.toString()+"\n");
        
        System.out.println("Luas\t\t: "+circle.getArea());
        System.out.println("Keliling\t: "+circle.getCircumference());
        System.out.println("____________________________________");
        
    }

}
