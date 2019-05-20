
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square sky;
    private Square ground;
    private Square wall;
    private Square wall2;
    private Square wall3;
    private Square wall4;
    private Square wall5;
    private Square window;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square door;
    private Square door2;
    private Triangle roof;
    private Triangle roof2;
    private Triangle roof3;
    private Circle sun;
    private Circle cloud;
    private Circle cloud2;
    private Circle cloud3;
    private Circle leaf;
    private Square trunk;
    private Circle leaf2;
    private Square trunk2;
   
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeSize(500);
        sky.changeColor("blue");
        sky.moveHorizontal(-80);
        sky.moveVertical(-80);
        sky.makeVisible();
        
        ground = new Square();
        ground.changeSize(500);
        ground.changeColor("white");
        ground.moveHorizontal(-80);
        ground.moveVertical(150);
        ground.makeVisible();
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.changeColor("black");
        wall.makeVisible();

        wall2 = new Square();
        wall2.moveVertical(80);
        wall2.moveHorizontal(70);
        wall2.changeSize(100);
        wall2.changeColor("black");
        wall2.makeVisible();

        wall3 = new Square();
        wall3.moveVertical(50);
        wall3.changeSize(30);
        wall3.changeColor("black");
        wall3.makeVisible();
        
        wall4 = new Square();
        wall4.moveVertical(50);
        wall4.changeSize(30);
        wall4.moveHorizontal(70);
        wall4.changeColor("black");
        wall4.makeVisible();
                
        wall5 = new Square();
        wall5.moveVertical(50);
        wall5.changeSize(30);
        wall5.moveHorizontal(140);
        wall5.changeColor("black");
        wall5.makeVisible();
        
        window = new Square();
        window.changeColor("white");
        window.changeSize(15);
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("white");
        window2.changeSize(15);
        window2.moveHorizontal(60);
        window2.moveVertical(100);
        window2.makeVisible();
        
        window3 = new Square();
        window3.changeColor("white");
        window3.changeSize(15);
        window3.moveHorizontal(100);
        window3.moveVertical(100);
        window3.makeVisible();
        
        window4 = new Square();
        window4.changeColor("white");
        window4.changeSize(15);
        window4.moveHorizontal(140);
        window4.moveVertical(100);
        window4.makeVisible();

        door = new Square();
        door.changeColor("green");
        door.changeSize(20);
        door.moveHorizontal(75);
        door.moveVertical(160);
        door.makeVisible();
        
        door2 = new Square();
        door2.changeColor("green");
        door2.changeSize(20);
        door2.moveHorizontal(75);
        door2.moveVertical(150);
        door2.makeVisible();
        
        
        roof = new Triangle();
        //roof.changeSize(50, 140);
        roof.moveHorizontal(25);
        roof.moveVertical(60);
        roof.makeVisible();

        roof2 = new Triangle();
        //roof.changeSize(50, 140);
        roof2.moveHorizontal(95);
        roof2.moveVertical(60);
        roof2.makeVisible();

        roof3 = new Triangle();
        //roof.changeSize(50, 140);
        roof3.moveHorizontal(165);
        roof3.moveVertical(60);
        roof3.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(10);
        sun.moveVertical(-40);
        sun.changeSize(30);
        sun.makeVisible();
        
        cloud = new Circle();
        cloud.changeColor("white");
        cloud.moveHorizontal(100);
        cloud.moveVertical(-40);
        cloud.changeSize(20);
        cloud.makeVisible();
        
        cloud2 = new Circle();
        cloud2.changeColor("white");
        cloud2.moveHorizontal(115);
        cloud2.moveVertical(-40);
        cloud2.changeSize(20);
        cloud2.makeVisible();
        
        cloud3 = new Circle();
        cloud3.changeColor("white");
        cloud3.moveHorizontal(130);
        cloud3.moveVertical(-40);
        cloud3.changeSize(20);
        cloud3.makeVisible();

        trunk = new Square();
        trunk.changeColor("black");
        trunk.moveHorizontal(-33);
        trunk.moveVertical(150);
        trunk.changeSize(15);
        trunk.makeVisible();
        
        leaf = new Circle();
        leaf.changeColor("red");
        //leaf.moveHorizontal(10);
        leaf.moveVertical(110);
        leaf.changeSize(30);
        leaf.makeVisible();

        trunk2 = new Square();
        trunk2.changeColor("black");
        trunk2.moveHorizontal(190);
        trunk2.moveVertical(150);
        trunk2.changeSize(15);
        trunk2.makeVisible();
        
        leaf2 = new Circle();
        leaf2.changeColor("red");
        leaf2.moveHorizontal(223);
        leaf2.moveVertical(110);
        leaf2.changeSize(30);
        leaf2.makeVisible();


    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
