// -- Wk 3 - ArrayList --
import java.util.*;

class BankCustomer
{
    private int accountNumber;
    private String customerName;
    private String customerAddress;
    private int customerDateOfBirth;

    public int getAccountNumber()
    {
	return accountNumber;
    }

    public void setAccountNumber(int accNumber)
    {
	accountNumber = accNumber;
    }

    public String getCustomerName()
    {
	return customerName;
    }

    public void setCustomerName(String name)
    {
	customerName = name;
    }

    public String getCustomerAddress()
    {
	return customerAddress;
    }

    public void setCustomerAddress(String address)
    {
	customerAddress = address;
    }

    public int getCustomerDateOfBirth()
    {
	return customerDateOfBirth;
    }

    public void setCustomerDateOfBirth(int dob)
    {
	customerDateOfBirth = dob;
    }

    public static String findCustomer(ArrayList<BankCustomer> array, int accNumber)
    {
	int i = 0;
	boolean found = false;
	while(!found)
        {
	    if(array.get(i).accountNumber == accNumber)
		found = true;
	    else
		i++;
	}
	return array.get(i).customerName;
    }

    public static void main(String[] args)
    {
	ArrayList<BankCustomer> bankCustomers = new ArrayList<BankCustomer>();
	
	bankCustomers.add(new BankCustomer());
	bankCustomers.get(0).setAccountNumber(12345);
	bankCustomers.get(0).setCustomerName("Joe Rooney");
	bankCustomers.get(0).setCustomerAddress("Apt 2, Trinity College");
	bankCustomers.get(0).setCustomerDateOfBirth(210598);

	String cus;
        cus = findCustomer(bankCustomers, 12345);
	System.out.printf("%n%s%n", cus);
    }
}
// -- Wk 3 - MethodOverLoad --
//class BankCustomer
//{
//    private int accountNumber;
//    private String customerName;
//    private String customerAddress;
//    private int customerDateOfBirth;
//
//    public int getAccountNumber()
//    {
//	return accountNumber;
//    }
//
//    public void setAccountNumber(int accNumber)
//    {
//	accountNumber = accNumber;
//    }
//
//    public String getCustomerName()
//    {
//	return customerName;
//    }
//
//    public void setCustomerName(String name)
//    {
//	customerName = name;
//    }
//
//    public String getCustomerAddress()
//    {
//	return customerAddress;
//    }
//
//    public void setCustomerAddress(String address)
//    {
//	customerAddress = address;
//    }
//
//    public int getCustomerDateOfBirth()
//    {
//	return customerDateOfBirth;
//    }
//
//    public void setCustomerDateOfBirth(int dob)
//    {
//	customerDateOfBirth = dob;
//    }
//
//    public static String findCustomer(BankCustomer[] array, int accNumber)
//    {
//	int i = 0;
//	boolean found = false;
//	while(!found)
//        {
//	    if(array[i].accountNumber == accNumber)
//		found = true;
//	    else
//		i++;
//	}
//	return array[i].customerName;
//    }
//
//    public static String findCustomer(BankCustomer[] array, int dob, String addr)
//    {
//	int i = 0;
//	boolean found = false;
//	while(!found)
//        {
//	    if(array[i].customerDateOfBirth == dob && array[i].customerAddress == addr)
//		found = true;
//	    else
//	        i++;
//	}
//	return array[i].customerName;
//    }
//
//    public static void main(String[] args)
//    {
//	String cus;
//	BankCustomer[] bankCustomers = new BankCustomer[10];
//
//	for(int i=0; i<bankCustomers.length; i++)
//	    bankCustomers[i] = new BankCustomer();
//
//	bankCustomers[0].setAccountNumber(12345);
//	bankCustomers[0].setCustomerName("Joe Rooney");
//	bankCustomers[0].setCustomerAddress("Apt 2, Trinity College");
//	bankCustomers[0].setCustomerDateOfBirth(210598);
//
//	bankCustomers[1].setAccountNumber(56789);
//	bankCustomers[1].setCustomerName("Jane McDonald");
//	bankCustomers[1].setCustomerAddress("Apt 34, Temple Bar, Dublin 2");
//	bankCustomers[1].setCustomerDateOfBirth(210598);
//
//        cus = findCustomer(bankCustomers, 12345);
//	System.out.printf("%n%s%n", cus);
//
//	cus = findCustomer(bankCustomers, 210598, "Apt 34, Temple Bar, Dublin 2");
//	System.out.printf("%n%s%n", cus);
//    }
//}
// -- Wk 2 --
//public class BankCustomer {
//	
//	private int accountNumber;
//	private String customerName;
//	private String customerAddress;
//	private int customerDateOfBirth;
//	
//	public static void main(String[] args) {
//		
//		BankCustomer[] bankCustomerArray = new BankCustomer[10];
//		
//		for(int i=0; i < bankCustomerArray.length; i++)
//		    bankCustomerArray[i] = new BankCustomer();
//
//		bankCustomerArray[0].setAccountNumber(54321);
//		bankCustomerArray[0].setCustomerName("yoloswag");
//		bankCustomerArray[0].setCustomerAddress("pootown");
//		bankCustomerArray[0].setCustomerDateOfBirth(12);
//		
//		bankCustomerArray[1].setAccountNumber(12345);
//		bankCustomerArray[1].setCustomerName("bossman");
//		bankCustomerArray[1].setCustomerAddress("koolio");
//		bankCustomerArray[1].setCustomerDateOfBirth(7);
//		
//		int dobby = 7;
//		String addy = "koolio";
//		
//		System.out.println("Customer Account Number is " + bankCustomerArray[0].getAccountNumber());
//		System.out.println(findCustomer(dobby, addy, bankCustomerArray));
//		
//    }
//	
//	public  static String findCustomer (int accountNumber, BankCustomer[] bankCustomerArray)
//	{
//		for(int i=0; i < bankCustomerArray.length; i++) {
//			int customerNumber = bankCustomerArray[i].getAccountNumber();
//			if (customerNumber == accountNumber) {
//				return bankCustomerArray[i].getCustomerName();
//			}
//		}
//		return "none";
//	}
//	
//	public  static String findCustomer (int customerDateOfBirth, String customerAddress, BankCustomer[] bankCustomerArray)
//	{
//		for(int i=0; i < bankCustomerArray.length; i++) {
//			String userAddress = bankCustomerArray[i].getCustomerAddress();
//			int userDOB = bankCustomerArray[i].getCustomerDateOfBirth();
//			if (userAddress == customerAddress && userDOB == customerDateOfBirth) {
//				return bankCustomerArray[i].getCustomerName();
//			}
//		}
//		return "none";
//	}
//	
//	public int getAccountNumber()
//    {
//        return accountNumber;
//    }
//    public void setAccountNumber(int accNumb)
//    {
//        accountNumber = accNumb;
//    }
//    
//    public String getCustomerName()
//    {
//        return customerName;
//    }
//    public void setCustomerName(String accName)
//    {
//    	customerName = accName;
//    }
//    
//    public String getCustomerAddress()
//    {
//        return customerAddress;
//    }
//    public void setCustomerAddress(String addy)
//    {
//        customerAddress = addy;
//    }
//    
//    public int getCustomerDateOfBirth()
//    {
//    	return customerDateOfBirth;
//    }
//	public void setCustomerDateOfBirth(int dob)
//    {
//        customerDateOfBirth = dob;
//    }
//}

// -- Wk 1 --
//public class BankCustomer
//{
//    private int accountNumber;
//    private String customerName;
//    private String customerAddress;
//    private int customerDateOfBirth;
//
//    public int getAccountNumber()
//    {
//	return accountNumber;
//    }
//
//    public void setAccountNumber(int accNumber)
//    {
//	accountNumber = accNumber;
//    }
//
//    public String getCustomerName()
//    {
//	return customerName;
//    }
//
//    public void setCustomerName(String name)
//    {
//	customerName = name;
//    }
//
//    public String getCustomerAddress()
//    {
//	return customerAddress;
//    }
//
//    public void setCustomerAddress(String address)
//    {
//	customerAddress = address;
//    }
//
//    public int getCustomerDateOfBirth()
//    {
//	return customerDateOfBirth;
//    }
//
//    public void setCustomerDateOfBirth(int dob)
//    {
//	customerDateOfBirth = dob;
//    }
//
//    public static void main(String[] args)
//    {
//	BankCustomer cust1 = new BankCustomer();
//
//	cust1.setAccountNumber(12345);
//	cust1.setCustomerName("John Smith");
//	cust1.setCustomerAddress("Beverly Hills");
//	cust1.setCustomerDateOfBirth(290271);
//    }
//}