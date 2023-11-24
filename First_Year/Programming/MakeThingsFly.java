// The method letTheMachinesFly also works without any change
// when you add a new class, for example PropellerPlane

import java.util.List;

public class MakeThingsFly
{
    public void letTheMachinesFly(List<FlyingMachine> flyingMachines)
    {
        for (FlyingMachine flyingMachine : flyingMachines)
        {
            flyingMachine.fly();
        }
    }
}
