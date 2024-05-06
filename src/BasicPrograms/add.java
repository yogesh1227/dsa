package BasicPrograms;

import java.util.Scanner;

public class add {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter num");
        int in = input.nextInt();
        int i =1;
        int sum = 0;
        while( i <= in)
        {
            int temp;
            System.out.println("Please enter the " + i + " number");
            temp = input.nextInt();
            sum = sum + temp;
            i++;

        }
        System.out.println(" total is " + sum);
    }
}
