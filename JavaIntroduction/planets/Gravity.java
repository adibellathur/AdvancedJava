import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;

/**
 * Gravity consists of static methods used to calculate the gravitational force between two Matter
 * objects in the world.
 * 
 * @author Keshav Saharia
 * @version 1.4
 */
public class Gravity
{
    // The gravitational constant
    private static final double G = 3;
    
    /**
     * Returns a vector that represents the gravitational force between two Matter objects, assuming
     * that the center object is the object on which the force is being applied.
     */
    public static Vector getGravitationalForce(Matter center, Matter target)
    {
        double distance = distanceBetween(center , target);
        double magnitude = (G * center.getMass() * target.getMass()) / (distance * distance); 
        double angle = angleBetween(center , target);
        
        // put it all into a vector
        Vector v = new Vector();
        v.setVector(magnitude, angle);
        return v;
    }

    /**
     * Returns the distance between two Matter objects.
     */
    public static double distanceBetween(Matter center, Matter target) {
        Vector centerPosition = center.getPosition();
        Vector targetPosition = target.getPosition();
        double centerX = center.getX();
        double targetX = target.getX();
        double centerY = center.getY();
        double targetY = target.getY();

        
        Vector v = new Vector(centerX - targetX, centerY - targetY);
        return v.getMagnitude();
    }
    
    /**
     * Returns the angle between two Matter objects.
     */
    public static double angleBetween(Matter center, Matter target) {
       
    Vector v = new Vector(target.getX() - center.getX() , target.getY() - center.getY() );
    
    return v.getAngle();
    }
}
