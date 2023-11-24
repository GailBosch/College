// -- Wk6 - Counter2 --
// Static variable definition
public class Counter
{  
    static int count = 0;

    Counter()
    {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args)
    {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}

// -- Wk6 - Counter1 --
//// Static Variable Rules
//
//// In this example, we have created an instance variable named count
//// which is incremented in the constructor. Each variable will have
////  its own copy of the instance variable. So each object will have
//// the value 1 in the count variable
//
//
//public class Counter
//{  
//    int count = 0;
//
//    Counter()
//    {
//        count++;
//        System.out.println(count);
//    }
//
//    public static void main(String[] args)
//    {
//        Counter c1 = new Counter();
//        Counter c2 = new Counter();
//        Counter c3 = new Counter();
//    }
//} 