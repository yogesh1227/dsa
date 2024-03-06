package Arrays;

public class EvenDigitQuestions {
    // in this we have an array and we have to find total no of number which are 2 digits;
    // so we use a for loop till the length of array and inside the for loop we are using the while loop
    // till the number greater then 0 and dividing the number by 10 and storing the result in variable temp
    // and in last we have a variable count , if the number stored in temp % 2 is zero we will increase the
    // count by 1 and in last we will print the count.
    public static int functionRequired(int [] arr){
       int count = 0;
       int temp = 0;
       for(int i= 0;i <arr.length;i++) {
           temp=0;
           while(arr[i] !=0) {
               arr[i] = arr[i]/10;
               temp = temp+1;
           }
           if(temp % 2 == 0) {
//               System.out.println("Inside 2nd if");
               count++;
           }
       }
        return count;
    }
    public static void main(String[] args) {
        int []arr = {10,20,30,4,5,60,7,8,9};
        int ans =   functionRequired(arr);
        System.out.println(" It contains "+ans+ " number");
    }
}
/*
class Solution
{
    public int findNumbers(int[] nums)
    {

        int count = 0;
        for (int num : nums)
        {
            if (hasEvenNumberOfDigits(num))
            {
                count++;
            }
        }
        return count;
    }

    public static boolean hasEvenNumberOfDigits(int num)
    {
        int digitCount = 0;
        while (num != 0)
        {
            num /= 10;
            digitCount++;
        }
        return digitCount % 2 == 0;
    }

 */
