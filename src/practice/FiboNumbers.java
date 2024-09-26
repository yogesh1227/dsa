package practice;

import java.util.Scanner;

public class FiboNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int n = sc.nextInt();
        if(n <= 0)
        {
            System.out.println( "sum is "+ 0);

        }
        else{
            if(n ==1)
            {
                System.out.println("sum is" + 1);
            }
            else{
                System.out.println("sum is "  );
            }
        }
    }
}
