class Solution {
    public int sum(int n)
    {
        int temp=0,sum=0;
        while(n!=0)
        {
            temp=n%10;
            sum+=temp;
            n/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(sum(nums[i])==i)
            {
                return i;
            }
        }
        return -1;
    }
}