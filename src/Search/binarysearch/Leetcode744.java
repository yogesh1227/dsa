package Search.binarysearch;

public class Leetcode744 {

    public static void main(String[] args)
    {

        char array[] = {'a','b','c','d','t','t'};
        char target = 't';
        System.out.println(SmallestLetterGreaterThanTarget(array, target));
    }
    public static char SmallestLetterGreaterThanTarget(char arr[], char target)
    {


        int start = 0;
        int end = (arr.length - 1);
        int mid = 0;

        while (start <= end) {
            mid =  ((start + end) / 2);

            // if (target > letters[end]) {
            //     return letters[0];
            // }
            if( target =='a' || target == 'z' || target == arr[end] )
            {
                return arr[0];
            }


            else if (target == arr[mid]) {

                return (arr[mid+1]);

            } else if (target > arr[mid]) {
                start =  (mid + 1);
            } else if (target < arr[mid]) {
                end =  (mid - 1);
            }

        }
        return arr[start];
    }


}
