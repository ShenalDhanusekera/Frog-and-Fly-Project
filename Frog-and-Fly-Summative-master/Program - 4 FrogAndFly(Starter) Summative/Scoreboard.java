import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * This scoreboard counts how many Food object the Fly has eaten 
 * and add a point every time the fly eat a Food object
 * 
 * @author (Shenal Dhanusekera) 
 * @version (10/23/2018)
 */
public class Scoreboard extends Actor
{
    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);
    
    /**
     * Scoreboard makes an image that has a text called Score and the points will be set to 0
     * 
     * @param None There are no parameter
     * @return Does not return anything
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }
    
    /**
     * This removes the old image with tect Score and the points set to 0 and replace it with an text Score and points that will add up every time the fly eats a Food object
     * 
     * @param None There are no parameter
     * @return Does not return anything
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        img.drawString("Score: " + points, 5,25); 
    }    
}    
