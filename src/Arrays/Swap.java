package Arrays;

import java.util.Scanner;
import java.util.Arrays;


public class Swap {

        // created a function to swap the values
    public static void SwapFun(int []arr, int a ,int b)
    {
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println( "values after swap is " + arr[a] + " " +arr[b]);

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int [] arr = {1,2,3,4,5};
                   // 0,1,2,3,4
        SwapFun(arr, 4, 2);

//        for (int i = 0; i < arr.length;i++)
//        {
//            arr[i] = in.nextInt();
//
//        }

        System.out.println(Arrays.toString(arr));
    }
}
