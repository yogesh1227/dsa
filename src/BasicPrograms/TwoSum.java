package BasicPrograms;

public class TwoSum {

    public static int[] Sum(int[] nums, int target) {
        int [] ans = new int[2];
        ans[0]= -1;
        ans[1] = -1;

        for(int i = 0 ; i<nums.length;i++)
        {
            for(int j = i; j<nums.length;j++)
            {

                if(target == nums[i] + nums[j])
                {
                    ans[0]= i;
                    ans[1] = j;
                    return ans;
                }

            }

        }

return ans;
    }
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9 ;

        System.out.println(Sum(nums,target).toString());
    }
}
