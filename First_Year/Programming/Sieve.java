import java.util.Scanner;

public class Sieve
{
	
    public static boolean[] createSequence(int N)
    {
    	if (N > 2)
    	{
        	boolean[] numbers = new boolean[N + 1];
        	
    		numbers[0] = true;
    		numbers[1] = true;
        	
        	return numbers;
    	}
    	else throw new IllegalArgumentException("Your number needs to be greater than 2.");
    }

    public static void crossOutHigherMultiples(boolean[] cool, int N)
    {
    	cool[N] = false;
    	int test = N;
    	test += N;
    	while (test < cool.length)
  	  	{
			cool[(test)] = true;
			test += N;
  	  	}
    }

    public static String sequenceToString(boolean[] finishedArray)
    {
    	int j = 3;
    	String finalString = Integer.toString(2);
    	for (int i = 3; i < (finishedArray.length); i++)
    	{
    		finalString += ", ";
    		if (finishedArray[i]) 
    		{
    			finalString += "[" + j + "]";
    		}
    		else {
    			finalString += j;
    		}
    		
    		j++;
    	}
    	
    	return finalString;
    }

    public static String nonCrossedOutSubseqToString(boolean[] finishedArray)
    {
    	int j = 3;
    	String finalString = Integer.toString(2);
    	for (int i = 3; i < (finishedArray.length); i++)
    	{
    		if (!finishedArray[i]) 
    		{	
    			finalString += ", ";
    			finalString += j;
    		}
    		
    		j++;
    	}
    	
    	return finalString;
    }
   
    public static void main(String[] args)
    {
    	Scanner input = new Scanner( System.in );
    	
    	System.out.print("Enter int >= 2 : ");
    	int N = input.nextInt();
    	boolean[] sequenceArray = createSequence(N);
    	System.out.println(N);
    	System.out.println(sequenceToString(sequenceArray));
    	
    	for (int i = 2; i < N; i++)
    	{
    		boolean isPrime = true;
    		for (int j = 2; j <= i / 2; j++) 
    		{
    			if ((i % j == 0)) {
    		    	isPrime = false;
    		        break;
    		      }
    		}
    		if (isPrime)
		      {
    			String copyOfArray = sequenceToString(sequenceArray);
		    	crossOutHigherMultiples(sequenceArray, i);
		    	String crossedArray = sequenceToString(sequenceArray);
		    	if (!(copyOfArray.equals(crossedArray)))
		    	{
		    		System.out.println(crossedArray);
		    	}
		      }

    	}
    	System.out.print(nonCrossedOutSubseqToString(sequenceArray));
    	input.close();
    }

}