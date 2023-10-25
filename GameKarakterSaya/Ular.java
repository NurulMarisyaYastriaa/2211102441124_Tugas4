import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ular extends No
{
    /**
     * Act - do whatever the ular wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ular(){
        GreenfootImage img = this.getImage();
        img.scale(50, 50);
        this.setImage(img);
        this.setRotation(0);
    }
    void cetakbaru(){
        Ular ular = new Ular();
        getWorld().addObject(ular,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
