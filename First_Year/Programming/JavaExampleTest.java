// -- Wk 6 - StaticVariableAccess --
public class JavaExampleTest
{
    // This is also a static method
    public static void main(String args[]) 
    {
        JavaExample.age = 30;
        JavaExample.name = "Steve";
        JavaExample.disp();
    }
}