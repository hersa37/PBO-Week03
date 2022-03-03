/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package tester;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import pbo1.week03.Shape.Circle2;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Circle2Test {
    
    Circle2 circle2;
    
    @Before
    public void setUP(){
        circle2=new Circle2();
    }
   
    @Test
    public void testSetRadius(){
        circle2.setRadius(10);
        assertEquals(10,circle2.getRadius(),0.0);
    }
    
}
