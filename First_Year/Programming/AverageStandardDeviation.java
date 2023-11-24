import java.util.Scanner;

public class AverageStandardDeviation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner ( System.in ) ;
		
		System.out.println("Enter three numbers separated by spaces:");
		double inputOne = input.nextDouble();
		double inputTwo = input.nextDouble();
		double inputThree = input.nextDouble();
		double sum = inputOne + inputTwo + inputThree;
		
		double average = sum / 3 ;
		
		double standardDeviation = (Math.sqrt((((Math.pow((inputOne-average),2))+(Math.pow((inputTwo-average),2)) + Math.pow((inputThree-average),2))/3)));
			
		System.out.printf("For numbers %.1f, %.1f, %.1f",inputOne, inputTwo, inputThree);
		System.out.printf(" the average is %.2f and the standard deviation is %.2f", average, standardDeviation);
		
		input.close();
	}

}