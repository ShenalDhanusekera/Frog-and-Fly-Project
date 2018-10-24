
 /**
 * Name: Shenal Dhanusekera
 * Class: Software Development 10S
 * Teacher: Mr.Hardman
 * Date Last Modified: 10/23/2018
 */

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    //create a Scoreboard variable that store a Scoreboard
    private Scoreboard score;
    
    public Beach()
    { 
       super(800, 600, 1); 
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
       // DO THIS!)
       
       addFood(10);

       // add a Fly object at a random position somewhere in the world
       
       addFly();
       
       // add a Frog object at the center of the world 
       
       addFrog();
       
       //Add a scoreboard object to the world in the top left corner
       score = new Scoreboard();
       addObject( score, 75, 25 );
    }
    
    /**
     * if there is no food in the world add 10 more food to the world
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void act()
    {
       if(getObjects(Food.class).size() == 0)
       {
           addFood(10);
       }
    }
    
    /**
     * Adds n Food objects to the world
     * 
     * @param The amount of Food that will be in the world(beach)
     * @return Does not return anything
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
    
    /**
     * This adds a fly in random position somewhere in the world 
     *  
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void addFly()
    {
        addObject( new Fly(), Greenfoot.getRandomNumber( getWidth() ), Greenfoot.getRandomNumber( getHeight() ) );
    }
    
    /**
     * This adds a Frog in the middle of the Window
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void addFrog()
    {
        addObject( new Frog(), getWidth()/2, getHeight()/2 );
    }
    
    /**
     * Creat a public method called update. this method will call addToScore from the scoreboard object and add a point to that scoreboard
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void update()
    {
        score.addToScore();
    }
}
