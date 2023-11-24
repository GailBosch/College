// Java Interface Example

public class HatchBack implements Car
{ 
    private int speed = 0; 
    private int gear = 1; 

    public void changeGear(int newValue)
    { 
        gear = newValue; 
    } 

    public void speedUp(int increment) 
    { 
        speed = speed + increment; 
    } 

    public void applyBrake(int decrement)
    { 
        speed = speed - decrement; 
    } 

    public void printStates() 
    { 
        System.out.println("speed:" + speed + " gear:" + gear);

    } 

    public static void main(String[] args)
    {
        HatchBack c = new HatchBack();
        c.printStates();
    }
} 