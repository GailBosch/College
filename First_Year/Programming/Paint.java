//
// Note that this file must contain only one public class
//
import java.lang.Math;

abstract class Shape
{
    private String shapeName;

    public Shape(String name)
    {
        shapeName = name;
    }

    public String toString()
    {
       return shapeName;
    }

    public abstract double area();
}

class Sphere extends Shape
{
	private double radius;
	Sphere(double radius, String shapeName){
		super(shapeName);
		this.radius = radius;
	}
	@Override                                                 
	public double area()
	{
		return (4*Math.PI*(Math.pow(radius, 2)));
		
	}
}

class Rectangle extends Shape
{
	public double length, width;
	
	Rectangle(double length, double width, String shapeName)
	{
		super(shapeName);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area()
	{
		return (length*width);
		
	}
//	public String toString()
//    {
//       return "Rectangle";
//    }
}

class Cylinder extends Shape
{
	private double radius, height;
	
	Cylinder(double radius, double height, String shapeName){
		super(shapeName);
		this.radius = radius;
		this.height = height;
	}
	
	public double area()
	{
		return (Math.PI*(Math.pow(radius, 2))*height);
		
	}
}

public class Paint
{
	private double coverage;
	Paint(double coverage){
		this.coverage = coverage;
	}
	double amount(Shape shapey) {
		
		return shapey.area()/coverage;
	}
	
    public static void main(String args[])
    {
    	Paint painter = new Paint(350);
    	Shape rectangle = new Rectangle(20, 35, "Rectangle");
    	double amount = painter.amount(rectangle);
    	System.out.println("Computing amount for " + rectangle.toString() + "of length 20.0 and width 35.0");
    	System.out.println("Amount of paint required is " + amount);
    	Shape sphere = new Sphere(15, "Sphere");
    	amount = painter.amount(sphere);
    	System.out.println("Computing amount for Sphere of radius 15.0");
    	System.out.println("Amount of paint required is " + amount);
    	Shape cylinder = new Cylinder(10, 30, "Sphere");
    	amount = painter.amount(cylinder);
    	System.out.println("Computing amount for Cylinder of radius 10.0 and height 30.0");
    	System.out.println("Amount of paint required is " + amount);
    	//meow meow meow meow meow meow meow
    }
}