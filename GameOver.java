import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Over.
 * 
 * @author Gladys Lee 
 * @version January 2023
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("GAME OVER", 70);
        addObject(label,306,219);
    }
}
