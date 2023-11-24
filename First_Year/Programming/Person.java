// -- Wk 9 - Person --
public class Person
{
    private String firstName;
    private String lastName;
    private String address;
    protected int id;

    Person()
    {
    }

    Person(String firstName, String lastName, String address, int id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
	this.id = id;
    }
  
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getAddress()
    {
        return address;
    }

    public int getId()
    {
        return id;
    }

    public void display()
    {
	System.out.println(firstName + " " + lastName + " " + address + " " + id);
    }
}

// -- Wk x - --
//class Person
//{ 
//    public static String name; 
//      
//    public static void setName(String firstName)
//    { 
//        name = firstName; 
//    } 
//}