package Search.orderagnosticbinarysearch;
import Search.binarysearch.binaryPractice;
public class orderAgnosticBinarySearch
{


    public static void main(String[] args)
    {


      //int[] array = {-18,0, 1, 2, 3, 4, 5, 6,7,8, 9,74};
       // int[] arr1 = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22,45,89};
        int [] array = {89, 45, 22, 18, 16, 15, 4,3,2,0,-4,-12,-18};
        int target = -18 ;

        int ans = agnosticBinarySearch(array, target);
        System.out.println("Location of the element is --> " + ans);

    }


    public static int agnosticBinarySearch(int[] arr, int target)
    {
    if (arr[0] < arr[1]) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (start + end)/2;
            if (arr[mid] < target) {
                start = mid +1;
            }
            else if(arr[mid] > target) {
                end = mid -1;
            } else if( arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
    else if(arr[0] > arr[1])
    {
        int start = 0;
        int end = arr.length -1;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if (target < arr[mid] ) {
                start = mid +1;
            }
            else if(target > arr[mid] ) {
                end = mid -1;
            } else if( arr[mid] == target) {
                return mid;
            }
        }
        return -1;

        }
return 0;
    }
}




