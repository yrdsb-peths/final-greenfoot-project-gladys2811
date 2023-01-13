      import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Turtle.
 * 
 * @author Gladys 
 * @version December 2022
 */
public class Turtle extends Actor
{
    String facing = "up";
    
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move();
    }    
    
    public void move()
    {
        int x = getX();
        int y = getY();
        if (Greenfoot.isKeyDown("A"))
        {
            x -= 2;
        }
        if (Greenfoot.isKeyDown("D"))
        {
            x += 2;
        }
    }
    
}
