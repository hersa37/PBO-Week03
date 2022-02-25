/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.week03.Time;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class MainTime {

    public static void main(String[] args) {
        System.out.println("\t\t>>Time<<\n");
        
        Time time=new Time();
        
        System.out.println("Atribut awal:\n"+time.toString()+"\n");
        System.out.println("____________________________________");
        
        time.setSecond(50);
        time.setMinute(20);
        time.setHour(30);
        
        System.out.println("Atribut akhir:\n"+time.toString()+"\n");
        System.out.println("____________________________________");
    }
}
