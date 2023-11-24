import java.util.Scanner;

public class ValidDate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		int daysInMonth = 0;
		

		
		input.close();

	}
	
	public static boolean isLeapYear(int year)
	{
		year = year/4;
		if (year == Math.round(year))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int daysInMonth(int month)
	{
		
		return daysInMonth;
	}

}
