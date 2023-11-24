import java.util.ArrayList;
import java.util.List;

public class PolymorphismDemo
{
    public static void main(String[] args)
    {
        List<FlyingMachine> machines = new ArrayList<FlyingMachine>();
        machines.add(new FlyingMachine());
        machines.add(new Jet());
        machines.add(new Helicopter());

        new MakeThingsFly().letTheMachinesFly(machines);
    }
}