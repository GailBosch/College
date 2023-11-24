import java.util.Scanner;

public class WeirdMathOp {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter a weird maths operator (B D L > <) and two integers>");
		String operatorString = input.next();
		char operator = operatorString.charAt(0);
		int number1 = 0;
		int number2 = 0;
		boolean format = true;
		
		if (input.hasNextInt())
			number1 = input.nextInt();
		else
			format = false;
		
		if (input.hasNextInt())
			number2 = input.nextInt();
		else
			format = false;
			
		if (format)
		{
			if (applyWeirdBinaryMathsEvaluation(operator, number1, number2))
				System.out.printf("Answer: %d %s %d is true", number1, operatorString, number2);
			else
				System.out.printf("Answer: %d %s %d is false", number1, operatorString, number2);
		}
		else
			System.out.printf("Answer: %d %s %d is false", number1, operatorString, number2);
		
		input.close();
	}
	public static boolean isPrime( int number)
	{
		if(number<=1)
        {
            return false;
        }
       for(int test = 2; test <= number / 2 ;test++)
       {
           if((number % test) == 0)
               return  false;
       }
       return true;
	}
	public static boolean isLucky( int number)
	{
		String numberString = Integer.toString(number);
		int addTotal = 0;
		for(int i = 0; i < numberString.length(); i++)
		{
			int digit = Character.getNumericValue(numberString.charAt(i));
			addTotal += digit;
		}
		
		int powerTotal = 0;
		for(int i = 0; i < numberString.length(); i++)
		{
			int digit = Character.getNumericValue(numberString.charAt(i));
			powerTotal += (Math.pow(digit, 2));
		}
		
		
		if (isPrime(addTotal) && isPrime(powerTotal))
			return true;
		else
			return false;
	}
	public static int sumOfNonTrivialDivisors( int number )
	{
		int total = 0;
		number = Math.abs(number);
		for(int i = 2; i < number; i++)
		{
			if (number % i == 0)
					total += i;
		}
		return total;
	}
	public static boolean areBetrothed( int number1, int number2)
	{
		if ((number1 == (sumOfNonTrivialDivisors(number2))) && (number2 == (sumOfNonTrivialDivisors(number1))))
			return true;
		else
			return false;
	}
	public static boolean applyWeirdBinaryMathsEvaluation(char operator, int number1, int number2)
	{
		if (operator == 'B')
		{
			if (areBetrothed(number1, number2))
				return true;
		}
		else if (operator == 'D')
		{
			if (number1 % number2 == 0)
				return true;
		}
		else if (operator == 'L')
		{
			if (isLucky(number1) || isLucky(number2))
				return true;
		}
		else if (operator == '<')
		{
			if (number1 < number2)
				return true;
		}
		else if (operator == '>')
		{
			if (number1 > number2)
				return true;
		}
		return false;
	}
}