import java.util.Scanner;

public class RangeOfHeights {

	public static void main(String[] args) {
		boolean quit = false;
		double bigHeight = 0;
		double smallHeight = 100;
		Scanner input = new Scanner( System.in );
		
		do
		{
			
			System.out.println("Enter a height in metres (0.0 to finish)>");
			
			if (input.hasNext("0.0"))
			{
				quit = true;
			}
			
			else if (input.hasNextDouble())
			{
				
				double height = input.nextDouble();
				if (height > 0)
				{
					
					if (height < smallHeight)
					{
						smallHeight = height;
					}
					
					if (height > bigHeight)
					{
						bigHeight = height;
					}
					
					System.out.print("Heights entered so far are in the range " + smallHeight + " to " + bigHeight);
					System.out.println("");
						
				}
				else
				{
					System.out.println("Negative heights are invalid.");
				}
			}
			else
			{
				input.next();
			}
		} while (!quit);
		
		
		input.close();

	}

}
