package Transport;

public class Car extends Vehicle {

    public int noOfDoors;

    public String transmissionType;

   public Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType)
    {
        super.vehicle(name, model, noOfTyres);

        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void start_AC()
    {
        System.out.println("AC started of " + name);
    }
}
