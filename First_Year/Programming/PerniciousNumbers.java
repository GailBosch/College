import java.util.Scanner;

public class PerniciousNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner ( System.in );
		int workingNumber = 2;
		System.out.println("Enter the maximum number you want to consider:");
		
		
		
		
		int number = input.nextInt();
		while (number > workingNumber)
		{
			if (isPernicious(workingNumber));
			{
				System.out.printf("%d is a pernicious number as it contains %d ones in it's binary representation (%s)%n", workingNumber, countBinaryOnes(workingNumber), getBinaryString(workingNumber));
			}
			workingNumber = workingNumber + 1;
		}
		input.close();
	}
	public static boolean isPrime(int number)
	{
		if(number<=1)
        {
            return false;
        }
       for(int test=2;test<=number/2;test++)
       {
           if((number%test)==0)
               return  false;
       }
       return true;
	}
	public static int countBinaryOnes(int number)
	{
		String binaryNumber = getBinaryString(number);
		int countBinaryOnes = binaryNumber.length() - binaryNumber.replaceAll("1", "").length();
		return countBinaryOnes;
	}
	
	public static String getBinaryString(int number)
	{
		int binaryNumber = 0;
		int divisor = 128;
		while (number < divisor)
		{
			divisor = (divisor/2);
		}
		
		while (divisor > 0)
		{
			binaryNumber = binaryNumber * 10;
			if (number >= divisor)
			{
				number = number - divisor;
				binaryNumber = binaryNumber + 1;
			}
			divisor = (divisor/2);
		}
		String getBinaryString = String.valueOf(binaryNumber);
		return getBinaryString;
	}
	public static boolean isPernicious(int number)
	{
		int noOfOnes = countBinaryOnes(number);
		if (isPrime(noOfOnes))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
