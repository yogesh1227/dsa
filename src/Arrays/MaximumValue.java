package Arrays;

public class MaximumValue {
    
    

    public static void main(String[] args) {
        
        int arr[] = {1,3,23,9,18};

        System.out.println(max(arr));
         
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for(int i = 0; i <arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
