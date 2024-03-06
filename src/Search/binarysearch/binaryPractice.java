package Search.binarysearch;

public class binaryPractice {

    public static int binarySearch(int []arr, int target)
    {
       int start = 0;
       int end = arr.length - 1;
//       int mid = (start + end)/2;

       while(start <= end)
       {
           int mid = (start + end)/2;
           if (arr[mid] < target)
           {
               start = mid +1;
//               end = mid -1;
           }
           else if(arr[mid] > target)
           {
               end = mid -1;

//               end = mid +1;
           } else if( arr[mid] == target)
           {
             return mid;
           }


       }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9};
        int target = 8;
        int ans = binarySearch(array, target);
        System.out.println("answer is --> "+ans);
    }
}
