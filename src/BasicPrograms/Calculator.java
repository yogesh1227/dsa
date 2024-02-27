package BasicPrograms;

import java.util.Scanner;

public class Calculator  {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        char op = 'a';

        System.out.println("Enter the first number");
        number1 = input.nextInt();
        System.out.println("Enter the second number");
        number2 = input.nextInt();

        System.out.println("Enter the operation you want to perform on number");
        op = input.next().charAt(0);

        if( op == '+'||op == '-'||op == '*'||op == '/'||op == '%' )
        {
            if(op == '+')
            {
                System.out.println("answer of addition is " +(number1 + number2));
            }
            if(op == '-')
            {
                System.out.println("Answer of substract is "+(number1 - number2));
            }

            if(op == '*')
            {
                System.out.println("Answer of multiply is "+(number1 * number2));
            }

            if(op == '/')
            {
                System.out.println("Answer of divide is "+(number1 / number2));
            }

            if(op == '%')
            {
                System.out.println("Answer of modulo is "+(number1 % number2));
            }


        }

    }
}
