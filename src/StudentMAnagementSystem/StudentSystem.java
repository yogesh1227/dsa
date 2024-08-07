package StudentMAnagementSystem;

import java.util.Scanner;



public class StudentSystem {


    public static void main(String[] args) {

        StudentOperations studentOperations = new StudentOperations();

        Scanner scan = new Scanner(System.in);

        System.out.println("---------------Student management system----------------");

        int choice;
        while (true) {

            System.out.println("please enter 1 to add student");
            System.out.println("please enter 2 to delete student");
            System.out.println("please enter 3 to update student");
            System.out.println("please enter 4 to search student");
            System.out.println("please enter 5 to show all student");
            System.out.println("please enter 6 to quit");
            System.out.println("----------------------------------------------------");
            System.out.println("please enter your choice");
            choice = scan.nextInt();

            if (choice == 1) {
                System.out.println("----------------------------------------------------");
                studentOperations.addStudent();
                System.out.println("Student added successfully");


            } else if (choice == 2) {
                System.out.println("----------------------------------------------------");
                studentOperations.deleteStudent();

            } else if (choice == 3) {
                System.out.println("----------------------------------------------------");
                studentOperations.updateStudent();

            } else if (choice == 4) {
                studentOperations.search();
                System.out.println("----------------------------------------------------");

            } else if (choice == 5) {
                System.out.println("----------------------------------------------------");
                studentOperations.showStudents();
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("enter correct choice");
            }
        }
    }
}
