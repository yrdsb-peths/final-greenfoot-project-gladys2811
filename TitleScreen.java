import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Gladys Lee 
 * @version January 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("Ninja Jump", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press < space > to start game", 40);
        addObject(label,328,270);
        label.setLocation(311,265);
        Label label2 = new Label("Use < space > to jump and dodge stars", 30);
        addObject(label2,297,314);
        label2.setLocation(314,305);
    }
}
