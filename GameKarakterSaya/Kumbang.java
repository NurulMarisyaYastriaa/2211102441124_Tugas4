import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kumbang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kumbang extends No
{
    /**
     * Act - do whatever the Kumbang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Kumbang(){
        GreenfootImage img = this.getImage();
        img.scale(50, 50);
        this.setImage(img);
        this.setRotation(180);
    }
    void cetakbaru(){
        Kumbang kumbang = new Kumbang();
        getWorld().addObject(kumbang,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+2);
    }
    public void act()
    {
        super.act();
    }
}
