import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * My World.
 * 
 * @author Gladys Lee
 * @version January 2023
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label ("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void createNinjaStar()
    {
        Ninja star = new Ninja();
        int x = 575;
        int y = 369;
        addObject(star, x, y);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ninja ninja = new Ninja();
        addObject(ninja,58,371);
        NinjaStar ninjaStar = new NinjaStar();
        addObject(ninjaStar,575,369);
    }
}
