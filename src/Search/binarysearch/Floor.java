package Search.binarysearch;

public class Floor {

    public static int floor(int arr[], int target){

        int start = 0;
        int end = arr.length-1;
        int mid=0;

        while(start <= end)
        {
            mid = (start + end)/2;

            if(target > arr[end])
            {
                return -1;
            }
            if(target == arr[mid])
            {
                return mid;
            }
            else if(target > arr[mid])
            {
                start = mid +1;
            }
            else if(target < arr[mid])
            {
                end = mid -1;
            }
//                else {
//                    return arr[mid+1];
//                }

        }
        return arr[mid];
//        return 0;
    }

    public static void main(String[] args) {

        int array[] = {1,3,5,7,8,9,11,15,17,20,21};
        int target = 7;

        int ans =  floor(array, target);
        System.out.println(ans);
    }

}
