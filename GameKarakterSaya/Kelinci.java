import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BurungKenari here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kelinci extends Actor
{
    int count = 0;
    int speed = 3;
    public Kelinci(){
        GreenfootImage img = this.getImage();
        img.scale(80, 80);
        this.setImage(img);
        this.setRotation(0);
    }
    
    void dimakan(){
        Counter.add(1);
        getWorld().removeObject(this);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX()-speed, this.getY());
        }
        
        if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() +speed, this.getY());
        }
        
        if(isTouching(No.class)){
            Counter2.add(-1);
            dimakan();
        }
        
        if(Counter2.value==0){
            Greenfoot.delay(1);
            Greenfoot.setWorld(new Endpage());
            getWorld().removeObject(this);
        }
    }
}
