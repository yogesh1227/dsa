package Arrays;

public class FindEvenNumberIntegrs {
    private static void finEvenNumberIntegers(int[] array){
        int len=array.length;
        int temp=0;
        int count=0;
        for (int i=0;i<len;i++){
            temp=0;
            while (array[i]!=0){

                array[i]=array[i]/10;
                temp=temp+1;
            }

            if (temp%2==0 && temp!=1){
                count++;
            }
        }
        System.out.println("Count is "+count);
    }
    public static void main(String[] args) {
        int[] arr={2,3,30,200000};
        finEvenNumberIntegers(arr);
    }
}
