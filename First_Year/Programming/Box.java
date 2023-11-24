// Constructor Overloading

class Box
{
    private double width, height, depth;
	 
    // Constructor used when all dimensions specified
    Box(double w, double h, double d)
    {
	width = w;
	height = h;
	depth = d;
    }
	 
    // Constructor used when no dimensions specified
    Box()
    {
	width = height = depth = 0;
    }
	 
    // Constructor used when a cube is created
    Box(double len)
    {
	width = height = depth = len;
    }
	 
    // Compute and return volume
    public double volume()
    {
	return width * height * depth;
    }
}