//package Search.binarysearch;
//
//public class FirstLastOccuranceOfNumber {
//
//    public static int[] binarySearch(int []arr, int target)
//    {
//        int answer [] = {-1,-1};
//
//       int start = 0;
//       int end = arr.length - 1;
////       int mid = (start + end)/2;
//
//       while(start <= end)
//       {
//           int mid = (start + end)/2;
//           if (arr[mid] < target)
//           {
//               start = mid +1;
////               end = mid -1;
//           }
//           else if(arr[mid] > target)
//           {
//               end = mid -1;
//
////               end = mid +1;
//           } else if( arr[mid] == target)
//           {
//              // end = mid -1;
//           //  return mid;
//           }
//
//
//       }
//        return answer;
//    }
//
//
//    public static void main(String[] args) {
//        int[] array = {0,1,2,3,4,5,5,5,5,5};
//                     //0,1,2,3,4,5,6,7,8,9
//        int target = 5;
//        int ans = binarySearch(array, target);
//        System.out.println("Location is --> "+ans);
//    }
//}
