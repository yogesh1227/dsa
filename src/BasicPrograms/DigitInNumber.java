package BasicPrograms;

public class DigitInNumber {

    public static void main(String[] args) {

        int number = 123455455;
        int x = 9;
        int count =0;
        while(number>0)
        {
            int rem = number%10;
            if(rem == x)
            {
                count++;
            }
            number = number/10;
        }
        System.out.println(count);
    }
}
