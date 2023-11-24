import java.util.Scanner;

public class IdentifyUpTo {

	public static void main(String[] args) {
		boolean quit = false;
		Scanner input = new Scanner( System.in );
		do {
			System.out.print("Enter the maximum positive whole number to be considered (or -1 to quit)>");
			if (input.hasNextInt())
			{
				int number = input.nextInt();
				if (number == -1)
				{
					quit = true;
				}
				else if (number > 0)
				{
					if (number < 11)
					{
						System.out.printf("\n  There are no numbers which are both zygodromes and nude up to %d\n", number);
					}
					else
					{
						System.out.printf("\n The numbers which are both zygodromes and nude up to %d are ", number);
						for (int i = 0; i <= (number); i++)
						{
							if (isNude(i) && isZygodrome(i))
							{
								if (i == 11)
									System.out.printf("%d", i);
								else
									System.out.printf(", %d", i);
							}
						}
						System.out.printf("\n");
					}
				}
				else
				{
					System.out.printf("\n Error: %d is not a positive number. \r\n", number);
				}
			}
			else
			{
				String value = input.nextLine();
				System.out.printf("\n  Error: %s is not a positive whole number.\n", value);
			}
		} while (!quit);
		
		input.close();
	}
	public static boolean isNude( int number )
	{
		if (number == 0)
			return false;
		String numberString = Integer.toString(number);
		for(int i = 0; i < numberString.length(); i++)
		{
			int digit = Character.getNumericValue(numberString.charAt(i));
			if (digit == 0)
				return false;
			if (number % digit != 0)
				return false;
		}
		return true;
	}
	public static int getNumberOfDigits( int number )
	{
		String numberString = Integer.toString(number);
		int value = numberString.length();
		return value;
	}
	public static int getDigit( int number, int digitNumber )
	{
		String numberString = Integer.toString(number);
		if ( digitNumber > numberString.length() || digitNumber < 1)
			return -1;
		int digit = Character.getNumericValue(numberString.charAt(digitNumber - 1));
		if (digit >= 0 && digit <= 9)
		{
			return digit;
		}
		else
		{
			return -1;
		}
	}
	public static boolean isZygodrome( int number )
	{
		if (number < 1)
			return false;
		int repetition = 0;
		String numberString = Integer.toString(number);
		for(int i = 1; i < (numberString.length()); i++)
		{
			int value1 = getDigit( number, i );
			int value2 = getDigit( number, (i + 1) );
			if (value1 == -1 || value2 == -1)
			{
				return false;
			}
			if (value1 == value2)
			{
				repetition += 1;
			}
			else
			{
				if (repetition < 1)
				{
					return false;
				}
				repetition = 0;
			}
		}
		if (repetition >= 1)
		{
			return true;
		}
		return false;
	}
}
