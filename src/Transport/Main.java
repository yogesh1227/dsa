package Transport;

public class Main {

    public static void main(String[] args) {


        Car c = new Car("BMW", "X5", 4, 4, "Auto");
        c.start_engine();
        c.start_AC();
        c.stop_engine();


        MotorCycle m = new MotorCycle("Honda", "splendor", 2, "Leather", "Auto");
        m.start_engine();
        m.wheelie();
        m.stop_engine();
    }

}
