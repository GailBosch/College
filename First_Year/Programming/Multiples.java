import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner ( System.in ) ;
		
		System.out.println("Enter your number: ");
		int userNo = input.nextInt();
		
		System.out.println("Enter the limit: ");
		int userLimit = input.nextInt();
		
		System.out.printf("The multiples of %d (up to %d) are ", userNo, userLimit);
		
		int multiplier = 1;
		int multiple = 0;
		
		for (int i = 1; multiple < userLimit; i++)
		{
			multiple = userNo*i;
			if (i > 1) System.out.print(", ");
			System.out.print(multiple);
			multiplier =+ 1;		
		}	
		
		input.close();

	}

}