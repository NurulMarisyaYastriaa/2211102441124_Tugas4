import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Counter counter = new Counter("");
        addObject(counter,52,476);
        Counter2 counter2 = new Counter2("HP : ");
        addObject(counter2,238,472);
        Kelinci kelinci = new Kelinci();
        addObject(kelinci,144,381);
        Kumbang kumbang = new Kumbang();
        addObject(kumbang,192,227);
        Ular ular = new Ular();
        addObject(ular,90,157);
        Cherry cherry = new Cherry();
        addObject(cherry,256,93);
        Jagung jagung = new Jagung();
        addObject(jagung,100,215);
        Timun timun = new Timun();
        addObject(timun,238,284);
        Wortel wortel = new Wortel();
        addObject(wortel,139,64);
        wortel.setLocation(54,62);
        ular.setLocation(132,88);
        jagung.setLocation(80,147);
        cherry.setLocation(227,96);
        timun.setLocation(28,180);
    }
}
