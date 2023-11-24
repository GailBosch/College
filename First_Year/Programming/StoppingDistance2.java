import java.util.Scanner;

public class StoppingDistance2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner ( System.in ) ;
		
		System.out.println("Enter vehicle speed in km/hr>");
		double speed = input.nextDouble();
		
		System.out.println("Enter age in years>");
		double age = input.nextDouble();
		
		System.out.println("Is the road wet (Yes/No)? ");
		String isWetAnswer = input.next();
		boolean isWet = isWetAnswer.equalsIgnoreCase("Yes");
		
		double friction = 0;
		if (isWet)
		{
			System.out.println("As the road is wet, the coefficient of friction is 0.4");
			friction = 0.4;
		}
		else
		{
			System.out.println("As the road is dry, the coefficient of friction is 0.8");
			friction = 0.8;
		}
		
		double reaction = 0;
		if (age < 50)
		{
			System.out.printf("As the driver is %.0f years old, his/her reaction time is 2.0s%n", age);
			reaction = 2;
		}
		else if (age > 59)
		{
			System.out.printf("As the driver is %.0f years old, his/her reaction time is 3.0s%n", age);
			reaction = 3;
		}
		else 
		{
			System.out.printf("As the driver is %.0f years old, his/her reaction time is 2.5s%n", age);
			reaction = 2.5;
		}
		
		double metersPerSecond = ((speed*1000)/60)/60;
		double reactionDistance = metersPerSecond * reaction;
		double breakingDistance = (Math.pow(speed,2))/(250*friction);
		double stoppingDistance = reactionDistance + breakingDistance;
		
		System.out.printf("At a speed of %.1fkm/hr, the reaction distance is %.0fm, the braking distance"
				+ " is %.0fm, and so the stopping distance is %.0fm", speed, reactionDistance, breakingDistance,
				stoppingDistance);
		
		input.close();
	}

}
