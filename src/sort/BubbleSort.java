package sort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSortLogic(int arr[]){
        boolean swapped = false;
        for(int i =0; i< arr.length-1;i++)
        {
            for(int j = 1; j< arr.length - i; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }

    public static void main(String[] args) {

        //int []arr = {5,4,3,2,1};

        int []arr = {1,2,3,4,5,6,7,8,9};

        bubbleSortLogic(arr);

        System.out.println(Arrays.toString(arr));

       // int ans = bubbleSortLogic(arr);
     //   System.out.println(ans);

    }
}
