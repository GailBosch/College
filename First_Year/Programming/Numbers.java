// What is the problem with this code?

public class Numbers
{
    public int add(int a, int b)
    {
	return a + b;
    }

    public double add(double a, double b)
    {
	return a + b;
    }

    public static void main(String[] args)
    { 
    	Numbers numbers = new Numbers(); 
    	numbers.add(10,20); 
    }

 }