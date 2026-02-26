class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1;
        for(int i=0;i<nums.length;i++)
        {
            int ind = Math.abs(nums[i])-1;

            if(nums[ind]<0)
            {
                dup = Math.abs(nums[i]);
            }
            else
            {
                nums[ind]=-nums[ind];
            }
        }
        int miss = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                miss=i+1;
            }
        }
        return new int[]{dup,miss};
    }
}