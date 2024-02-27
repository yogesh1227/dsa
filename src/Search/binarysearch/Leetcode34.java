package Search.binarysearch;

public class Leetcode34 {

    public static int FirstLast(int arr[], int target)
    {
        int start = 0;
        int end = (arr.length - 1);
        while (start <= end) {

            int mid =  start + (end -  start) / 2;

            if (target == arr[mid])
            {
                return mid;
            }
            else if (target < arr[mid]) {
                end =  (mid - 1);
            } else if (target > arr[mid]) {
                start =  (mid + 1);
            }
        }return -1;
    }

    public static void main(String[] args)
    {
        int array[] = {0,5,5,5,5,5,5,5,5,10};
        int target = 5;
        System.out.println(FirstLast(array, target));
    }
}

