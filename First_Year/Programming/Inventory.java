import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	public static ArrayList<Item> ItemList;
	public static ArrayList<Order> OrderList;
	int idNo;
	
	Inventory(){}
	
	public void addItem(String itemName, double itemPrice, int itemQuantity)
	{
		Item current = new Item(idNo, itemName, itemPrice, itemQuantity);
		idNo++;
		ItemList.add(current);
	}
	public void createOrder(Item item) {
		Order current = new Order(item);
		OrderList.add(0, current);
	}
	
	public static void main(String[] args) {
		Inventory shop = new Inventory();
		shop.ItemList = new ArrayList<Item>();
		shop.OrderList = new ArrayList<Order>();
		System.out.println("How many items would you like to create? ");
		Scanner input = new Scanner( System.in );
		int orderNo = input.nextInt();
		for(int i = 1; i <= orderNo; i++) {
			System.out.println("Enter order No." + i + ":(in the form: ItemName ItemPrice ItemQuantity )");
			String name = input.next();
			double price = input.nextDouble();
			int quantity = input.nextInt();
			shop.addItem(name, price, quantity);			
		}
	}
}
