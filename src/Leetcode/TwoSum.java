package Leetcode;

public class TwoSum {

    // https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=rab78cw1
    public static void main(String[] args) {
//        sample comments

    }
        public int[] twoSum(int[] nums, int target) {

            for(int i=0;i<nums.length;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]+nums[j] == target)
                    {
                        return new int [] {i,j};
                    }

                }
            }
            return new int [] {0,0};
        }
    }

