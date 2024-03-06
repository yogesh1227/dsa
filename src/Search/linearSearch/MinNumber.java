package Search.linearSearch;

public class MinNumber {
    // in this we are finding the min number in the array
    // we are taking the first element in the array as min number
    // then we are appling a foor loop and comparing each element if the element in array is smaller we are
    // replacing the element as min element
    public static int number(int []arr) {
        int min = arr[0];
        for(int i =0;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,-10};
        int min = number(arr);

        System.out.println("minimum element is "+ min);

    }
}
