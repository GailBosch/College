import java.util.Scanner;

public class StoppingDistance3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner ( System.in ) ;
		
		double vehicleSpeed = 0;
		boolean noSpeed = true;
		do
		{
			System.out.println("Enter vehicle speed in km/hr>");
			if (input.hasNextDouble())
			{
				vehicleSpeed = input.nextDouble();
				if (vehicleSpeed > 0)
				{
					noSpeed = false;
				}
				else
				{
					System.out.println("Error: Enter a positive number for the speed of the vehicle.");
				}
			}
			else
			{
				System.out.println("Error: Enter a positive number for the speed of the vehicle.");
				input.next();
			}
		} while (noSpeed);
		
		int age = 0;
		boolean noAge = true;
		do
		{
			System.out.println("Enter age in years>");
			if (input.hasNextInt())
			{
				age = input.nextInt();
				if (age > 0)
				{
					noAge = false;
				}
				else
				{
					System.out.println("Error: Enter a positive whole number for the age of the driver.");
				}
			}
			else
			{
				System.out.println("Error: Enter a positive whole number for the age of the driver.");
				input.next();
			}
		} while (noAge);
		
		boolean noWet = true;
		boolean roadIsWet = false;
		do
		{
			System.out.println("Is the road wet (Yes/No)?");
			if (input.hasNext("yes") || input.hasNext("Yes"))
			{
				roadIsWet = true;
				noWet = false;
				input.next();
			}
			else if (input.hasNext("no") || input.hasNext("No"))
			{
				roadIsWet = false;
				noWet = false;
				input.next();
			}
			else
			{
				System.out.println("Error: You must enter either Yes or No.");
				input.next();
			}
		}while (noWet);
		
		boolean noIce = true;
		boolean roadIsIcy = true;
		do
		{
			System.out.println("Is the road icy (Yes/No)?");
			if (input.hasNext("yes") || input.hasNext("Yes"))
			{
				roadIsIcy = true;
				noIce = false;
			}
			else if (input.hasNext("no") || input.hasNext("No"))
			{
				roadIsIcy = false;
				noIce = false;
			}
			else
			{
				System.out.println("Error: You must enter either Yes or No.");
				input.next();
			}
		}while (noIce);

		if (roadIsIcy && roadIsWet)
		{
			System.out.println("As the road is icy and wet, the coefficient of friction is 0.1");
		}
		else if (roadIsIcy)
		{
			System.out.println("As the road is icy and dry, the coefficient of friction is 0.1");
		}
		else if (roadIsWet)
		{
			System.out.println("As the road is wet, the coefficient of friction is 0.4");
		}
		else
		{
			System.out.println("As the road is dry, the coefficient of friction is 0.8");
		}
		
		System.out.printf("At a speed of %.1fkm/hr, a driver who is %d years old, the reaction distance is %.0fm, the braking distance is %.0fm, and so the stopping distance is %dm", vehicleSpeed, age, computeReactionDistance(vehicleSpeed, age), computeBrakingDistance(vehicleSpeed, roadIsIcy, roadIsWet),computeStoppingDistance(vehicleSpeed, age, roadIsIcy, roadIsWet));
		input.close();
	}
	public static double computeCoefficientOfFriction(boolean roadIsIcy, boolean roadIsWet)
	{
		double computeCoefficientOfFriction = 0;
		
		if (roadIsIcy)
		{
			computeCoefficientOfFriction = 0.1;
		}
		else if (roadIsWet)
		{
			computeCoefficientOfFriction = 0.4;
		}
		else
		{
			computeCoefficientOfFriction = 0.8;
		}
		
		return computeCoefficientOfFriction;
	}
	
	public static double computeBrakingDistance(double vehicleSpeed, boolean roadIsIcy, boolean roadIsWet)
	{	
		double computeBrakingDistance = Math.round(((Math.pow(vehicleSpeed, 2))/((computeCoefficientOfFriction(roadIsIcy, roadIsWet)) * 250)));
		
		return computeBrakingDistance;
	}
	public static double computeReactionDistance(double vehicleSpeed, int age)
	{
		double reactionTime = 1 + ((Math.abs(age - 24)) * 0.05);
		double metersPerSecond = ((vehicleSpeed*1000)/60)/60;
		double computeReactionDistance = Math.round(reactionTime * metersPerSecond);
		return computeReactionDistance;
	}
	 public static int computeStoppingDistance(double vehicleSpeed, int age, boolean roadIsIcy, boolean roadIsWet)
	 {
		 int computeStoppingDistance = (int)Math.round(computeReactionDistance(vehicleSpeed, age) + computeBrakingDistance(vehicleSpeed, roadIsIcy, roadIsWet));
		 
		 return computeStoppingDistance;
	 }
}