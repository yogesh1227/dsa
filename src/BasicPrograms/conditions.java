package BasicPrograms;

import java.util.Scanner;

public class conditions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary;
        System.out.println("please enter your salary");
        salary = input.nextInt();
            if(salary < 0) {
                System.out.println("salary cannot be negative");
            }
            else if (salary > 10000) {
                salary = salary + 2000;
                System.out.println("New salary after bonus is " + salary);
            }
            else {
                salary = salary + 1000;
                System.out.println("New salary after bonus is " + salary);
            }
    }
}
