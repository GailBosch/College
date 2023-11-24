import java.util.Scanner;

public class MarksRemapper {
	public static final double DESIRED_AVERAGE = 60.0;
	public static final double DESIRED_STANDARD_DEVIATION = 20.0;
	public static final double MIN_MARK=0.0;
	public static final double MAX_MARK=100.0;

	public static void main(String[] args) {
		
		System.out.println("Enter all percentages (separated by spaces):");
		Scanner input = new Scanner ( System.in );
		double marks[] = new double[0];
		String[] placeHolder = input.nextLine().split(" ");
		int marksCount = 0;
		boolean isError = false;
		boolean hasError = false;
		String errorvalue = "";
		
		while ((marksCount < placeHolder.length))
		{
			isError = false;
			try {
		        Double.parseDouble(placeHolder[marksCount]);
		    }
		    catch( Exception e ) {
		    	isError = true;
		    }
			
			if (!isError)
			{
				double mark = Double.parseDouble(placeHolder[marksCount]);
				if ((mark >= MIN_MARK) && (mark <= MAX_MARK))
				{
					double[] tempArray = new double[marks.length+1];
					System.arraycopy( marks, 0, tempArray, 0, marks.length );
					tempArray[tempArray.length-1] = mark;
					marks = tempArray;
				}
				else
				{
					errorvalue = placeHolder[marksCount];
					hasError = true;
				}
			}
			else
			{
				errorvalue = placeHolder[marksCount];
				hasError = true;
			}
			marksCount += 1;
		}
		
		double newMark = 0;
		double fixedMarks[] = new double[marks.length];
		
		if (modifyAllMarks(marks, DESIRED_AVERAGE, DESIRED_STANDARD_DEVIATION ))
		{
			for (int index=0; index < marks.length; index++)
			{
				newMark = DESIRED_AVERAGE + (marks[index] - determineAverageMark(marks))*DESIRED_STANDARD_DEVIATION/determineStandardDeviation(marks, determineAverageMark(marks));
				if (0 < newMark || newMark < 100)
				{
					fixedMarks[index] = newMark;
				}
				else
				{
					fixedMarks[index] = marks[index];
				}
			}
		}
		if (hasError)
		{
		System.out.printf("Error: %s is not a valid number.\n", errorvalue);
		}
		System.out.printf("The original average was %.1f and the standard deviation was %.1f\n",determineAverageMark(marks), determineStandardDeviation(marks, (determineAverageMark(marks))));
		marksCount = 0;
		while (marksCount < marks.length)
		{
			System.out.printf("%.1f->%.1f", marks[marksCount], fixedMarks[marksCount]);
			if ((marksCount + 1) < marks.length)
				System.out.print(", ");
			marksCount += 1;
		}
		System.out.printf("\nThe new average is %.1f and the new standard deviation is %.1f", determineAverageMark(fixedMarks), determineStandardDeviation(fixedMarks, (determineAverageMark(fixedMarks))));
		input.close();
	}
	public static double determineAverageMark( double[ ] arrayOfNumbers )
	{
		if ((arrayOfNumbers == null) || (arrayOfNumbers.length == 0))
			return 0.0;
		double totalMarks = 0;
		for (int index=0; index < arrayOfNumbers.length; index++)
			totalMarks += arrayOfNumbers[index];
		return totalMarks/arrayOfNumbers.length;
	}
	
	public static double determineStandardDeviation( double[] arrayOfNumbers, double average )
	{
		if ((arrayOfNumbers == null) || (arrayOfNumbers.length == 0))
			return 0.0;
		double totalMarksSquared = 0;
		for (int index=0; index < arrayOfNumbers.length; index++)
			totalMarksSquared += Math.pow((average - arrayOfNumbers[index]), 2);
		return Math.sqrt(totalMarksSquared/arrayOfNumbers.length);
	}
	public static boolean modifyAllMarks( double[] arrayOfMarks, double desiredAverage, double desiredStandardDeviation )
	{
		if ((arrayOfMarks == null) || (arrayOfMarks.length == 0))
			return false;
		double newPercentage = 0;
		for (int index=0; index < arrayOfMarks.length; index++)
		{
			newPercentage = DESIRED_AVERAGE + (arrayOfMarks[index] - determineAverageMark(arrayOfMarks))*DESIRED_STANDARD_DEVIATION/determineStandardDeviation(arrayOfMarks, determineAverageMark(arrayOfMarks));
			if (0 > newPercentage || newPercentage > 100)
			{
				return false;
			}
		}
		return true;
	}
}
