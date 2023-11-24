import java.util.Scanner;

public class Prizes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		boolean exit = false;
		boolean wonPrize = false;
		String placeName = "";
		String prize = "";

		System.out.println("This program tells competition participants what prize they have won.");
		
		do
		{
			
			System.out.println("Enter your place number (or type 'exit'):");
			if (input.hasNextInt())
			{
				int place = input.nextInt();
				if (place > 0)
				{
					switch(place)
					{
					case 1:
						wonPrize = true;
						placeName = "1st";
						prize = "two theatre tickets + drinks during the interval + dinner before the show";
						break;
					case 2:
						wonPrize = true;
						placeName = "2nd";
						prize = "two theatre tickets + drinks during the interval";
						break;
					case 3:
						wonPrize = true;
						placeName = "3rd";
						prize = "two theatre tickets";
						break;
					case 4:
						wonPrize = true;
						placeName = "4th";
						prize = "a 10 Euro book token";
						break;
					case 5:
						wonPrize = true;
						placeName = "5th";
						prize = "a 10 Euro book token";
						break;
					case 6:
						wonPrize = true;
						placeName = "6th";
						prize = "a 5 Euro book token";
						break;
					case 7:
						wonPrize = true;
						placeName = "7th";
						prize = "a 5 Euro book token";
						break;
					case 8:
						wonPrize = true;
						placeName = "8th";
						prize = "a 5 Euro book token";
						break;
					case 9:
						wonPrize = true;
						placeName = "9th";
						prize = "a 5 Euro book token";
						break;
					case 10:
						wonPrize = true;
						placeName = "10th";
						prize = "a 5 Euro book token";
						break;
					default:
					
					}
					
					if (wonPrize)
					{
						System.out.printf("You came in %s place and hence won %s.%n", placeName, prize);
						wonPrize = false;
					}
					else
					{
						System.out.println("Sorry. You did not win a prize.");
					}
				}
				else
				{
					System.out.println("Sorry. You did not win a prize.");
				}
			}
			else if (input.hasNext("exit"))
			{
				exit = true;
			}
			else
			{
				System.out.println("Sorry. You did not win a prize.");
				input.next();
			}
		} while (!exit);
		
		input.close();

	}

}
