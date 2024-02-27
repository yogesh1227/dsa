package Search.binarysearch;

public class Leetcode744 {

    public static void main(String[] args)
    {

        char array[] = {'a','b','c','d','t','t'};
        char target = 'e';
        System.out.println(SmallestLetterGreaterThanTarget(array, target));
    }
    public static char SmallestLetterGreaterThanTarget(char arr[], char target)
    {
          int start = 0;
          int end = (arr.length - 1);
          while (start <= end) {
           int mid =  start + (end -  start) / 2;
            if (target < arr[mid]) {
                end =  (mid - 1);
            } else {
                start =  (mid + 1);
            }
        }return arr[start % arr.length];
    }
}
