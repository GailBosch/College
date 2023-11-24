// Driver code

public class BoxTest
{
    public static void main(String args[])
    {
        // Create boxes using the various constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
 
        double vol;
 
        // Get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
 
        // Get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
 
        // Get volume of cube
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}