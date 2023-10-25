import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cherry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cherry extends Sayur
{
    /**
     * Act - do whatever the Cherry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cherry(){
        GreenfootImage img = this.getImage();
        img.scale(50, 50);
        this.setImage(img);
        this.setRotation(0);
    }
    void cetakbaru(){
        Cherry cherry = new Cherry();
        getWorld().addObject(cherry,Greenfoot.getRandomNumber(300),0);
    }
    
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
