import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ninja
 * 
 * @author Gladys
 * @version January 2023
 */
public class Ninja extends Actor
{
    private final int GRAVITY = 1;
    private int velocity;
    /**
     * Act - do whatever the Ninja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ninja()
    {
        velocity = 0;
    }
    public void act() 
    {
        fall();
        if(Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight() - 30) jump();
    }
    public void fall()
    {
        setLocation(getX(), getY() + velocity);
        if (getY() > getWorld().getHeight() - 30) velocity = 0;
        else velocity += GRAVITY;
    }
    public void jump()
    {
        velocity = - 15;
    }
    
    
}
