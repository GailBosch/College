// -- Wk 5 - Account1 --
// During execution, the compiler is confused. Whether "a" on the left side
// of the assigned operator is the instance variable or the local variable.
// Hence, it does not set the value of "a" when the method set data is called.

public class Account
{
    private int a, b;
    
    public void setData(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void showData()
    {
        System.out.println("Value of A = " + a);
        System.out.println("Value of B = " + b);
    }
   
    public static void main (String[] args)
    {
        Account obj = new Account();
        obj.setData(2, 3);
        obj.showData();
    }
}

//// Instance VAriables
//// Output - Name: null
//
//public class Account
//{	
//    private String name;
//	
//    public String getName()
//    {
//        return name;
//    }
//
//    public static void main(String[] args)
//    {
//        Account acc = new Account();
//	System.out.println("Name: " + acc.getName());
//    }
//}