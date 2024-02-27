package BasicPrograms;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        int FirstVar = input.nextInt();

        System.out.println("Please enter a number");
        int SecondVar = input.nextInt();

        System.out.println("Please enter a number");
        int ThirdVar = input.nextInt();

        if(FirstVar > SecondVar && FirstVar > ThirdVar)
        {
            System.out.println("largest of them is " + FirstVar);
        } else if (SecondVar > FirstVar && SecondVar > ThirdVar) {
            System.out.println("largest of them is " + SecondVar);
        }
        else{
            System.out.println("largest of them is " + ThirdVar);
        }
    }

}
