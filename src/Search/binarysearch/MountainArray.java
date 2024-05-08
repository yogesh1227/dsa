package Search.binarysearch;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

// in this we have to find the peak index.
public class MountainArray {

    public static int mountainArray(int []arr)
    {
        int start = 0;
        int end = arr.length - 1;
//       int mid = (start + end)/2;


        // so there are two cases
        //case1  if middle element is less then middle +1 that means we are in the increasing order of array so answer should
        // be on the right side of array as m+1 is grater so we take start = m+1;

        //case2 if m element is greater then the m+1 that means we are in descreasing part of array so we should take end as m
        // because we are not sure that m is biggest number or m-1 is biggest number
        while(start < end)
        {
            int mid = (start + end)/2;
            if (arr[mid] < arr[mid +1])
            {
                start = mid +1;
//               end = mid -1;
            }
            else
            {
                end = mid;
            }

        }
        return start;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9};
        int target = 8;
        int ans = mountainArray(array);
        System.out.println("answer is --> "+ans);
    }
}
