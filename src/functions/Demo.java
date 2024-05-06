package functions;

public class Demo {

    public static void main(String[] args) {
       // System.out.println(1);
       // bell();
      //  name(3);
       // System.out.println(60);

       // int result = num(5);
       // System.out.println(result);

        String str = "yogesh";
        String str2 = "yogesh";

        String str3 = new String("yogesh");

        if(str == str3)
        {
            System.out.println("equal");
        }
        else{
            System.out.println("qwerty");
        }
    }

//    public static void bell(){
//
//        System.out.println(10);
//        System.out.println("kakkar");
//        System.out.println(60);
//    }

    public static void name(int n){
        for(int i=0;i<n;i++)
        {
            System.out.println("yogesh kakkar");
        }
    }
    public static int num(int s){
        int sum = 0;
        for(int n = 1; n<=s; n++)
        {
          sum  = sum + n;
        }
        return sum;

    }

}
