// -- Wk 5 - This8 --
public class Beta
{  
    public static void main(String args[])
    {  
        new Alpha().getA().msg();  
    }  
} 

// -- Wk 5 - This7 --
//// this: passed as an argument in a constructor call
//
//public class Beta
//{
//    Alpha obj;
//    Beta(Alpha obj)
//    {
//        this.obj = obj;
//    }
//    void display()
//    {
//        System.out.println(obj.data); // Using data member of A class
//    }
//}

// -- Wk 5 - This3 --
//public class Beta
//{
//    public static void main(String[] args)
//    {
//	    Alpha a = new Alpha(10);
//    }
//}
// -- Wk 5 - This2 --
//public class Beta
//{
//    public static void main(String[] args)
//    {
//	    Alpha a = new Alpha();
//	    a.n();
//    }
//}
// -- Wk  - 
////// Beta.java:6: error: iamprivate has private access in Alpha
//////Â  Â  Â  a.iamprivate = 10;
////
//public class Beta
//{
//    public static void main(String[] args)
//    {
//        Alpha a = new Alpha();
//        a.setPrivate(10);
//    }
//}