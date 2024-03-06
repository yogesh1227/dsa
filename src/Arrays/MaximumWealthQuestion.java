package Arrays;

//https://leetcode.com/problems/richest-customer-wealth/description/
public class MaximumWealthQuestion {


    public static int maximumWealth(int[][] accounts) {
//        int OuterSum=0;
//        int InnerLoopSum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++)
        {
            int sum=0;
            for(int j = 0; j<accounts[i].length;j++)
            {
                sum = sum + accounts[i][j];
//                System.out.println(sum);
            }
            if(max<sum)
                max=sum;

        }
        return max;

    }

    public static void main(String[] args) {

        int[][]accounts = {
                {1,2,3},{3,4}
//                {10,10}
        };
        int ans= maximumWealth(accounts);
        System.out.println(ans);

    }

}
