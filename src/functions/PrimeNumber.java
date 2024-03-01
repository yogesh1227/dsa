package functions;

public class PrimeNumber {


    public static void fun(int number){

        for(int i =2; i<= number/2;i++)
        {
            if(!( number % i == 0))
            {
                System.out.println("number is prime");
                break;
            }
            else{
                System.out.println("number is not prime");
                break;
            }
        }
    }

    public static void main(String[] args) {
       fun(7);

    }
}
