
package Search.linearSearch;

import java.util.stream.*;


public class LinearSearch {
    // first take the number to find
    // take the array from which you have to find the number
    //
    public static int linearSearch(int []arr, int num)
    {
        for(int i = 0;i < arr.length-1; i++)
        {
            if( num == arr[i])
            {
//                System.out.println("number is at location " + arr[i]);
                    return i;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int[] array={2,5,88,99,100,29,0};
        int target=292;
        System.out.println(linearSearch(array,target));
    }
}
