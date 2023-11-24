// Collections in Java

import java.util.ArrayList;

public class ArrayListCollection
{ 
    public static void main(String[] args)
    {
        ArrayList<String> items = new ArrayList<String>();

        items.add("red"); // Append an item to the list
        items.add(0, "yellow"); // Insert yellow at index 0

        display(items, "List contents: ");

        items.add("green"); // Add to the end of the list
        display(items, "List with one new element: ");

        items.remove(1); // Remove the second item from list
	
        System.out.print("red is ");
	// Ternary operator
	System.out.println(items.contains("red") ? "": "not " + "in the list");
        
        System.out.println("Size: " + items.size());
    }

    public static void display(ArrayList<String> items, String header)
    {
        System.out.print(header);

	for(String item: items) // Enhanced for statement
            System.out.print(item + " ");
        
       System.out.println();
    }
}