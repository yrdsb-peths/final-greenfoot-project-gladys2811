import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * My World.
 * 
 * @author Gladys Lee
 * @version January 2023
 */
public class MyWorld extends World
{
    SimpleTimer starTimer = new SimpleTimer();
    Label scoreLabel;
    int score = 0;
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ninja ninja = new Ninja();
        addObject(ninja,58,371);
        NinjaStar star = new NinjaStar();
        addObject(star, 575, 369);
        Label scoreLabel = new Label(score, 60);
        addObject(scoreLabel,24,30);
    }
    
    public void addScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
}
