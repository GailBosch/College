import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO
{
	FileIO() {}
    public String findLongestWord(String fileName)
    {
    	String longestWord = "";
    	ArrayList<String> lineArray = fileToArray(fileName);
    	String[] newArray;
    	for(int i = 0; i < lineArray.size(); i++) {
    		newArray = lineArray.get(i).split(" ");
    		for(int j = 0; j < newArray.length; j++) {
    			if(newArray[j].length() > longestWord.length()) {
    				longestWord = newArray[j];
    			}
    		}
    	}
    	return longestWord;
    }

    public ArrayList<String> fileToArray(String fileName)
    {
    	ArrayList<String> fileArray = new ArrayList<String>();
    	try {
    		FileReader fr = new FileReader(fileName);    
            BufferedReader br = new BufferedReader(fr);
            
            try {  
    			String strCurrentLine;
    			
    			while ((strCurrentLine = br.readLine()) != null) 
    			{
    			    fileArray.add(strCurrentLine);
    			}  
    		}catch(Exception e){System.err.println(e);}
        	br.close();    
    		fr.close();
    	} catch(Exception e){System.err.println(e);}
    	
    	return fileArray;
    }
    
    public static void main(String[] args)
    {
    	FileIO reader = new FileIO();
    	Scanner input = new Scanner( System.in );
    	System.out.print("Enter Filename: ");
    	String userInput = input.next();
    	System.out.println(userInput);
    	System.out.println("");
    	String longWord = reader.findLongestWord(userInput);
    	System.out.println("The longest word in the file is: " + longWord);
    	System.out.println("");
    	System.out.println("The lines in the file are:");
    	System.out.print("[");
    	
    	ArrayList<String> newFile = reader.fileToArray("example.txt");
    	for(int i = 0; i < newFile.size(); i++) {
    		System.out.print(newFile.get(i)); 
    		if (i < (newFile.size()-1)) System.out.print(", ");
    	}
    	System.out.print("]");
    	input.close();
    }
}