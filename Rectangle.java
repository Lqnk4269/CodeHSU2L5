public class Rectangle
{
    private int width;
    private int height;
    
    /**
     * This is the constructor to create a Rectangle.
     * To create a Rectangle we need to know its width
     * and height.
     */
    
    //complete the constructor
    public Rectangle(int rectWidth, int rectHeight)
    {
        this.width = rectWidth;
        this.height = rectHeight;

    }
    
    //create a printArea method
    public void printArea() {
        System.out.println(width * height);
    }
    
    //setter method, need to be able to set width and height
    
    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    /**
     * This is the toString method. It returns a String
     * representation of the object. See what happens
     * if you print out the object without a toString.
     */
    public String toString()
    {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}