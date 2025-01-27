public class Rectangle
{
    // Attributes
    private double width;
    private double height;
    
    /*Constructor
    Copies the values of rectWidth and rectHeight
    into width and height, respectively*/
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
 
    
    /* Constructor
    Allows user to construct a square
    Copies the value of sidelength
    into both width and height*/

    Rectangle() {} //Automatically created if no constructor is found

    /*Default Constructor
    Allows a user to construct a rectangle
    without specifying dimensions*/
    
    // This method lets us print out the object
    // to see the values of the instance variables
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }

    public double getWidth() {
        return this.width;
    }
}
