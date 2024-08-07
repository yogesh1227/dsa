package Transport;

public class MotorCycle extends Vehicle {

   public String handleBar;
   public String transmissionType;

public MotorCycle(String name, String model, int noOfTyres, String handleBar, String transmissionType)
{
    super.vehicle(name, model, noOfTyres);
    this.handleBar = handleBar;
    this.transmissionType = transmissionType;
}

public void wheelie()
{
    System.out.println("wheelie is done by " + name);
}


}
