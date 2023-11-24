
public class TwelveDays {

	public static void main(String[] args) {
		
		int dayNumber = 1;
		
		do
		{
			
			switch(dayNumber)
			{
			case 12:
				System.out.println("On the twelfth day of Christmas,");
				break;
			case 11:
				System.out.println("On the eleventh day of Christmas,");
				break;
			case 10:
				System.out.println("On the tenth day of Christmas,");
				break;
			case 9:
				System.out.println("On the ninth day of Christmas,");
				break;
			case 8:
				System.out.println("On the eighth day of Christmas,");
				break;
			case 7:
				System.out.println("On the seventh day of Christmas,");
				break;
			case 6:
				System.out.println("On the sixth day of Christmas,");
				break;
			case 5:
				System.out.println("On the fifth day of Christmas,");
				break;
			case 4:
				System.out.println("On the fourth day of Christmas,");
				break;
			case 3:
				System.out.println("On the third day of Christmas,");
				break;
			case 2:
				System.out.println("On the second day of Christmas,");
				break;
			default:
				System.out.println("On the first day of Christmas,");
			}
			
			System.out.println("My true love sent to me:");
			
			switch(dayNumber)
			{
			case 12:
				System.out.println("12 Drummers Drumming,");
			case 11:
				System.out.println("11 Pipers Piping,");
			case 10:
				System.out.println("10 Lords a Leaping,");
			case 9:
				System.out.println("9 Ladies Dancing,");
			case 8:
				System.out.println("8 Maids a Milking,");
			case 7:
				System.out.println("7 Swans a Swimming,");
			case 6:
				System.out.println("6 Geese a Laying,");
			case 5:
				System.out.println("5 Golden Rings,");
			case 4:
				System.out.println("4 Calling Birds,");
			case 3:
				System.out.println("3 French Hens,");
			case 2:
				System.out.println("2 Turtle Doves,");
			default:
				if (dayNumber == 1)
					System.out.println("a Partridge in a Pear Tree.");
				else
					System.out.println("and a Partridge in a Pear Tree.");
			}
			
			System.out.println("");
			
			dayNumber = dayNumber + 1;
			
		} while (dayNumber != 13);
	}

}
