package Search.binarysearch;

public class LargestElementInMountain {

    public static int binarySearch(int []arr)
    {
       int start = 0;
       int end = arr.length - 1;
    int mid = (start + end)/2;

       while(start <= end)
       {
          // int mid = (start + end)/2;
           if (arr[mid] < arr[mid +1])
           {
               start = mid +1;
               return arr[mid];

           }
           else if(arr[mid] > arr[mid])
           {
               end = mid -1;

//               end = mid +1;
               return arr[mid];

           }


       }
        return arr[mid];
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9};
        int target = 8;
        int ans = binarySearch(array);
        System.out.println("answer is --> "+ans);
    }
}
