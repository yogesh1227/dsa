package recursion;

public class FibonacciNumber {

    public static void main(String[] args) {


        // fibonacci series are 0,1,1,2,3,5,8,13 and so on.
        // it is the sum of two previous numbers like n = n-1 + n-2;
        // because 1st two numbers are 0 and 1;
        int result = fibonacci(4);
        System.out.println("fibonacci number of given number is " + result);
    }
//
    static int fibonacci(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
