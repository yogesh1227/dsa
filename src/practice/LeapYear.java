package practice;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 4 == 0)
        {
            System.out.println("It's leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
