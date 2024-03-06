package Search.binarysearch;

public class FirstLastOccuranceOfNumber {
//    public static int binarySearch(int []arr, int target) {
//       int start = 0;
//       int end = arr.length - 1;
//      int mid = start + (end-start)/2;
//       while(start <= end) {
//
//           mid = (start + end)/2;
//           if (arr[mid] < target) {
//               start = mid +1;
//           }
//           else if(arr[mid] > target) {
//               end = mid -1;
//           } else if( arr[mid] == target)
//           {
//               return mid;
//           }
//       }
//        return -1;
//    }
// brute force solution
    // in this we have applied two different loops
    // the first loop will find the first element
    // the second loop will find the second element
    // but the time complexity is in the order of o(N);
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,5,6,6,6,6,6,6};
                     //0,1,2,3,4,5,6,7,8,9
        int target = 6;
        int k;
        for(int i =0; i<array.length;i++)
        {
            if(array[i] == target)
            {
                System.out.println("first occurance is " +i);
                break;
            }
        }

        for(int i =array.length-1;i>=0;i--)
        {
            if(array[i] == target)
            {
                System.out.println("last occurance is " +i);
                break;
            }
        }


//        int ans = binarySearch(array, target);
//        System.out.println("Location is --> "+ans);
    }
}
