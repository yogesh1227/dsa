package BasicPrograms;

public class FlipNumber {

    public static void main(String[] args) {

        int number = 12345;

        int newNumber =0;
        while(number>0)
        {
            int rem = number%10;
            // first time newNumber will be zero
            /*
            * therefor newnumber * 10 will zero
            * but 2nd step newnumber will 5 and after
            * multiply it will be 50 + rem
            * and so on and the number will be flipped
            *
            * */
            newNumber = (newNumber * 10 )+ rem;

            number = number/10;
        }
        System.out.println(newNumber);
    }
}
