package Arrays;

public class Test {

    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5};
        int x = arr.length;
        int sum = 0;
        int min = arr[0];

        for(int i = 0; i < x ; i++)
        {
            sum = sum + i;
        }
        System.out.println("sum is "+ sum);

        for(int b = 0; b < x-1 ; b++)
        {
            if (arr[b] > arr[b+1])
            {
                    min= arr[b+1];
            }
        }
        System.out.println(" min number is "+min);
    }
}
