package pattern;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the n");
        n = in.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
