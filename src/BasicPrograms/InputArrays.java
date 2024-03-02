package BasicPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class InputArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[] = new int[5];

        for(int i = 0; i<5;i++)
        {
            arr[i] = input.nextInt();
        }
// three different ways to show the output of program
        // 1st one is with for-each loop
        for(int nums : arr)
        {
            System.out.print(nums + " ");
        }

        // 2nd is for loop

        for(int i = 0; i<5;i++)
        {
            System.out.println(arr[i] );
        }

        // 3rd one is toString method
        System.out.println(Arrays.toString(arr));
    }
}
