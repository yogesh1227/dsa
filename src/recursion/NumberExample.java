package recursion;

public class NumberExample {

    public static void main(String[] args) {


        }
    static void print1(int n) {
        System.out.println(n);
        print2( 2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3( 2);
    }
    static void print3(int n) {
        System.out.println(n);
        print3( 2);
    }
}
