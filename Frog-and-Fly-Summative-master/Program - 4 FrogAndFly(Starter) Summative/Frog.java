import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
        speed = Greenfoot.getRandomNumber(5);
    }
    
    public void act() 
    {
        // make the Frog move at its speed, in the direction it is facing
        move(speed + 4);
        
        /*
         * Make the frog turn off course 35% of the time.
         * It will turn left or right 15 degrees equally as often. 
         */
        
        frogTurning();
       
        /*
         * If the frog is near an edge of the world, make it turn
         * 7 degrees to the right. 
         * 
         * Hint: use the atEdgeOfWorld method in the Creature class.
         */
        
        checkEdge();
        
        /*
         * If the frog encounters the fly, the game ends, so
         * stop the scenario 
         */ 
        
        frogTouching();
    } 
    
    /**
     * Makes the frog turn off course 35% of the time.
     * and it will turn left or right 15 degrees equally as often.
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void frogTurning()
    {
        if(Greenfoot.getRandomNumber(100) > 35)
        {
            move(speed + 4);
        }
        if(Greenfoot.getRandomNumber(2) < 1)
        {
            turn(15);
        }
        if(Greenfoot.getRandomNumber(2) < 1)
        {
            turn(-15);
        }
    }
    
    /**
     * if the frog is near the edge it will turn 7 degrees to the right
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void checkEdge()
    {
        if( atEdgeOfWorld() == true )
        {
            turn(7);
        }
    }
    
    /**
     * if the frog catch/encounter a fly it will stop the program
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void frogTouching()
    {
        if( isTouching(Fly.class) == true )
        {
            Greenfoot.stop();
        }
    }
}
