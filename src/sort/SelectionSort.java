package sort;

public class SelectionSort {

    public static void sortlogic(int[] arr)
    {
        int swap = 0;
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                swap = arr[i];
                arr[0] = arr[i+1];
                arr[i+1] = swap;

            }


        }
        System.out.println(arr.toString());

    }

    public static void main(String[] args) {

        int [] arr = {1,2,5,4,6,7, 3 ,8};
        sortlogic(arr);


    }
}
