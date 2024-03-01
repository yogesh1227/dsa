package BasicPrograms;

import java.util.Scanner;

public class SwitchProgram {

    public static void main(String[] args) {

        String fruit;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of fruit");
        fruit = input.nextLine();

        // in this first we are taking a string input
        // switch is mostly used when we have mulpile if conditions and the
        // code looks repitative so in order to solve the problem we use
        // swich cases.

        switch (fruit) {
            case "mango":
                System.out.println("King of fruit");
                break;
            case "apple":
                System.out.println("fruit apple");
                break;
            default:
                System.out.println("Please enter valid fruit");
        }
    }
}
