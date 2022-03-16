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

    public static void main(String[] args){

        Time time=new Time();

        System.out.println("\t\t>>2B<<");
        System.out.println(String.format("%02d:%02d:%02d",time.getHour(),
                time.getMinute(),time.getSecond()));
        
        System.out.println("\n\t\t>>2C<<");
        System.out.println(time.toString());
        
        System.out.println("\n\t\t>>2E<<");
        System.out.println(time.nextSecond());
        
        System.out.println("\n\t\t>>2F<<");
        System.out.println(time.nextSecond().nextSecond().nextSecond());
            
        
    }
}
