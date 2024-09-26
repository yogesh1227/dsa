package Shape;

public class Main {

    public static void main(String[] args) {


        Circle s = new Circle();
        doDraw(s);


        Shape s1 = new Rectangle();
        doDraw(s1);
    }

    public static void doDraw(Shape s){
        s.draw();
    }
}
