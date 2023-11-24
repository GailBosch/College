import java.util.Scanner;

public class FirstsAndPasses {
	
	public static final double MINIMUM_FIRST_CLASS_PERCENTAGE = 70.0;
	public static final double MINIMUM_PASS_PERCENTAGE = 40.0;
	public static final double MINIMUM_MARK = 0.0;
	public static final double MAXIMUM_MARK = 100.0;

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter the number of students in the class>");
		int studentNumber = input.nextInt();
		
		if (studentNumber < 0)
		{
			System.out.print("Error:  The number of students must be greater than 0 ");
			System.exit(0);
		}


		
		int numberOfFirsts = 0;
		int numberOfPass = 0;
		int count = 0;
		
		for (count= 1; (count <= studentNumber); count++)
		{
			
			System.out.printf("Enter the percentage obtained by student %d>\n", count);
			if (input.hasNextDouble())
			{
				double mark = input.nextDouble();
				if ((mark >= MINIMUM_MARK) && (mark <= MAXIMUM_MARK))
				{
				numberOfFirsts += (Math.round(mark) >= MINIMUM_FIRST_CLASS_PERCENTAGE)
							? 1 : 0;
				numberOfPass += (Math.round(mark) >= MINIMUM_PASS_PERCENTAGE)
							? 1 : 0;
			
				}
				else
				{
					System.out.println("Invalid percentage.  Please enter the mark again for this student.");
					count--;
				}
				
			}
			else
			{
				System.out.println("Invalid percentage.  Please enter the mark again for this student. ");
				count--;
				input.next();
			}

			
		}
		double numberOfPassD = numberOfPass;
		double studentNumberD = studentNumber;
		double percentageOfPass = (numberOfPassD/studentNumberD)*100;
		System.out.printf("In this class of %d students, %d got a first class honour and %.1f%% passed the class", studentNumber, numberOfFirsts, percentageOfPass);
		
		input.close();
	}

}