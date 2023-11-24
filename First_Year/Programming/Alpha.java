// -- Wk6 - Class_Instance_Variables --
//public class Alpha
//{  
//    // Class variable    
//    static int i;
//
//    // Instance variable
//    int j;			
//
//    // Class Variable    
//    static String s1; 	
//
//    // Instance variable    
//    String s2;
//}

// -- Wk 5 - This8 --
// this: used to return current class instance

public class Alpha
{  
    public Alpha getA()
    {  
        return this;  
    }  

    void msg()
    {
        System.out.println("Hello java");
    }
}  

// -- Wk 5 - This7 --
//// this: passed as an argument in a constructor call
//
//public class Alpha
//{
//    int data=10;
//
//    Alpha()
//    {
//        Beta b = new Beta(this);
//        b.display();
//    }
//
//    public static void main(String args[])
//    {
//        Alpha a = new Alpha();
//    }
//}

// -- Wk 5 - This3 --
//// this(): to invoke current class constructor
//
//public class Alpha
//{
//    Alpha()
//    {
//        System.out.println("hello a");
//    }
//
//    Alpha(int x)
//    {
//        this();
//        System.out.println(x);
//    }
//}

// -- Wk 5 - This2 --
//// this: to invoke the current class method
//public class Alpha
//{
//    public void m()
//    {
//	System.out.println("hello m");
//    }
//
//    public void n()
//    {
//	System.out.println("hello n");
//	//m(); //same as this.m()
//	this.m();
//    }
//} 
// -- Private Access Modifier --
//public class Alpha
//{
//    private int iamprivate;
//    public void setPrivate(int a) {
//    	iamprivate = a;
//    }
//}