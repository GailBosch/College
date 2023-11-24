import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WordLinks
{
	public boolean isWordLinks;
	
    public ArrayList<String> readDictionary(BufferedReader file)
    {
    	ArrayList<String> list = new ArrayList<String>();
    	
    	try {  
    			String strCurrentLine;
    			
    			while ((strCurrentLine = file.readLine()) != null) 
    			{
    			    list.add(strCurrentLine);
    			}  
    		}catch(Exception e){System.err.println(e);}
    	
    	return list;
    }     

    public String[] readWordList(String wordList)
    {  	
    	return wordList.split(", ");
    }

    public boolean isUniqueList(String[] wordListArray)
   {
    	if (wordListArray.length < 2) return false;
    	for (int i = 0; i < wordListArray.length - 1; i++)
    	{
    		String marker = wordListArray[i];
    		for (int j = i+1; j < wordListArray.length; j++) {
    			if (marker.equals(wordListArray[j])) return false;
    		}
    	}
    	return true;

   }

    public boolean isEnglishWord(String[] wordListArray, String[] diction) 
    {
    	for (int i = 0; i < wordListArray.length; i++)
    	{
    	if (Arrays.binarySearch(diction, wordListArray[i]) < 0) return false;
    	}
    	return true;
    }

    public boolean isDifferentByOne(String[] wordListArray)
    {  	
    	for (int i = 0; i < wordListArray.length-1; i++)
    	{
    		String word1 = wordListArray[i];
    		String word2 = wordListArray[i+1];
    		int difference = 0;
        	if (word1.length() != word2.length()) return false;
      
            for (int j = 0; j < word1.length(); j++) {
                int str1_ch = (int)word1.charAt(j);
                int str2_ch = (int)word2.charAt(j);
      
                if (str1_ch != str2_ch) {
                    difference++;
                }
            }
            if (difference != 1) return false;
    	}
    	return true;
    }

    public void isWordChain(String[] diction, String[] wordListArray)
    {
    	if (isUniqueList(wordListArray) && isEnglishWord(wordListArray, diction) && isDifferentByOne(wordListArray)) isWordLinks = true;
    	else isWordLinks = false;
    }
	
    public static void main(String[] args)
    {
    	WordLinks game = new WordLinks();
    	ArrayList<String> diction = new ArrayList<String>();
    	try {
    		FileReader fr = new FileReader("words.txt");    
            BufferedReader br = new BufferedReader(fr); 
            diction = game.readDictionary(br);
        	br.close();    
    		fr.close();
    	} catch(Exception e){System.err.println(e);}
    	
    	System.out.println("Enter a comma separated list of words (or an empty list to quit):");
    	Scanner input = new Scanner( System.in );
    	boolean quit = false;
    	while (!quit) 
    	{
    		String wordList = input.nextLine();
    		System.out.println(wordList);
        	if (wordList == "") break;

        	String[] wordListArray = game.readWordList(wordList);
        	
        	String[] dictionArray = new String[diction.size()];
            dictionArray = diction.toArray(dictionArray);
        	
        	game.isWordChain(dictionArray, wordListArray);
        	
        	if (game.isWordLinks) System.out.println("Valid chain of words from Lewis Carroll's word-links game.");
        	else System.out.println("Not a valid chain of words from Lewis Carroll's word-links game");
    	}
    	input.close();
    	
    }
}