import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jagung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jagung extends Sayur
{
    /**
     * Act - do whatever the Jagung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Jagung(){
        GreenfootImage img = this.getImage();
        img.scale(50, 50);
        this.setImage(img);
        this.setRotation(0);
    }
    void cetakbaru(){
        Jagung jagung = new Jagung();
        getWorld().addObject(jagung,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
