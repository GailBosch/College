// -- Wk10 --
public abstract class Rectangle implements Shapes
{
    private String color;
    private int length;
    private int width;
   
    public Rectangle(String color, int length, int width)
    {
	this.color = color;
        this.length = length;
        this.width = width;
    }
   
    public abstract double getPerimeter();

    @Override
    public double getArea()
    {
        return length*width;
    }
}

// -- Wk 4 - ParameterizedConstructor --
//public class Rectangle
//{
//    private int length;
//    private int breadth;
//
//    Rectangle(int len, int bre)
//    {
//	length = len;
//	breadth = bre;
//    }
//
//    public static void main(String[] args)
//    {
//        Rectangle r1 = new Rectangle(20, 10);
//    }
//}

// -- Wk 4 - NoArgConstructor --
//// Default Constructor
//public class Rectangle
//{
//    private int length;
//    private int breadth;
//
//    Rectangle()
//    {
//	length = 20;
//	breadth = 10;
//    }
//
//    public static void main(String[] args)
//    {
//        Rectangle r1 = new Rectangle();
//        System.out.println("Length of Rectangle : " + r1.length);
//        System.out.println("Breadth of Rectangle : " + r1.breadth);
//    }
//}
// -- Wk --
//public class Rectangle implements Shapes
//{  
//   // Private member variables
//   private double length;
//   private double width;
//
//   // Constructor
//   public Rectangle(double length, double width)
//   {
//      this.length = length;
//      this.width = width;
//   }
//
//   @Override
//   public String toString()
//   {
//      return "Rectangle[length=" + length + ",width=" + width + "]";
//   }
//
//   // Need to implement all the abstract methods defined in the interface
//   @Override
//   public double getArea()
//   {
//      return length * width;
//   }
//}
// -- Wk2 - Rectangle2 --
//public class Rectangle
//{
//    private double length;
//    private double breadth;
//
//    public double getBreadth()
//    {
//        return breadth;
//    }
//
//    public void setBreadth(double rectBreadth)
//    {
//        breadth = rectBreadth;
//    }
//
//    public double getLength()
//    {
//        return length;
//    }
//
//    public void setLength(double rectLength)
//    {
//        length = rectLength;
//    }
//}
// -- Wk2 - Rectangle1 --
//// Declaring a Class
//public class Rectangle
//{
//    private double length;
//    private double breadth;
//
//    public double getBreadth()
//    {
//        return breadth;
//    }
//
//    public void setBreadth(double rectBreadth)
//    {
//        breadth = rectBreadth;
//    }
//
//    public double getLength()
//    {
//        return length;
//    }
//
//    public void setLength(double rectLength)
//    {
//        length = rectLength;
//    }
//}