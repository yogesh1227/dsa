package Shape;

public class Circle implements Shape {

    public void print()
    {
        System.out.println("Printing Circle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
