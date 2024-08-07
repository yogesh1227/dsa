package Transport;

public class Vehicle {
    public String name;

    public String model;
    public int noOfTyres;


    public Vehicle()
    {
        System.out.println("Default constructor is called");

        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

 public  void vehicle (String name, String model, int noOfDoors)
    {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    public void start_engine()
    {
        System.out.println("Engine started %s : %s" + name + " " + model);
    }

    public void stop_engine()
    {
        System.out.println("Engine stopped %s : %s" + name + " " + model);
    }
}
