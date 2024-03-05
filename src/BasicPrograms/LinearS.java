package BasicPrograms;

public class LinearS {

    public static int linS(int arr[], int target) {
        for(int i = 0 ;i < arr.length;i++)
        {
            if(target == arr[i])
            {
//                System.out.println("location of the element is "+ i);
                return i;
            }

        }
    return -1;
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,66,77,33};
        int target = 50;
        int ans= linS(arr, target);
        System.out.println("location of element is "+ans);


    }
}
