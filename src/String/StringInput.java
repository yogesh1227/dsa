package String;

import java.util.Scanner;

public class StringInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // whenever there is space in name then it will print un til then
        System.out.println("please enter your first name");
        String firstName = sc.nextLine();


        System.out.println("please enter your last name");
        String lastName = sc.nextLine();
        System.out.println(firstName + " " +lastName);

//        // using nextLine it will print the whole line
//        System.out.println("please enter your name");
//        String name1 = sc.nextLine();
//        System.out.println(" my name is " +name1);

    }
}
