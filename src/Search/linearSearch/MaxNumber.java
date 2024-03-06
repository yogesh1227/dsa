package Search.linearSearch;

public class MaxNumber {
    // in this we are finding the max number in the array
    // we are taking the first element in the array as max number
    // then we are appling a foor loop and comparing each element if the element in array is greater we are
    // replacing the element as max element
    public static int number(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3001,4,5,6,7,-10};
        int max = number(arr);

        System.out.println("maximum element is "+ max);

    }
}
