package BasicPrograms;

import java.util.Scanner;

public class DayNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day number");
        int dayNumber = input.nextInt();

        // this is anpother way to represent switch case
        // logic is if the day no is from 1 to 5 its weekday
        // if 6 or 7 its weekend

        switch (dayNumber)
        {
            case 1,2,3,4,5 -> System.out.println("weekday do you work");
            case 6,7 -> System.out.println("weekend chill");
            default -> System.out.println("enter from 1 to 7 only");
        }

    }
}
