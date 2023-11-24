import java.util.Scanner;

public class Vertebrates {

	public static void main(String[] args) {
		
		System.out.println("Is the animal cold blooded (Yes/No)? ");
		Scanner input = new Scanner( System.in );
		String isBloodAnswer = input.next();
		boolean isCold = isBloodAnswer.equalsIgnoreCase("Yes");
		
		if (isCold)
		{
			System.out.println("Does the animal have scales (Yes/No)? ");
			String isScaleAnswer = input.next();
			boolean isScale = isScaleAnswer.equalsIgnoreCase("Yes");
			
			
			if (isScale)
				{
				System.out.println("Does the animal have any fins (Yes/No)? ");
				String isFinsAnswer = input.next();
				boolean isFins = isFinsAnswer.equalsIgnoreCase("Yes");
				
				
				if (isFins)
					{
					System.out.println("The animal is a fish.");
					}
					else
					{
					System.out.println("The animal is a reptile.");
					}
				}
			else
				{
					System.out.println("The animal is a amphibian.");	
				}
		}
		else
			{
			System.out.println("Does the animal have feathers (Yes/No)? ");
			String isFeathersAnswer = input.next();
			boolean isFeathers = isFeathersAnswer.equalsIgnoreCase("Yes");
			
			if (isFeathers)
				{
				System.out.println("The animal is a bird.");	
				}
			else
			{
				System.out.println("The animal is a mammal.");
			}
			}
		input.close();

	}

}
