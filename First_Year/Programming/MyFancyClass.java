// Anatomy of an OO Program

public class MyFancyClass
{
    //Class state (properties that an object has such as colour or size)
    private int age;
    
    public void setAge(int a)
    {
        //Class behaviour (actions an object can do)
    	this.age = a;
    }

    public static void main(String[] args)
    {
        //Create an object of type MyFancyClass in memory and get a reference to it
        MyFancyClass c = new MyFancyClass();
        c.setAge(10);
        System.out.print(c.age);
    }
}