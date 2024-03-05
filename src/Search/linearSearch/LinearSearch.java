
package Search.linearSearch;

import java.util.stream.*;


public class LinearSearch {
    // first take the number to find
    // take the array from which you have to find the number

    //in this we have created a function which takes int array and int target as input and then
    // use a for loop to traverse the elements in the array anf if it finds the location of array
    // it will return the index of it else it will return -1 so that target element does not exist in the
    // given array
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
