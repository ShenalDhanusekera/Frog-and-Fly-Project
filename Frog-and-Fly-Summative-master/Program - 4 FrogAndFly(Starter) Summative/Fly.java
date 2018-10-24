import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    public Fly()
    {
        /*
         * modify this code to make the turtle face any random 
         * initial direction
         */
        
        // The Fly faces random direction everytime
        setRotation( Greenfoot.getRandomNumber(360) );
        
    }
    
    public void act() 
    {
        // make the fly move 4 steps in the direction it is facing
        
        moveFoward();
        
        /*
         * Make the fly turn left or right 5 degrees when
         * the left or right arrow key is pressed. 
         */
        
        turnAround();
        
        /*
         * If the fly touches a Food object, remove the Food object
         * from the world. 
         */
        
        eatFood();
        
    }
    
    /**
     * If the up key is pressed,it moves 4 steps the dirrection its facing
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void moveFoward()
    {
        if(Greenfoot.isKeyDown("up") == true)
        {
            move(4);
        }
    }
    
    /**
     * If the left key is pressed it turns -5 degrees and if the right key is pressed it turns 5 degrees
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void turnAround()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
    }
    
    /**
     * If the fly is touching any kind food, it will remove that food from that world
     * 
     * @param None There are no parameters
     * @return Does not return anything
     */
    public void eatFood()
    {
        if(isTouching(Food.class))
        {
            removeTouching(Food.class);
            //call the method update from the beach class
            ( (Beach)getWorld()).update();
        }
    }
}
